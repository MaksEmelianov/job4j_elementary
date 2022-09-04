package ru.job4j.condition;

public class Point {

    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distance(Point point) {
        return Math.sqrt(Math.pow(this.x - point.x, 2) + Math.pow(this.y - point.y, 2));
    }

    public static void main(String[] args) {
        Point point1 = new Point(1, 1);
        Point point2 = new Point(2, 2);
        Point point3 = new Point(3, 3);
        double result = point1.distance(point2);
        System.out.println("result (1, 1) to (2, 2): " + result);
        result = point1.distance(point3);
        System.out.println("result (1, 1) to (3, 3): " + result);
    }
}
