package edu.akester.eudaesense;


import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Handler;
import android.os.PowerManager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class BlowPage extends AppCompatActivity {
    private static final String TAG = "BlowPage";

    /* constants */
    private static final int POLL_INTERVAL = 300;

    /** running state **/
    private boolean mRunning = false;

    /** config state **/
    private int mThreshold;

    private PowerManager.WakeLock mWakeLock;

    private Handler mHandler = new Handler();

    /* References to view elements */
    private TextView mStatusView;

    /* data source */
    private SoundMeter mSensor;

    /*GIFView member variable */
    private GIFView mGifView;

    /****************** Define runnable thread again and again detect noise *********/

    private Runnable mSleepTask = new Runnable() {
        public void run() {
            //Log.i("Noise", "runnable mSleepTask");
            start();
        }
    };

    // Create runnable thread to Monitor Voice
    private Runnable mPollTask = new Runnable() {
        public void run() {

            double amp = mSensor.getAmplitude();
            //Log.i("Noise", "runnable mPollTask");
            //Log.i("amp", String.format("%.f", amp));
            Log.i("Amp", Double.toString(amp));

            if ((amp > mThreshold)) {
                callForHelp();
                //Log.i("Noise", "==== onCreate ===");

            }

            // Runnable(mPollTask) will again execute after POLL_INTERVAL
            mHandler.postDelayed(mPollTask, POLL_INTERVAL);

        }
    };

    /*********************************************************/

    /** Called when the activity is first created. */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(TAG, "onCreate");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blow_page);

//        ImageView iv = (ImageView) findViewById(R.id.blowPageImage);
//        iv.setImageResource(R.drawable.blowingdandelion2);

        mGifView = (GIFView) findViewById(R.id.GIFView);
        //mGifView.startGif();

        TextView txt1 = (TextView) findViewById(R.id.Back);
        Typeface font1 = Typeface.createFromAsset(getAssets(), "Avenir-Medium.ttf");
        txt1.setTypeface(font1);

        TextView txt2 = (TextView) findViewById(R.id.textView);
        Typeface font2 = Typeface.createFromAsset(getAssets(), "Avenir-Medium.ttf");
        txt2.setTypeface(font2);

        Button button1 = (Button) findViewById(R.id.Back);
        button1.setBackgroundColor(Color.parseColor("#2D8EE1"));
        button1.setTextColor(Color.WHITE);
        button1.setTransformationMethod(null);

        // Used to record voice
        mSensor = new SoundMeter();

        PowerManager pm = (PowerManager) getSystemService(Context.POWER_SERVICE);
        mWakeLock = pm.newWakeLock(PowerManager.SCREEN_DIM_WAKE_LOCK, "NoiseAlert");
    }

        //On click function
    public void back(View view) {
        Log.d(TAG, "back");
        Intent intent = new Intent(this, HomePage.class);
        startActivity(intent);
    }

//        final Handler handler = new Handler();
//        handler.postDelayed(new Runnable() {
//            @Override
//            public void run() {
//                final Intent mainIntent = new Intent(BlowPage.this, RatePage.class);
//                BlowPage.this.startActivity(mainIntent);
//                BlowPage.this.finish();
//            }
//        }, 3000);

    @Override
    public void onResume() {
        super.onResume();
        //Log.i("Noise", "==== onResume ===");

        initializeApplicationConstants();

        if (!mRunning) {
            mRunning = true;
            start();
        }
    }

    @Override
    public void onStop() {
        super.onStop();
        // Log.i("Noise", "==== onStop ===");

        //Stop noise monitoring
        stop();

    }

    private void start() {
        //Log.i("Noise", "==== start ===");

        mSensor.start();
        if (!mWakeLock.isHeld()) {
            mWakeLock.acquire();
        }

        //Noise monitoring start
        // Runnable(mPollTask) will execute after POLL_INTERVAL
        mHandler.postDelayed(mPollTask, POLL_INTERVAL);
    }

    private void stop() {
        Log.i("Noise", "==== Stop Noise Monitoring===");
        if (mWakeLock.isHeld()) {
            mWakeLock.release();
        }
        mHandler.removeCallbacks(mSleepTask);
        mHandler.removeCallbacks(mPollTask);
        mSensor.stop();
        mRunning = false;

    }

    private void initializeApplicationConstants() {
        // Set Noise Threshold
        mThreshold = 8;

    }

    private void callForHelp() {
        // Show alert when noise threshold crossed
//        Toast.makeText(getApplicationContext(), "Noise Threshold crossed, do here your stuff.",
//                Toast.LENGTH_LONG).show();

        mGifView.startGif();
    }

}

