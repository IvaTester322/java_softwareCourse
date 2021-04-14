import point.Point;

public class MyFirstProgram {
    public static void main(String[] args) {
        System.out.println("Hello,world");
        Point point1 = new Point(52.2, 20, 100);
        Point point2 = new Point(10.5, 40, 200);
        summaryDistance(point1, point2);
        distanceOut(point2, point1);

        System.out.println("помноженная сумма 1ой и 2ой точки  : "  + point1.pointSum());


    }

    public static double summaryDistance(Point point1, Point point2) {

        double sum = point1.point + point2.point;
        System.out.println("Общая дистанция point1 и point2 = " + sum);
        return sum;
    }

    public static double distanceOut(Point point1, Point point2) {
        double distancing = point1.point - point2.point;
        System.out.println("Общая дистанция отдаления point1 и point2 = " + distancing);
        return distancing;
    }


    public static double area(double a, double b) {
        return a * b;
    }


}
