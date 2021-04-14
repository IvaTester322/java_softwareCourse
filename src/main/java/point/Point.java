package point;

public class Point {
    public double point;
    public int pointFirstPosition;
    public int pointSecondPosition;

    public Point(double point, int pointFirstPosition, int pointSecondPosition) {
        this.point = point;
        this.pointFirstPosition = pointFirstPosition;
        this.pointSecondPosition = pointSecondPosition;
    }

    public int pointSum() {
        return this.pointFirstPosition * this.pointSecondPosition;
    }

    public int pointMinus(){
        return this.pointFirstPosition - this.pointSecondPosition;
    }
}

