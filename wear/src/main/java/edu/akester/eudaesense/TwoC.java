package edu.akester.eudaesense;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;


public class TwoC extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two_c);

        ImageView iv = (ImageView) findViewById(R.id.twoCImage);
        iv.setImageResource(R.drawable.intervention2c);
    }
}
