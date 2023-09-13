package frc.robot.commands;

import java.util.function.DoubleSupplier;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.DriveTrain;

public class DriveArcade {
    DriveTrain drivetrain = null;
    DoubleSupplier speed = null;
    DoubleSupplier rotation = null;
    XboxController xboxController = null;
    double creepRotationLimit = 0.0;
    double creepLimit = 0.0;
    double fastLimit = 0.0;

    public DriveArcade(DriveTrain drivetrain, DoubleSupplier speed, DoubleSupplier rotation, XboxController xboxController, double creepRotationLimit, double creepLimit, double fastLimit) {
        // addRequirements add subsystem dependencies
        this.drivetrain = drivetrain;
        this.speed = speed;
        this.rotation = rotation;
        this.xboxController = xboxController;
        this.creepRotationLimit = creepRotationLimit;
        this.creepLimit = creepLimit;
        this.fastLimit = fastLimit;
        addRequirements(drivetrain);
    }
}
