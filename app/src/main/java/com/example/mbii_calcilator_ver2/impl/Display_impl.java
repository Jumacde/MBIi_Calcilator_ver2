package com.example.mbii_calcilator_ver2.impl;

import com.example.mbii_calcilator_ver2.Display;
import com.example.mbii_calcilator_ver2.MBICalclate;

public class Display_impl implements Display {
    private final MBICalclate mbiCalclate;
    private String bmiDisplay;
    private String commentDisplay;
    private double num;

    public Display_impl(MBICalclate mbiCalclate) {
        this.mbiCalclate = mbiCalclate;

    }

    @Override
    public String getBmiDisplay() {
        return bmiDisplay;
    }

    @Override
    public String getCommentDisplay() {
        return commentDisplay;
    }

    @Override
    public void setBmiDisplay(String bmiDisplay) {
        this.bmiDisplay = bmiDisplay;
    }

    @Override
    public void setCommentDisplay(String commentDisplay) {
        this.commentDisplay = commentDisplay;
    }

    // wrap methods
    @Override
    public void callClearDisplay() {

    }

    @Override
    public String callShowBMI() {
        return "";
    }

    @Override
    public String callShowComment() {
        return "";
    }

    @Override
    public String callShowGoalWeight() {
        return "";
    }

    @Override
    public String callFormatNumber(double num) {
        return "";
    }
}
