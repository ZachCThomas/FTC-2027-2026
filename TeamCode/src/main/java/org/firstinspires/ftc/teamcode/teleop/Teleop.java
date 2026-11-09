package org.firstinspires.ftc.teamcode.teleop;

import com.pedropathing.follower.Follower;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.pedro.Constants;
import org.firstinspires.ftc.teamcode.subsystems.Drive.DriveSubsystem;
import org.firstinspires.ftc.teamcode.subsystems.Indexer.IndexerSubsystem;
import org.firstinspires.ftc.teamcode.subsystems.Intake.IntakeSubsystem;
import org.firstinspires.ftc.teamcode.subsystems.Shooter.FlywheelSubsystem;
// 13, 23, 18, 7, 38

@TeleOp(name = "MecanumTeleOp")
public class Teleop extends OpMode {
    DriveSubsystem drive;
//    private Follower follower;
    IndexerSubsystem indexer;
    IntakeSubsystem intake;
    FlywheelSubsystem flywheel;

    @Override
    public void init() {

//        follower = Constants.create(hardwareMap);
        indexer = IndexerSubsystem.getInstance(hardwareMap, gamepad1);
        drive = DriveSubsystem.getInstance(hardwareMap, gamepad1);
        intake = IntakeSubsystem.getInstance(hardwareMap, gamepad1);
        flywheel = FlywheelSubsystem.getInstance(hardwareMap, gamepad1);



        drive.init();
        intake.init();
        indexer.init();
        flywheel.init();

    }
    @Override
    public void init_loop(){

    }
    @Override
    public void start(){

    }
    @Override
    public void loop() {

        drive.loop();
        intake.loop();
        indexer.loop();
        flywheel.loop();

    }
    @Override
    public void stop(){

    }
}
