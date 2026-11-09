package org.firstinspires.ftc.teamcode.auto.blue;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

import com.pedropathing.follower.Follower;
import org.firstinspires.ftc.teamcode.pedro.Constants;
@Autonomous
public class Auto1 extends OpMode {

    private Follower follower; // Add this

    @Override
    public void init() {
        follower = Constants.create(hardwareMap);
    }
    @Override
    public void start() {
    }
    @Override
    public void loop() {
    }
}
