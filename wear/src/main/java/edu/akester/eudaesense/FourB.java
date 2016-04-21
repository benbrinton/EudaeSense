package edu.akester.eudaesense;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;


public class FourB extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_four_b);

        ImageView iv = (ImageView) findViewById(R.id.fourBImage);
        iv.setImageResource(R.drawable.intervention4b);
    }
}
