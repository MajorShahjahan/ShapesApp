package com.example.shapesapp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    TouchListener touchListener = new TouchListener();

    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView rectangleOne, rectangleTwo, rectangleThree, rectangleFour;
        rectangleOne = findViewById(R.id.rectangleImageA);
        rectangleTwo = findViewById(R.id.rectangleImageB);
        rectangleThree = findViewById(R.id.rectangleImageC);
        rectangleFour = findViewById(R.id.rectangleImageD);

        rectangleOne.setOnClickListener(this);
        rectangleTwo.setOnClickListener(this);
        rectangleThree.setOnClickListener(this);
        rectangleFour.setOnClickListener(this);

        rectangleOne.setOnTouchListener(touchListener);
        rectangleTwo.setOnTouchListener(touchListener);
        rectangleThree.setOnTouchListener(touchListener);
        rectangleFour.setOnTouchListener(touchListener);

    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View v) {
        AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();

        Rectangle rectangleA = new Rectangle();
        Rectangle rectangleB = new Rectangle();
        Rectangle rectangleC = new Rectangle();
        Rectangle rectangleD = new Rectangle();
        rectangleA.setLengthWidth(5, 5);
        rectangleB.setLengthWidth(3, 8);
        rectangleC.setLengthWidth(4, 7);
        rectangleD.setLengthWidth(6, 7);

        if (!touchListener.isMoving()){
        switch (v.getId()) {

                case R.id.rectangleImageA:
                    alertDialog.setTitle("Properties of Rectangle A");
                    alertDialog.setMessage("Length is = " + rectangleA.getLength() + "\n\nWidth is = " + rectangleA.getWidth()
                            + "\n\nArea is = " + rectangleA.areaOfRectangle());
                    alertDialog.show();
                    break;

                case R.id.rectangleImageB:
                    alertDialog.setTitle("Properties of Rectangle B");
                    alertDialog.setMessage("Length is = " + rectangleB.getLength() + "\n\nWidth is = " + rectangleB.getWidth()
                            + "\n\nArea is = " + rectangleB.areaOfRectangle());
                    alertDialog.show();
                    break;

                case R.id.rectangleImageC:
                    alertDialog.setTitle("Properties of Rectangle C");
                    alertDialog.setMessage("Length is = " + rectangleC.getLength() + "\n\nWidth is = " + rectangleC.getWidth()
                            + "\n\nArea is = " + rectangleC.areaOfRectangle());
                    alertDialog.show();
                    break;

                case R.id.rectangleImageD:
                    alertDialog.setTitle("Properties of Rectangle D");
                    alertDialog.setMessage("Length is = " + rectangleD.getLength() + "\n\nWidth is = " + rectangleD.getWidth()
                            + "\n\nArea is = " + rectangleD.areaOfRectangle());
                    alertDialog.show();
                    break;

            }
        }
    }
}


