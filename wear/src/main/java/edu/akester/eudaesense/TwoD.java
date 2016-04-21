package edu.akester.eudaesense;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;


public class TwoD extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two_d);

        ImageView iv = (ImageView) findViewById(R.id.twoDImage);
        iv.setImageResource(R.drawable.intervention2d);
    }
}
