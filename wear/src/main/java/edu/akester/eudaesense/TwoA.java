package edu.akester.eudaesense;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;


public class TwoA extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two_a);

        ImageView iv = (ImageView) findViewById(R.id.twoAImage);
        iv.setImageResource(R.drawable.intervention2a);
    }
}
