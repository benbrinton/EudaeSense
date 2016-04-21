package edu.akester.eudaesense;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;


public class ThreeD extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three_d);

        ImageView iv = (ImageView) findViewById(R.id.threeDImage);
        iv.setImageResource(R.drawable.intervention3d);
    }
}
