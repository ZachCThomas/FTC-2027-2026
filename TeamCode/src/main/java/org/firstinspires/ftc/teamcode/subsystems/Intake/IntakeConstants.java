package org.firstinspires.ftc.teamcode.subsystems.Intake;

public class IntakeConstants {
    public enum intakeState {
        INTAKE(1),
        OUTTAKE(-1),
        STOP(0);

        private double power;


        private intakeState(double power) {
            this.power = power;
        }

        public double getPower() {
            return power;
        }
    }
}
