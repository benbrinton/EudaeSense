package edu.akester.eudaesense;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ToDoThreePage extends AppCompatActivity {
    private static final String TAG = "ToDoOnePage";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(TAG, "onCreate");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_todo_page);

        ImageView iv = (ImageView) findViewById(R.id.staticImage);
        iv.setImageResource(R.drawable.todo4);

        Button button1 = (Button)findViewById(R.id.Next);
        button1.setBackgroundColor(Color.TRANSPARENT);
        button1.setTextColor(Color.TRANSPARENT);
    }

    //On click function
    public void next(View view) {
        Log.d(TAG, "next");
        Intent intent = new Intent(this, ToDoTwoPage.class);
        startActivity(intent);
    }
}
