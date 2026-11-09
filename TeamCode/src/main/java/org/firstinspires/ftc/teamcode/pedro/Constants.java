package org.firstinspires.ftc.teamcode.pedro;

import com.pedropathing.algorithm.Foresight;
import com.pedropathing.follower.Follower;
import com.pedropathing.localization.Localizer;
import com.pedropathing.revhub.drivetrains.Mecanum;
import com.pedropathing.revhub.drivetrains.MecanumConfig;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.pedropathing.tuning.autotune.Procedure;
import com.pedropathing.tuning.autotune.Tuner;
import org.firstinspires.ftc.teamcode.subsystems.Drive.DriveConstants;

public class Constants {

    public static MecanumConfig driveConfig = new MecanumConfig(
            c -> {
                c.frontLeftName.set(DriveConstants.FRONT_LEFT_MOTOR_NAME);
                c.backLeftName.set(DriveConstants.BACK_LEFT_MOTOR_NAME);
                c.frontRightName.set(DriveConstants.FRONT_RIGHT_MOTOR_NAME);
                c.backRightName.set(DriveConstants.BACK_RIGHT_MOTOR_NAME);

                c.frontLeftDirection.set(DcMotorSimple.Direction.FORWARD);
                c.backLeftDirection.set(DcMotorSimple.Direction.FORWARD);
                c.frontRightDirection.set(DcMotorSimple.Direction.FORWARD);
                c.backRightDirection.set(DcMotorSimple.Direction.FORWARD);

                c.manualBrakeMode.set(true);
            }
    );
    public static Follower create(HardwareMap h) {
         return new Follower(
                 null,new Mecanum(h, driveConfig), null);
//        return null;
    }
}