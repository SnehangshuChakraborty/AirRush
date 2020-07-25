package com.example.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.SurfaceView;

public class GameView extends SurfaceView implements Runnable {
    private Thread thread;
    private Boolean isPlaying;

    public GameView(Context context) {
        super(context);
    }

    @Override
    public void run() {
        update();
        draw();
        sleep();
    }

    public void update(){

    }

    public void draw(){

    }

    public void sleep(){
        try {
            Thread.sleep(17);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void resume(){
        isPlaying = true;
        thread = new Thread(this);
        thread.start();
    }

    public void pause(){
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
