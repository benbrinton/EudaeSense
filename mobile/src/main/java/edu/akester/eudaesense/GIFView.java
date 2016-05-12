package edu.akester.eudaesense;

/**
 * Created by Audrey on 5/11/16.
 */

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Movie;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

import java.io.InputStream;

//http://www.geeks.gallery/how-to-display-the-animated-gif-image-in-android/
public class GIFView extends View {
    private Movie mMovie;
    private long movieStart;
    private boolean thresholdPassed;


    public GIFView(Context context) {
        super(context);
        initializeView();
    }

    public GIFView(Context context, AttributeSet attrs) {
        super(context, attrs);
        initializeView();
    }

    public GIFView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        initializeView();
    }

    private void initializeView() {
//R.drawable.loader - our animated GIF
        // 0 + is just to work around overly aggressive IDE checks complaining about passing
        // a drawable id to this fn that is called open*Raw*Resource.
        InputStream is = getContext().getResources().openRawResource(0 + R.drawable.blowingdandelion2);
        mMovie = Movie.decodeStream(is);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        canvas.drawColor(Color.TRANSPARENT);
        Log.d("GIFView", "onDraw" + canvas);
        final float scaleFactorX = getWidth()/(mMovie.width()*1.f);
        //final float scaleFactorY = getHeight()/(mMovie.height()*1.f);
        //DecimalFormat df = new DecimalFormat();
        //Log.d("TAG", "width:" + df.format(scaleFactorX));

        if (canvas != null) {

            final int savedState = canvas.save();

            super.onDraw(canvas);

            long now = android.os.SystemClock.uptimeMillis();

            if (movieStart == 0 && thresholdPassed == true){
                movieStart = now;
            }

            Log.d("GIFView", "movieStart: " + movieStart);

            if (mMovie != null) {

                //Only loop gif once: http://stackoverflow.com/questions/21220103/how-to-stop-gif-from-looping-in-android
                int relTime = 0; //time passed since movieStart time

                if (movieStart > 0) {
                    relTime = (int) (now - movieStart);
                }
                //int relTime = (int) ((now - movieStart) % mMovie.duration()); --> infinite looping
                mMovie.setTime(relTime);

                if (relTime > mMovie.duration()) {
                    relTime = 0;
                    movieStart = 0;
                    thresholdPassed = false;
                }

                //Set the location of the gif
                int yOffset = getHeight()/2 - (int)(mMovie.height() * scaleFactorX / 2);
                canvas.translate(0, yOffset);
                canvas.scale(scaleFactorX, scaleFactorX); //scales the images
                mMovie.draw(canvas, 0, 0);

               // this.invalidate();

                //stop calling invalidate() once you pass the gif duration.
                if (relTime < mMovie.duration()) {
                    invalidate();
                }
                //Log.d("TAG", "width:" + String.valueOf(getWidth()));
                //Log.d("TAG", "height:" + String.valueOf(getHeight()));
            }
            canvas.restoreToCount(savedState);
        }
    }
    private int gifId;

    public void setGIFResource(int resId) {
        this.gifId = resId;
        initializeView();
    }

    public int getGIFResource() {
        return this.gifId;
    }

    public void startGif() {
        thresholdPassed = true;
        Log.d("GIFView", "gif started");
    }
}