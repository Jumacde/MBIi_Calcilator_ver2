package com.example.mbii_calcilator_ver2;

public interface DisplayController {
    // getter
    String getBmiDisplay();
    String getCommentDisplay();
    // setter
    void setBmiDisplay(String bmiDisplay);
    void setCommentDisplay(String commentDisplay);
    // wrap methods
    void callClearDisplay();
    String callShowBMI();
    String callShowComment();
    String callShowGoalWeight();
    String callFormatNumber(double num);
}
