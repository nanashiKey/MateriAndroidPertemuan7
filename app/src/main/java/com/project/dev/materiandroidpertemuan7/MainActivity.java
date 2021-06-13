package com.project.dev.materiandroidpertemuan7;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.project.dev.materiandroidpertemuan7.fragments.FragmentHome;
import com.project.dev.materiandroidpertemuan7.fragments.FragmentMessage;
import com.project.dev.materiandroidpertemuan7.fragments.FragmentProfile;

public class MainActivity extends AppCompatActivity {

    private FrameLayout frlayout;
    private BottomNavigationView menubottom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        frlayout = findViewById(R.id.frLayout);
        menubottom = findViewById(R.id.menubottom);

        settingFragment(new FragmentMessage());
        menubottom.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                if(item.getItemId() == R.id.menu1){
                    settingFragment(new FragmentMessage());
                }else if(item.getItemId() == R.id.menu2){
                    settingFragment(new FragmentHome());
                }else{
                    settingFragment(new FragmentProfile());
                }
                return true;
            }
        });
    }

    private void settingFragment(Fragment fr){
        FragmentManager frManager = getSupportFragmentManager();
        frManager.beginTransaction()
                .replace(R.id.frLayout, fr)
                .commit();
    }
}