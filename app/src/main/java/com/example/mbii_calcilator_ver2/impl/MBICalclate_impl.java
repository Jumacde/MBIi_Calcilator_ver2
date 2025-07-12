package com.example.mbii_calcilator_ver2.impl;

import com.example.mbii_calcilator_ver2.MBICalclate;

public class MBICalclate_impl implements MBICalclate {
    private String height;
    private String weight;
    private double calcHeight;
    private double calcWeight;
    private double bmi;
    private double standardWeight;
    private double goalWeight;
    private boolean isInput;
    private boolean isA;


    public MBICalclate_impl() {
        this.bmi = 0;
        this.calcHeight = 0;
        this.calcWeight = 0;
        this.standardWeight = 0;
        this.goalWeight = 0;
        this.isInput = false;
        this.isA = false;
    }

    @Override
    public double getCalcHeight() {
        return calcHeight;
    }

    @Override
    public double getCalcWeight() {
        return calcWeight;
    }

    @Override
    public double getBmi() {
        return bmi;
    }

    @Override
    public double getStandardWeight() {
        return standardWeight;
    }

    @Override
    public double getGoalWeight() {
        return goalWeight;
    }

    @Override
    public boolean getIsInput() {
        return isInput;
    }

    @Override
    public boolean getIsA() {
        return isA;
    }

    @Override
    public void setCalcHeight(double calcHeight) {
        this.calcHeight = calcHeight;
    }

    @Override
    public void setCalcWeight(double calcWeight) {
        this.calcWeight = calcWeight;
    }

    @Override
    public void setBmi(double bmi) {
        this.bmi = bmi;
    }

    @Override
    public void setStandardWeight(double standardWeight) {
        this.standardWeight = calcHeight * calcHeight * 0.0022;;
    }

    @Override
    public void setGoalWeight(double goalWeight) {
        this.goalWeight = goalWeight;
    }

    @Override
    public void setIsInput(boolean isInput) {
        this.isInput = isInput;
    }

    @Override
    public void setIsA(boolean isA) {
        this.isA = isA;
    }

    // wrap methods
    @Override
    public void callCalcBmi() {
        calcBmi();
    }

    @Override
    public double callCalcGoalWeight() {
        return 0;
    }

    private void calcBmi() {

    }

    private void calcGoalWeight() {

    }

}
