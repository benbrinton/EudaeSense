package edu.akester.eudaesense;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


public class ToDoTwoPage extends AppCompatActivity {
    private static final String TAG = "ToDoTwoPage";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(TAG, "onCreate");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_todo2_page);

        ImageView iv = (ImageView) findViewById(R.id.staticImage);
        iv.setImageResource(R.drawable.todo3);

        Button button1 = (Button)findViewById(R.id.Save);
        button1.setBackgroundColor(Color.TRANSPARENT);
        button1.setTextColor(Color.TRANSPARENT);

        Button button2 = (Button)findViewById(R.id.Cancel);
        button2.setBackgroundColor(Color.TRANSPARENT);
        button2.setTextColor(Color.TRANSPARENT);
    }

    //On click function
    public void save(View view) {
        Log.d(TAG, "save");
        Intent intent = new Intent(this, ToDoThreePage.class);
        startActivity(intent);
    }

    //On click function
    public void cancel(View view) {
        Log.d(TAG, "cancel");
        Intent intent = new Intent(this, ToDoPage.class);
        startActivity(intent);
    }
}
