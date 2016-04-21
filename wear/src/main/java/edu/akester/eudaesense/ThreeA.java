package edu.akester.eudaesense;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;


public class ThreeA extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three_a);

        ImageView iv = (ImageView) findViewById(R.id.threeAImage);
        iv.setImageResource(R.drawable.intervention3a);
    }
}
