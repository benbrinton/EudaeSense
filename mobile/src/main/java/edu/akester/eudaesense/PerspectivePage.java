package edu.akester.eudaesense;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


public class PerspectivePage extends AppCompatActivity {
    private static final String TAG = "Perspective";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(TAG, "onCreate");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perspective_page);

        ImageView iv = (ImageView)findViewById(R.id.perspectivePageImage);
        iv.setImageResource(R.drawable.changingperspective1);

        Button button1 = (Button)findViewById(R.id.Thought1);
        button1.setBackgroundColor(Color.TRANSPARENT);
        button1.setTextColor(Color.TRANSPARENT);

    }

    //On click function
    public void thoughtOne(View view) {
        Log.d(TAG, "thoughtOne");
        Intent intent = new Intent(this, ThoughtOnePage.class);
        startActivity(intent);
    }

}
