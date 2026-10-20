package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name = "MecanumTeleOp")
public class Teleop extends LinearOpMode {
    Drive drive;

    @Override
    public void runOpMode() {
        drive = Drive.getInstance(hardwareMap, gamepad1);
        //change??? idk

        drive.init();


        waitForStart();

        while (opModeIsActive()) {

            drive.loop();


        }
    }
}
