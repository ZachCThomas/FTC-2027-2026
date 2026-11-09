package org.firstinspires.ftc.teamcode.subsystems.Indexer;
import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.hardware.Gamepad;
import com.qualcomm.robotcore.hardware.HardwareMap;
import org.firstinspires.ftc.teamcode.subsystems.Intake.IntakeConstants.intakeState;
import org.firstinspires.ftc.teamcode.subsystems.Intake.IntakeConstants;


public class IndexerSubsystem {
    private Gamepad gamepad1;
    private HardwareMap hardwareMap;

    private intakeState state;
    private CRServo indexerServo;
    private boolean previousX;
    private static IndexerSubsystem instance;
    private boolean flipflop;

    private IndexerSubsystem(HardwareMap hardwareMap, Gamepad gamepad1){
        this.hardwareMap = hardwareMap;
        this.gamepad1 = gamepad1;
    }

    public static IndexerSubsystem getInstance(HardwareMap hardwareMap, Gamepad gamepad1){
        if(instance == null){
            instance = new IndexerSubsystem(hardwareMap, gamepad1);
        }
        return instance;
    }
    public void setState(intakeState state){
        this.state = state;
        indexerServo.setPower(state.getPower());
    }
    public void init(){

        indexerServo = hardwareMap.get(CRServo.class,"indexerServo");
        indexerServo.setPower(0);
         previousX = false;
         flipflop = false;

    }

    public void loop(){
        boolean x = gamepad1.x;
        boolean xPressed = x && !previousX;

        if (xPressed) {
            flipflop = !flipflop;

            if (flipflop) {
                setState(IntakeConstants.intakeState.INTAKE);
            } else {
                setState(IntakeConstants.intakeState.STOP);
            }
        }
        previousX = x;
    }
}
