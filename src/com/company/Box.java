package com.company;
import java.util.Scanner;

public class Box {
    private Scanner s = new Scanner(System.in);
    private int height, length, width;
    private String color, material;

    public Box(){}

    public Box(int height, int length, int width){
        if (height > 0 && length > 0 && width > 0){
            this.length = length;
            this.height = height;
            this.width = width;
        }
    }

    public Box(int height, int length, int width, String color, String material){
        new Box(height, length, width);
        this.color = color;
        this.material = material;
    }

    public void setHeight(int height) {
        if (height > 0){
            this.height = height;
        }
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setWidth(int width) {
        if (width > 0){
            this.width = width;
        }
    }

    public void setLength(int length) {
        if (length > 0){
            this.length = length;
        }
    }

    public String getMaterial() {
        return material;
    }

    public String getColor() {
        return color;
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    public int getHeight() {
        return height;
    }

    public int calculateVolume(){
        return height*length*width;
    }
}