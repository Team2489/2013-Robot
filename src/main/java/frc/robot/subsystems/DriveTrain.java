// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.drive.RobotDriveBase.MotorType;
import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;

import frc.robot.Constants;

public class DriveTrain extends SubsystemBase {
  /** Creates a new ExampleSubsystem. */

  WPI_TalonSRX rightFrontMotor;
  WPI_TalonSRX rightBackMotor;
  WPI_TalonSRX leftFrontMotor;
  WPI_TalonSRX leftBackMotor;


  MotorControllerGroup rightMotors;
  MotorControllerGroup leftMotors;

  DifferentialDrive dDrive;
  public DriveTrain() {
    rightFrontMotor = new WPI_TalonSRX(Constants.TalonSRX_RightFront);
    rightBackMotor = new WPI_TalonSRX(Constants.TalonSRX_RightBack);
    leftFrontMotor = new WPI_TalonSRX(Constants.TalonSRX_LeftFront);
    leftBackMotor = new WPI_TalonSRX(Constants.TalonSRX_LeftBack);

    rightMotors = new MotorControllerGroup(rightFrontMotor, rightBackMotor);
    leftMotors = new MotorControllerGroup(leftFrontMotor, leftBackMotor);
  }


  public void stopMotors(){
    rightFrontMotor.set(0);
    rightBackMotor.set(0);
    leftFrontMotor.set(0);
    leftBackMotor.set(0);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }
}
