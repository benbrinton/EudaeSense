package edu.akester.eudaesense;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


public class CharmPage extends AppCompatActivity {
    private static final String TAG = "CharmPage";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(TAG, "onCreate");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_charm_page);

        ImageView iv = (ImageView) findViewById(R.id.charmPageImage);
        iv.setImageResource(R.drawable.threesthecharm);

        Button button1 = (Button)findViewById(R.id.Gratitude);
        button1.setBackgroundColor(Color.TRANSPARENT);
        button1.setTextColor(Color.TRANSPARENT);
    }

    //On click function
    public void gratitude(View view) {
        Log.d(TAG, "gratitude");
        Intent intent = new Intent(this, GratitudePage.class);
        startActivity(intent);
    }
}
