package edu.akester.eudaesense;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;


public class FourA extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_four_a);

        ImageView iv = (ImageView) findViewById(R.id.fourAImage);
        iv.setImageResource(R.drawable.intervention4a);
    }
}
