package edu.akester.eudaesense;


import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MenuScreen extends Activity {
    private static final String TAG = "MenuScreen";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(TAG, "onCreate");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_screen);

        ImageView iv = (ImageView)findViewById(R.id.menuImage);
        iv.setImageResource(R.drawable.menu);

        Button hidden = (Button)findViewById(R.id.hidden);
        hidden.setBackgroundColor(Color.TRANSPARENT);
        hidden.setTextColor(Color.TRANSPARENT);

        Button button1 = (Button)findViewById(R.id.twoA);
        button1.setBackgroundColor(Color.TRANSPARENT);
        button1.setTextColor(Color.TRANSPARENT);

        Button button2 = (Button)findViewById(R.id.threeA);
        button2.setBackgroundColor(Color.TRANSPARENT);
        button2.setTextColor(Color.TRANSPARENT);

        Button button3 = (Button)findViewById(R.id.fourA);
        button3.setBackgroundColor(Color.TRANSPARENT);
        button3.setTextColor(Color.TRANSPARENT);

        Button button4 = (Button)findViewById(R.id.fiveA);
        button4.setBackgroundColor(Color.TRANSPARENT);
        button4.setTextColor(Color.TRANSPARENT);
    }

    //On click function
    public void hidden(View view) {
        Log.d(TAG, "hidden");
        Intent intent = new Intent(this, Demo.class);
        startActivity(intent);
    }

    //On click function
    public void twoA(View view) {
        Log.d(TAG, "twoA");
        Intent intent = new Intent(this, TwoA.class);
        startActivity(intent);
    }

    //On click function
    public void threeA(View view) {
        Log.d(TAG, "threeA");
        Intent intent = new Intent(this, ThreeA.class);
        startActivity(intent);
    }

    //On click function
    public void fourA(View view) {
        Log.d(TAG, "fourA");
        Intent intent = new Intent(this, FourA.class);
        startActivity(intent);
    }

    //On click function
    public void fiveA(View view) {
        Log.d(TAG, "fiveA");
        Intent intent = new Intent(this, FiveA.class);
        startActivity(intent);
    }

}
