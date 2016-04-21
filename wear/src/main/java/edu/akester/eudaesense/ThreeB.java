package edu.akester.eudaesense;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;


public class ThreeB extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three_b);

        ImageView iv = (ImageView) findViewById(R.id.threeBImage);
        iv.setImageResource(R.drawable.intervention3b);
    }
}
