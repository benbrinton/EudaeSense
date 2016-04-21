package edu.akester.eudaesense;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


public class StrengthPage extends AppCompatActivity {
    private static final String TAG = "StrengthPage";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(TAG, "onCreate");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_strength_page);

        ImageView iv = (ImageView) findViewById(R.id.strengthPageImage);
        iv.setImageResource(R.drawable.mystrengths1);

        Button button1 = (Button)findViewById(R.id.Forward);
        button1.setBackgroundColor(Color.TRANSPARENT);
        button1.setTextColor(Color.TRANSPARENT);
    }

    //On click function
    public void forward(View view) {
        Log.d(TAG, "forward");
        Intent intent = new Intent(this, ForwardPage.class);
        startActivity(intent);
    }
}
