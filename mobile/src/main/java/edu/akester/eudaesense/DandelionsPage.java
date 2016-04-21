package edu.akester.eudaesense;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


public class DandelionsPage extends AppCompatActivity {
    private static final String TAG = "DandelionsPage";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(TAG, "onCreate");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dandelions_page);

        ImageView iv = (ImageView) findViewById(R.id.dandelionsPageImage);
        iv.setImageResource(R.drawable.dandelions1);

        Button button1 = (Button)findViewById(R.id.Blow);
        button1.setBackgroundColor(Color.TRANSPARENT);
        button1.setTextColor(Color.TRANSPARENT);
    }

    //On click function
    public void blow(View view) {
        Log.d(TAG, "blow");
        Intent intent = new Intent(this, BlowPage.class);
        startActivity(intent);
    }
}
