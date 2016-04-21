package edu.akester.eudaesense;


import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ForwardPage extends AppCompatActivity {
    private static final String TAG = "ForwardPage";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(TAG, "onCreate");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forward_page);

        ImageView iv = (ImageView) findViewById(R.id.forwardPageImage);
        iv.setImageResource(R.drawable.lookingforward1);

        Button button1 = (Button)findViewById(R.id.Thanks);
        button1.setBackgroundColor(Color.TRANSPARENT);
        button1.setTextColor(Color.TRANSPARENT);
    }

    //On click function
    public void thanks(View view) {
        Log.d(TAG, "thanks");
        Intent intent = new Intent(this, ThanksPage.class);
        startActivity(intent);
    }
}
