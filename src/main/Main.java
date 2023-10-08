package main;

public class Main {
    public static double calculateFunction(double x) {
        double a = 2.7;
        double b = -0.3;
        double c = 4;

        if (x < 1.4) {
            return a * x * x + b * x + c;
        } else if (x == 1.400) {
            return a / x + Math.sqrt(x * x + 1);
        } else {
            return (a + b * x) / Math.sqrt(x * x + 1);
        }
    }

    public static int calculateSteps(double start, double end, double step) {
        return (int) ((end - start) / step) + 1;
    }

    public static double[] generateXValues(double start, double end, double step) {
        int steps = calculateSteps(start, end, step);
        double[] xValues = new double[steps];
        for (int i = 0; i < steps; i++) {
            xValues[i] = start + i * step;
        }
        return xValues;
    }

    public static double[] generateYValues(double[] xValues) {
        double[] yValues = new double[xValues.length];
        for (int i = 0; i < xValues.length; i++) {
            yValues[i] = calculateFunction(xValues[i]);
        }
        return yValues;
    }

    public static int findIndexOfMax(double[] array) {
        int maxIndex = 0;
        double maxValue = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxValue) {
                maxIndex = i;
                maxValue = array[i];
            }
        }
        return maxIndex;
    }

    public static int findIndexOfMin(double[] array) {
        int minIndex = 0;
        double minValue = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < minValue) {
                minIndex = i;
                minValue = array[i];
            }
        }
        return minIndex;
    }

    public static double calculateSum(double[] array) {
        double sum = 0;
        for (double value : array) {
            sum += value;
        }
        return sum;
    }

    public static double calculateAverage(double[] array) {
        return calculateSum(array) / array.length;
    }

    public static void main(String[] args) {
        double start = 0.0;
        double end = 2.0;
        double step = 0.002;

        System.out.println(calculateSteps(start,end,step));

        int[] testIndices = {0, 700, 1000};

        double[] xValues = generateXValues(start, end, step);
        double[] yValues = generateYValues(xValues);

        for (int testIndex : testIndices) {
            System.out.println("x = " + xValues[testIndex]);
            System.out.println("y = " + yValues[testIndex]);
        }

        int maxIndex = findIndexOfMax(yValues);
        int minIndex = findIndexOfMin(yValues);

        System.out.println("Max value: x = " + xValues[maxIndex] + ", y = " + yValues[maxIndex]);
        System.out.println("Min value: x = " + xValues[minIndex] + ", y = " + yValues[minIndex]);

        double sum = calculateSum(yValues);
        double average = calculateAverage(yValues);

        System.out.println("Sum of y values: " + sum);
        System.out.println("Average of y values: " + average);
    }
}
