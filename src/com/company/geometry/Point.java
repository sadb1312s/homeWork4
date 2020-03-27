package com.company.geometry;

final public class Point {
    private final double x;
    private final double y;

    public Point(double x,double y){
        this.x = x;
        this.y = y;
    }

    public Point(){
        this.x = 1;
        this.y = 1;
    }

    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }

    public Point translate(double mX, double mY){
        return new Point(x + mX, y + mY);
    }

    public Point scale(double n){
        return new Point(x * n, y * n);
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Point point = (Point) o;

        if (Double.compare(point.x, x) != 0) return false;
        return Double.compare(point.y, y) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(x);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(y);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
