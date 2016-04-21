package edu.akester.eudaesense;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


public class FeedbackPage extends AppCompatActivity {
    private static final String TAG = "FeedbackPage";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(TAG, "onCreate");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback_page);

        ImageView iv = (ImageView) findViewById(R.id.feedbackPageImage);
        iv.setImageResource(R.drawable.dandelions5);

        Button button1 = (Button)findViewById(R.id.Back);
        button1.setBackgroundColor(Color.TRANSPARENT);
        button1.setTextColor(Color.TRANSPARENT);
    }

    //On click function
    public void back(View view) {
        Log.d(TAG, "back");
        Intent intent = new Intent(this, HomePage.class);
        startActivity(intent);
    }
}
