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

        bmiCalculate = new BMICalculate_impl();
        display = new Display_impl(bmiCalculate);

        tvBMI = findViewById(R.id.bmiText);
        tvComment = findViewById(R.id.commentText);

        etHeight = findViewById(R.id.height);
        etWeight = findViewById(R.id.weight);

        checkBox = findViewById(R.id.checkboxId);

    }
}