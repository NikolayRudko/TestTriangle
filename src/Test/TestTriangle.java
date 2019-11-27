package Test;

import Main.Triangle;
import org.junit.Assert;
import org.junit.Test;

public class TestTriangle {
    @Test
    public void PTestTriangleExist() throws Exception {
        Triangle triangle = new Triangle(20, 5, 20);
        boolean result = triangle.triangleExist();
        Assert.assertEquals("Triangle is not exist", true, result);
    }


    @Test
    public void NTestTriangleExist() throws Exception {
        Triangle triangle = new Triangle(20, 5, 5);
        boolean result = triangle.triangleExist();
        Assert.assertEquals("Triangle is exist", false, result);
    }


    @Test
    public void PTestEquilateralTriangle() throws Exception {
        Triangle triangle = new Triangle(5, 5, 5);
        boolean result = triangle.equilateralTriangle();
        Assert.assertEquals("Triangle is not equal", true, result);
    }

    @Test
    public void NTestEquilateralTriangle() throws Exception {
        Triangle triangle = new Triangle(9, 5, 5);
        boolean result = triangle.equilateralTriangle();
        Assert.assertEquals("Triangle is equal", false, result);
    }


    @Test
    public void PTestIsoscelesTriangle() throws Exception {
        Triangle triangle = new Triangle(9, 9, 5);
        boolean result = triangle.isoscelesTriangle();
        Assert.assertEquals("Triangle is isosceles", true, result);
    }

    @Test
    public void NTestIsoscelesTriangle() throws Exception {
        Triangle triangle = new Triangle(9, 6, 5);
        boolean result = triangle.isoscelesTriangle();
        Assert.assertEquals("Triangle is not isosceles", false, result);
    }

    @Test
    public void PTestVersatileTriangle() throws Exception {
        Triangle triangle = new Triangle(9, 8, 5);
        boolean result = triangle.versatileTriangle();
        Assert.assertEquals("Triangle is versatile", true, result);
    }

    @Test
    public void NTestVersatileTriangle() throws Exception {
        Triangle triangle = new Triangle(8, 8, 5);
        boolean result = triangle.versatileTriangle();
        Assert.assertEquals("Triangle is versatile", false, result);
    }
}
