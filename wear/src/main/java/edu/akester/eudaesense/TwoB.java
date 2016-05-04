package edu.akester.eudaesense;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


public class TwoB extends Activity {
    private static final String TAG = "TwoB";
    private float x1,x2;
    static final int MIN_DISTANCE = 5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(TAG, "onCreate");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two_b);

        ImageView iv = (ImageView) findViewById(R.id.twoBImage);
        iv.setImageResource(R.drawable.intervention2b);

        Button button1 = (Button)findViewById(R.id.Strength);
        button1.setBackgroundColor(Color.TRANSPARENT);
        button1.setTextColor(Color.TRANSPARENT);
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
//                        Intent intent = new Intent(this, TwoB.class);
//                        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
//                        startActivity(intent);
                        break;
                    }

                    // Right to left swipe action
                    else
                    {
                        Intent intent = new Intent(this, TwoA.class);
                        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                        startActivity(intent);
                    }
                }
                break;
        }
        return super.onTouchEvent(event);
    }

    //On click function
    public void reminder(View view) {
        Log.d(TAG, "reminder");
        Intent intent = new Intent(this, TwoB2.class);
        startActivity(intent);
    }
}
