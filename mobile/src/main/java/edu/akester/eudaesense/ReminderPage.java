package edu.akester.eudaesense;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ReminderPage extends AppCompatActivity {
    private static final String TAG = "Reminder";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(TAG, "onCreate");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reminder_page);

        ImageView iv = (ImageView)findViewById(R.id.reminderPageImage);
        iv.setImageResource(R.drawable.positivereminder);

        Button button1 = (Button)findViewById(R.id.Reminder1);
        button1.setBackgroundColor(Color.TRANSPARENT);
        button1.setTextColor(Color.TRANSPARENT);

    }

    //On click function
    public void reminderOne(View view) {
        Log.d(TAG, "reminderOne");
        Intent intent = new Intent(this, ReminderOnePage.class);
        startActivity(intent);
    }

}

