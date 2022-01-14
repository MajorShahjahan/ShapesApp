package com.example.shapesapp;


import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class TouchListener implements View.OnTouchListener {

    float xDown = 0, yDown = 0;

    public boolean isMoving() {
        return isMoving;
    }

    boolean isMoving = false;
    @Override
    public boolean onTouch(View v, MotionEvent event) {

            switch (event.getActionMasked()) {

                //The user just put his finger down on imageview
                case MotionEvent.ACTION_DOWN:
                    isMoving = false;
                    xDown = event.getX();
                    yDown = event.getY();
                    break;

                //The user moved his finger
                case MotionEvent.ACTION_MOVE:
                        isMoving = true;
                        float movedX, movedY;
                        movedX = event.getX();
                        movedY = event.getY();

                        //Calculate how much user moved his finger
                        float distanceX = movedX - xDown;
                        float distanceY = movedY - yDown;

                        //Move the view to that position
                        v.setX(v.getX() + distanceX);
                        v.setY(v.getY() + distanceY);
                    break;

                case MotionEvent.ACTION_BUTTON_RELEASE:
                    isMoving = false;
                    break;

            }

            return false;
        }

    }









