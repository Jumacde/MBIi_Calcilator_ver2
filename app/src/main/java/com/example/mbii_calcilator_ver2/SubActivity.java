package com.example.mbii_calcilator_ver2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

/**
 * control menu tab
 * **/
public class SubActivity extends AppCompatActivity {
    private DrawerLayout drawerLayout;
    private Button button;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.sub_page);

        clickButton(R.id.bAboutThisApp);
        clickButton(R.id.bAboutBMI);
        clickButton(R.id.bAboutNutritionalStatus);
    }

    private void clickButton(int buttonId) {
        button = findViewById(buttonId);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawerLayout.openDrawer(GravityCompat.END);
            }
        });

    }

}
