package com.example.restful;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class TricklingInfo {

    private final long id;
    private final String materialNumber;
    private final String datetimeBefore;
    private final float weightBefore;
    private final String datetimeAfter;
    private final double weightAfter;
    private final String judgementResult;
    private final String robotMode;
    private final float preheatingTemperature;
    private final float solidificationTemperature;
    private final int temperatureTricklingArea;
    private final int fixtureNumber;
    private final int tricklingMachineCode;
    private final String judgementState;

    public TricklingInfo(long id, String materialNumber, String datetimeBefore, float weightBefore,
                         String datetimeAfter, double weightAfter, String judgementResult, String robotMode,
                         float preheatingTemperature, float solidificationTemperature, int temperatureTricklingArea,
                         int fixtureNumber, int tricklingMachineCode, String judgementState) {
        this.id = id;
        this.materialNumber = materialNumber;
        this.datetimeBefore = datetimeBefore;
        this.weightBefore = weightBefore;
        this.datetimeAfter = datetimeAfter;
        this.weightAfter = weightAfter;
        this.judgementResult = judgementResult;
        this.robotMode = robotMode;
        this.preheatingTemperature = preheatingTemperature;
        this.solidificationTemperature = solidificationTemperature;
        this.temperatureTricklingArea = temperatureTricklingArea;
        this.fixtureNumber = fixtureNumber;
        this.tricklingMachineCode = tricklingMachineCode;
        this.judgementState = judgementState;
    }


    public long getId() {
        return id;
    }

    public String getMaterialNumber() {
        return materialNumber;
    }

    public String getDatetimeBefore() {
        return datetimeBefore;
    }

    public float getWeightBefore() {
        return weightBefore;
    }

    public String getDatetimeAfter() {
        return datetimeAfter;
    }

    public double getWeightAfter() {
        return weightAfter;
    }

    public String getJudgementResult() {
        return judgementResult;
    }

    public String getRobotMode() {
        return robotMode;
    }

    public float getPreheatingTemperature() {
        return preheatingTemperature;
    }

    public float getSolidificationTemperature() {
        return solidificationTemperature;
    }

    public int getTemperatureTricklingArea() {
        return temperatureTricklingArea;
    }

    public int getFixtureNumber() {
        return fixtureNumber;
    }

    public int getTricklingMachineCode() {
        return tricklingMachineCode;
    }

    public String getJudgementState() {
        return judgementState;
    }
}
