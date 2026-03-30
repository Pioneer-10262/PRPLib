package com.github.pioneerredpanthers.prplib.robot.opmode;

import com.github.pioneerredpanthers.prplib.command.commandscheduler.CommandScheduler;
import com.github.pioneerredpanthers.prplib.robot.Robot;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name = "PRP TELEOP")
public final class PRPTeleOp extends OpMode {
    private Robot robot;
    private CommandScheduler scheduler;

    @Override
    public void init() {
        robot = Robot.getInstance();
        scheduler = CommandScheduler.getInstance();

        robot.teleopInit();
    }

    @Override
    public void loop() {
        scheduler.run();
    }
}
