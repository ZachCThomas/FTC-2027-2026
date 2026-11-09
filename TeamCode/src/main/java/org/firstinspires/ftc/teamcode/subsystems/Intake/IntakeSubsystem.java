package org.firstinspires.ftc.teamcode.subsystems.Intake;


import static org.firstinspires.ftc.robotcore.external.BlocksOpModeCompanion.telemetry;

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

    boolean previousLeftBumper;
    boolean previousRightBumper;


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
        previousRightBumper = false;
        previousLeftBumper = false;
    }

    public void loop(){
        boolean leftBumper = gamepad1.left_bumper;
        boolean rightBumper = gamepad1.right_bumper;
        boolean leftBumperPressed = leftBumper && !previousLeftBumper;
        boolean rightBumperPressed = rightBumper && !previousRightBumper;

        if (leftBumper && rightBumper) {
            setState(intakeState.STOP);
        } else if (leftBumperPressed) {
            setState(intakeState.INTAKE);
        } else if (rightBumperPressed) {
            setState(intakeState.OUTTAKE);
        }

        previousLeftBumper = leftBumper;
        previousRightBumper = rightBumper;
//        if (gamepad1.a&& !x){
//            setState(intakeState.INTAKE);
//            x = true;
//            y = false;
//        } else  if (gamepad1.b && !y){
//            setState(intakeState.OUTTAKE);
//            y = true;
//            x = false;
//        } else if ((gamepad1.b && y) || (gamepad1.a && x)) {
//            setState(IntakeConstants.intakeState.STOP);
//            x = false;
//            y = false;
//        }
//         telemetry.addData( "intake state", intakeMotor.getPower());
    }




}
