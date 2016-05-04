package edu.akester.eudaesense;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;


public class FiveC extends Activity {
    private static final String TAG = "FiveC";
    private float x1,x2;
    static final int MIN_DISTANCE = 5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(TAG, "onCreate");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_five_a);

        ImageView iv = (ImageView) findViewById(R.id.fiveAImage);
        iv.setImageResource(R.drawable.intervention5c);
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
                        Intent intent = new Intent(this, FiveD.class);
                        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                        startActivity(intent);
                    }

                    // Right to left swipe action
                    else
                    {
                        Intent intent = new Intent(this, FiveB.class);
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
