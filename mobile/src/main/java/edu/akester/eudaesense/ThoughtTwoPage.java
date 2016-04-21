package edu.akester.eudaesense;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


public class ThoughtTwoPage extends AppCompatActivity {
    private static final String TAG = "ThoughtTwoPage";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(TAG, "onCreate");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thought2_page);

        ImageView iv = (ImageView)findViewById(R.id.thought2PageImage);
        iv.setImageResource(R.drawable.changingperspective3);

        Button button1 = (Button)findViewById(R.id.Thought3);
        button1.setBackgroundColor(Color.TRANSPARENT);
        button1.setTextColor(Color.TRANSPARENT);

        Button button2 = (Button)findViewById(R.id.Back);
        button2.setBackgroundColor(Color.TRANSPARENT);
        button2.setTextColor(Color.TRANSPARENT);
    }

    //On click function
    public void thoughtThree(View view) {
        Log.d(TAG, "thoughtThree");
        Intent intent = new Intent(this, ThoughtThreePage.class);
        startActivity(intent);
    }

    //On click function
    public void back(View view) {
        Log.d(TAG, "back");
        Intent intent = new Intent(this, HomePage.class);
        startActivity(intent);
    }
}
