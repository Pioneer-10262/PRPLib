package com.github.pioneerredpanthers.prplib.robot.opmode;

import com.github.pioneerredpanthers.prplib.command.commandscheduler.CommandScheduler;
import com.github.pioneerredpanthers.prplib.robot.Robot;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;

@Autonomous(name = "PRP AUTON")
public final class PRPAutonomous extends OpMode {
    private Robot robot;
    private CommandScheduler scheduler;

    @Override
    public void init() {
        robot = Robot.getInstance();
        scheduler = CommandScheduler.getInstance();

        robot.autonomousInit();
        robot.getAutonomousCommand().schedule();
    }

    @Override
    public void loop() {
        scheduler.run();
    }
}
