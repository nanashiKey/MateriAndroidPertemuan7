package com.project.dev.materiandroidpertemuan7;

import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

/**
 * created by Irfan Assidiq
 * email : assidiq.irfan@gmail.com
 **/
public class DetailKotaActivity extends AppCompatActivity {
    private String title, subtitle;
    TextView tvTitle, tvSubtitle;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailkota);
        tvTitle = findViewById(R.id.tvTitle);
        tvSubtitle = findViewById(R.id.tvSubtitle);

        Bundle bundle = getIntent().getExtras();
        if(bundle != null){
            title = bundle.getString("title");
            subtitle = bundle.getString("subtitle");
        }
        tvTitle.setText(title);
        tvSubtitle.setText(subtitle);
    }
}
