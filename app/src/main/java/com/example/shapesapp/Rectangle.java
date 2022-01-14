package com.example.shapesapp;

public class Rectangle {

    int length;
    int width;
    int area;

    public void setLengthWidth(int length, int width){
        this.length = length;
        this.width = width;
    }

    public int areaOfRectangle(){

        return area = length*width;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }
}
