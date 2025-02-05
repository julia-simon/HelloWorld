package ru.specialist;

public class ForPointChecking {

    public static void main(String[] args) {

        Point p1 = new Point(1, 1);
        Point p2 = new Point(3, 1);
        Point p3 = new Point();

        Point [] points = new Point[] {p1, p2, p3, new Point(5, 6), new Point(1, 0)};

        for(int i = 0; i < points.length-1; i++) {
            for (int j = i + 1; j < points.length; j++)
                if (points[i].distance() > points[j].distance()) {
                    Point k = points[j];
                    points[j] = points[i];
                    points[i] = k;
                }
        }

        for (Point point:points) point.draw();

        p1.draw();
        p2.draw();
        p3.draw();

        System.out.println(p1.distance());
        System.out.println(p2.distance());
        System.out.println(p3.distance());
    }
}
