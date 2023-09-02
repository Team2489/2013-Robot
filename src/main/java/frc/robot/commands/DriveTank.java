package frc.robot.commands;

import frc.robot.subsystems.DriveTrain;
import java.util.function.DoubleSupplier;
import edu.wpi.first.wpilibj2.command.CommandBase;

public class DriveTank extends CommandBase {
    DriveTrain driveTrain;
    DoubleSupplier right;
    DoubleSupplier left;

    public DriveTank(DriveTrain driveTrain, DoubleSupplier right, DoubleSupplier left) {
        this.driveTrain = driveTrain;
        this.right = right;
        this.left = left;
        addRequirements(driveTrain);
    }

    // Called when the command is initially scheduled.
    @Override
    public void initialize() {
    }

    // Called every time the scheduler runs while the command is scheduled.
    @Override
    public void execute() {
        // driveTrain.tankDrive(filter.calculate(right.getAsDouble())*0.5,
        // filter1.calculate(left.getAsDouble())*0.5);
    }

    // Called once the command ends or is interrupted.
    @Override
    public void end(boolean interrupted) {
    }

    // Returns true when the command should end.
    @Override
    public boolean isFinished() {
        return false;
    }

}