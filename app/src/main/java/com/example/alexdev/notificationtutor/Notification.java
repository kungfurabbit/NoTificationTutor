package com.example.alexdev.notificationtutor;

import android.app.NotificationManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Notification extends AppCompatActivity {
    private NotificationManager notificationManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);

        notificationManager = getApplicationContext().getSystemService();

    }

    public  void ShowNotification(View view){

    }
}
