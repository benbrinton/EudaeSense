package edu.akester.eudaesense;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;


public class TwoB extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two_b);

        ImageView iv = (ImageView) findViewById(R.id.twoBImage);
        iv.setImageResource(R.drawable.intervention2b);
    }
}
