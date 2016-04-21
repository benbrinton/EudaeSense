package edu.akester.eudaesense;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;


public class OneB extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one_b);

        ImageView iv = (ImageView) findViewById(R.id.oneBImage);
        iv.setImageResource(R.drawable.intervention1b);
    }
}
