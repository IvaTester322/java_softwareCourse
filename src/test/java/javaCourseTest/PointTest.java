package javaCourseTest;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import point.Point;

public class PointTest {
    Point point = new Point(500.34, 100, 340);
    Point point2 = new Point(1, 50, 90);



    @Test
    public void pointSumTest() {
        Assert.assertTrue(point.pointSum() > point.pointMinus(), "Сумма точек больше чем вычитание");
    }
    @Test
    public void pointNotEqualsTest() {
        Assert.assertTrue(point.pointSum() != point2.pointSum(), "Сумма точек не равна");
    }
    @Test
    public void pointNotNullTest() {
        Assert.assertNotNull(point.pointFirstPosition);
    }
}
