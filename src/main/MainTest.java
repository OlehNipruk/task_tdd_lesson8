package main;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    @Test
    public void testCalculateFunction() {
        assertEquals(4.0, Main.calculateFunction(0.0), 1e-3);
        assertEquals(3.649, Main.calculateFunction(1.4), 1e-3);
        assertEquals(0.939, Main.calculateFunction(2.0), 1e-3);
    }

    @Test
    public void testCalculateSteps() {
        assertEquals(1001, Main.calculateSteps(0.0, 2.0, 0.002));
        assertEquals(3, Main.calculateSteps(1.0, 2.0, 0.5));
    }

    @Test
    public void testGenerateXValues() {
        double[] expected = {0.0, 0.002, 0.004, 0.006, 0.008, 0.01};
        assertArrayEquals(expected, Main.generateXValues(0.0, 0.01, 0.002), 1e-3);
    }

    @Test
    public void testGenerateYValues() {
        double[] xValues = {0.0, 1.4, 2.0};
        double[] expected = {4.0, 3.649, 0.939};
        assertArrayEquals(expected, Main.generateYValues(xValues), 1e-3);
    }

    @Test
    public void testFindIndexOfMax() {
        double[] array = {2.0, 4.0, 1.0, 3.0};
        assertEquals(1, Main.findIndexOfMax(array));
    }

    @Test
    public void testFindIndexOfMin() {
        double[] array = {2.0, 4.0, 1.0, 3.0};
        assertEquals(2, Main.findIndexOfMin(array));
    }

    @Test
    public void testCalculateSum() {
        double[] array = {1.0, 2.0, 3.0, 4.0, 5.0};
        assertEquals(15.0, Main.calculateSum(array), 1e-3);
    }

    @Test
    public void testCalculateAverage() {
        double[] array = {1.0, 2.0, 3.0, 4.0, 5.0};
        assertEquals(3.0, Main.calculateAverage(array), 1e-3);
    }
}
