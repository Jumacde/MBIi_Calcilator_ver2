package com.example.mbii_calcilator_ver2;

import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.mbii_calcilator_ver2.fragmentControl.FragmentActivityBMI;
import com.example.mbii_calcilator_ver2.fragmentControl.FragmentActivityClassification;
import com.example.mbii_calcilator_ver2.fragmentControl.FragmentActivityThisApp;

/**
 * control menu tab
 * **/
public class SubActivity extends AppCompatActivity {
    private DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.sub_page);
        drawerLayout = findViewById(R.id.subDrawer_layout);

        setupButtonClickListeners();

    }

    private void loadFragment(Fragment fragment) {
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.fragment_container, fragment);
        ft.addToBackStack(null);
        ft.commit();
    }

    private void setupButtonClickListeners( ) {
        findViewById(R.id.bAboutThisApp).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadFragment(new FragmentActivityThisApp());
            }
        });

        findViewById(R.id.bAboutBMI).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadFragment(new FragmentActivityBMI());
            }
        });

        findViewById(R.id.bAboutNutritionalStatus).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadFragment(new FragmentActivityClassification());
            }
        });

    }


}
