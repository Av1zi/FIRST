// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems.Elevator;

import com.ctre.phoenix6.controls.Follower;
import com.ctre.phoenix6.hardware.TalonFX;

import edu.wpi.first.wpilibj.motorcontrol.Talon;
import edu.wpi.first.wpilibj2.command.SubsystemBase;



public class Elevator extends SubsystemBase {

  private TalonFX m_motor;
  private Follower m_Follower;

  /** Creates a new Elevator. */
  private Elevator() {
    m_Follower = new Follower(0, false);
    m_motor = new TalonFX(MOTOR_ID);
  }
  
  // singleton
  private static Elevator instance;
  public static Elevator getInstance(){
    if(instance == null){
      instance = new Elevator();
    }
    return instance;
  }

  


  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
