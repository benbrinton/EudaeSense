package edu.akester.eudaesense;


import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class BlowPage extends AppCompatActivity {
    private static final String TAG = "BlowPage";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(TAG, "onCreate");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blow_page);

        ImageView iv = (ImageView) findViewById(R.id.blowPageImage);
        iv.setImageResource(R.drawable.dandelions2);

        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                final Intent mainIntent = new Intent(BlowPage.this, RatePage.class);
                BlowPage.this.startActivity(mainIntent);
                BlowPage.this.finish();
            }
        }, 3000);

    }

}
