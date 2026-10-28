package org.firstinspires.ftc.teamcode.subsystems.Intake;


import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Gamepad;
import com.qualcomm.robotcore.hardware.HardwareMap;
import org.firstinspires.ftc.teamcode.subsystems.Intake.IntakeConstants.intakeState;
import org.firstinspires.ftc.teamcode.subsystems.Intake.IntakeConstants;

public class IntakeSubsystem {
    private DcMotor intakeMotor;
    private HardwareMap hardwareMap;
    private Gamepad gamepad1;
    private static IntakeSubsystem instance;
    private intakeState state;



    private IntakeSubsystem(HardwareMap hardwareMap, Gamepad gamepad1){
        this.hardwareMap = hardwareMap;
        this.gamepad1 = gamepad1;

    }
    public void setState(intakeState state){
        this.state = state;
        intakeMotor.setPower(state.getPower());
    }

    public static IntakeSubsystem getInstance(HardwareMap hardwareMap, Gamepad gamepad1){
        if (instance == null){
            instance = new IntakeSubsystem(hardwareMap, gamepad1);
        }
        return instance;
    }

    public void init(){

        intakeMotor = hardwareMap.get(DcMotor.class, "intakeMotor");
        setState(intakeState.STOP);
    }

    public void loop(){
        if (gamepad1.b){
            setState(intakeState.INTAKE);
        } else  if (gamepad1.a){
            setState(intakeState.OUTTAKE);
        } else {
            setState(IntakeConstants.intakeState.STOP);
        }
    }




}
