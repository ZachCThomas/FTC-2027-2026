package org.firstinspires.ftc.teamcode.teleop;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.subsystems.Drive.DriveSubsystem;
import org.firstinspires.ftc.teamcode.subsystems.Intake.IntakeSubsystem;

@TeleOp(name = "MecanumTeleOp")
public class Teleop extends OpMode {
    DriveSubsystem drive;
    IntakeSubsystem intake;

    @Override
    public void init() {

        drive = DriveSubsystem.getInstance(hardwareMap, gamepad1);
        intake = IntakeSubsystem.getInstance(hardwareMap, gamepad1);



        drive.init();
        intake.init();

    }
    public void loop() {

        drive.loop();
        intake.loop();

    }
}
