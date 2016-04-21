package edu.akester.eudaesense;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


public class GratitudePage extends AppCompatActivity {
    private static final String TAG = "GratitudePage";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(TAG, "onCreate");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gratitude_page);

        ImageView iv = (ImageView) findViewById(R.id.gratitudePageImage);
        iv.setImageResource(R.drawable.showinggratitude1);

        Button button1 = (Button)findViewById(R.id.Strength);
        button1.setBackgroundColor(Color.TRANSPARENT);
        button1.setTextColor(Color.TRANSPARENT);
    }

    //On click function
    public void strength(View view) {
        Log.d(TAG, "strength");
        Intent intent = new Intent(this, StrengthPage.class);
        startActivity(intent);
    }
}
