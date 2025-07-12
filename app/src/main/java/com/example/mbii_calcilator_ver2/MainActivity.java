package com.example.mbii_calcilator_ver2;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.example.mbii_calcilator_ver2.impl.BMICalculate_impl;
import com.example.mbii_calcilator_ver2.impl.Display_impl;

public class MainActivity extends AppCompatActivity {
    private TextView tvBMI, tvComment;
    private EditText etHeight, etWeight;
    private CheckBox checkBox;
    private Button button;

    private BMICalculate bmiCalculate;
    private Display display;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.main_page);

        tvBMI = findViewById(R.id.bmiText);
        tvBMI.setText("0");
        tvComment = findViewById(R.id.commentText);
        tvComment.setText("");

        etHeight = (EditText) findViewById(R.id.height);
        etHeight.setText("0cm");
        etWeight = (EditText) findViewById(R.id.weight);
        etWeight.setText("0kg");

        checkBox = findViewById(R.id.checkboxId);

        bmiCalculate = new BMICalculate_impl();
        display = new Display_impl(bmiCalculate);


    }
}