package edu.akester.eudaesense;


import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ReminderOnePage extends AppCompatActivity {
    private static final String TAG = "ReminderOnePage";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(TAG, "onCreate");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reminder1_page);

        ImageView iv = (ImageView)findViewById(R.id.reminder1PageImage);
        iv.setImageResource(R.drawable.positivereminder2);

        Button button1 = (Button)findViewById(R.id.Reminder2);
        button1.setBackgroundColor(Color.TRANSPARENT);
        button1.setTextColor(Color.TRANSPARENT);

        Button button2 = (Button)findViewById(R.id.Back);
        button2.setBackgroundColor(Color.TRANSPARENT);
        button2.setTextColor(Color.TRANSPARENT);

    }

    //On click function
    public void reminderTwo(View view) {
        Log.d(TAG, "reminderTwo");
        Intent intent = new Intent(this, ReminderTwoPage.class);
        startActivity(intent);
    }

    //On click function
    public void back(View view) {
        Log.d(TAG, "back");
        Intent intent = new Intent(this, HomePage.class);
        startActivity(intent);
    }
}
