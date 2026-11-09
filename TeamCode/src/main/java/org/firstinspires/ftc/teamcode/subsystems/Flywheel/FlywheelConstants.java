
package org.firstinspires.ftc.teamcode.subsystems.Flywheel;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

public class FlywheelConstants {

    // Motor hardware configuration name
    public static final String MOTOR_NAME = "flywheel";

    // Reversed from supplied configuration
    public static final DcMotorSimple.Direction MOTOR_DIRECTION =
            DcMotorSimple.Direction.FORWARD;

    // Velocity control using motor encoder
    public static final DcMotor.RunMode RUN_MODE =
            DcMotor.RunMode.RUN_USING_ENCODER;

    // Allow flywheel to coast when stopped
    public static final DcMotor.ZeroPowerBehavior ZERO_POWER_BEHAVIOR =
            DcMotor.ZeroPowerBehavior.FLOAT;

    // Velocity in encoder ticks per second
    public static final double SHOOT_VELOCITY_TPS = 1160.0;

    // Allowed velocity error
    public static final double VELOCITY_TOLERANCE_TPS = 20.0;

    public static final double FLYWHEEL_TRIGGER_THRESHOLD = 0.25;

    private FlywheelConstants() {}
}
