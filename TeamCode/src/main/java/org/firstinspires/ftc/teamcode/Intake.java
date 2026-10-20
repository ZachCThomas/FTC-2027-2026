package org.firstinspires.ftc.teamcode;


import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Gamepad;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class Intake {
    private DcMotor intakeMotor;
    private HardwareMap hardwaremap;
    private Gamepad gamepad1;

    private Intake instance;

    private Intake(HardwareMap hardwareMap, Gamepad gamepad1){
        this.hardwaremap = hardwareMap;
        this.gamepad1 = gamepad1;
    }

    public Intake getInscance(HardwareMap hardwareMap, Gamepad gamepad1){
        if (instance == null){
            instance = new Intake(hardwareMap, gamepad1);
        }
        return instance;
    }

    public void init(){
        intake = hardwaremap.get(DcMotor.class, "intakeMotor");
    }

    public void loop(){
        if (gamepad1.b){
            intakeMotor.setPower(0.4);
        } else {
            intakeMotor.setPower(0);
        }
    }




}
