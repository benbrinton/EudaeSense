package edu.akester.eudaesense;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.GestureDetectorCompat;
import android.support.v4.view.MotionEventCompat;
import android.util.Log;
import android.view.GestureDetector;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.ImageView;
import android.widget.Toast;


public class OneA extends Activity {
    private static final String TAG = "OneA";
    private float x1,x2;
    static final int MIN_DISTANCE = 5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(TAG, "onCreate");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two_a);

        ImageView iv = (ImageView) findViewById(R.id.twoAImage);
        iv.setImageResource(R.drawable.intervention1a);
    }


    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.d(TAG, "onTouchEvent");
        switch(event.getAction())
        {
            case MotionEvent.ACTION_DOWN:
                x1 = event.getX();
                break;
            case MotionEvent.ACTION_UP:
                x2 = event.getX();
                float deltaX = x2 - x1;

                if (Math.abs(deltaX) > MIN_DISTANCE)
                {
                    // Left to Right swipe action
                    if (x2 < x1)
                    {
                        Intent intent = new Intent(this, OneB.class);
                        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                        startActivity(intent);
                    }

                    // Right to left swipe action
                    else
                    {
                        Intent intent = new Intent(this, Demo.class);
                        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                        startActivity(intent);
                    }
                }
                break;
        }
        return super.onTouchEvent(event);
    }

    @Override
    protected void onPause() {
        Log.d(TAG, "onPause");
        super.onPause();
        finish();
    }
}
