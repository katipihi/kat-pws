package org.firstinspires.ftc.teamcode;


import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.AnalogInput;



@TeleOp public class readsensor  extends LinearOpMode {
private AnalogInput slay;

    @Override
    public void runOpMode() {
        slay = hardwareMap.analogInput.get("sensort");
        slay.resetDeviceConfigurationForOpMode();


        waitForStart();


        while (opModeIsActive()) {
            telemetry.addData("x", slay.getVoltage());


    }
    }
}

