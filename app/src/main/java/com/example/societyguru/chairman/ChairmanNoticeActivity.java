package com.example.societyguru.chairman;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.societyguru.R;

public class ChairmanNoticeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chairman_notice);
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(ChairmanNoticeActivity.this,ChairmanDashboardActivity.class);
        startActivity(intent);
        finish();
    }
}