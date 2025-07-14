package com.example.mbii_calcilator_ver2.impl;

import com.example.mbii_calcilator_ver2.BMICalculate;
import com.example.mbii_calcilator_ver2.ButtonController;

public class ButtonController_impl implements ButtonController {
    private final BMICalculate bmiCalculate;

    public ButtonController_impl(BMICalculate bmiCalculate) {
        this.bmiCalculate = bmiCalculate;
    }

    @Override
    public void callPushSubmitButton() {
        pushSubmitButton();
    }

    private void pushSubmitButton() {
        /*
        *         String height = bmiCalculate.getHeight();
        String weight = bmiCalculate.getWeight();
        double calcHeight = bmiCalculate.getCalcHeight();
        double calcWeight = bmiCalculate.getCalcWeight();
        double bmi = bmiCalculate.getBmi();
        boolean isInput = bmiCalculate.getIsInput();
        * */
        bmiCalculate.setIsInput(true);

        bmiCalculate.callCalcBmi();
    }


}
