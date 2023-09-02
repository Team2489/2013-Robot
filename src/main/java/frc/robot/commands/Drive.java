package frc.robot.commands;

import frc.robot.subsystems.DriveTrain;
import edu.wpi.first.wpilibj2.command.CommandBase;

public class Drive extends CommandBase {
    DriveTrain driveTrain;
    double power;
    double rotation;

    public Drive(DriveTrain driveTrain, double power, double rotation) {
        this.driveTrain = driveTrain;
        this.power = power;
        this.rotation = rotation;
        addRequirements(driveTrain);
    }

    // Called when the command is initially scheduled.
    @Override
    public void initialize() {
        // driveTrain.arcadeDrive(power, rotation);
        System.out.println("init");
    }

    // Called every time the scheduler runs while the command is scheduled.
    @Override
    public void execute() {
        // driveTrain.arcadeDrive(power, rotation);
        System.out.println("exec");
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