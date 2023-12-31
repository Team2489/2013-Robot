// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide
 * numerical or boolean
 * constants. This class should not be used for any other purpose. All constants
 * should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>
 * It is advised to statically import this class (or one of its inner classes)
 * wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
  public static class OperatorConstants {
    public static final int kDriverControllerPort = 0;
    // Add motor ids

  }

  public static final int TalonSRX_RightFront = 1;
  public static final int TalonSRX_RightBack = 2;
  public static final int TalonSRX_LeftFront = 3;
  public static final int TalonSRX_LeftBack = 4;
  public static final int TalonSRX_TopRight = 21;
  public static final int TalonSRX_TopLeft = 22;
  public static final int XBOX_CONTROLLER_PORT = 0;
  public static final int XBOX_CONTROLLER_PORT_2 = 1;
}
