package com.kh.practice.point.model.vo;

public class Point {

    private int x;
    private int y;

    public Point() { // No args 매개변수없음

    }

    public Point(int x, int y) { // All args 매개변수다있음
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    @Override
    public String toString() {
        return String.format("x: %d, y: %d", x, y);
    }

}
