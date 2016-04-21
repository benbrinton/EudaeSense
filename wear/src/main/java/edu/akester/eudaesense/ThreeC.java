package edu.akester.eudaesense;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;


public class ThreeC extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three_c);

        ImageView iv = (ImageView) findViewById(R.id.threeCImage);
        iv.setImageResource(R.drawable.intervention3c);
    }
}
