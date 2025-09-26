package tasks;

class task2 {
    static void main(String[] args) {
        if (args != null && args.length > 0) {
        }

        // Завдання 6
        double a1 = -1.23, b1 = -0.34, c1 = 0.707, d1 = 2.312;
        double y1 = calc6(a1, b1, c1, d1);
        System.out.printf("Завдання 6: y = %.12f%n", y1);

        // Завдання 16
        double a2 = 0.58, b2 = 0.34, c2 = 1.25, d2 = -1.89;
        double y2 = calc16(a2, b2, c2, d2);
        System.out.printf("Завдання 16: y = %.12f%n", y2);

        //  Завдання 26
        double a3 = 1.27, b3 = 10.99, c3 = 4.0, d3 = -25.32;
        double y3 = calc26(a3, b3, c3, d3);
        System.out.printf("Завдання 26: y = %.12f%n", y3);
    }

    // Обчислення 6
    static double calc6(double a, double b, double c, double d) {
        return 3.0 * (Math.log10(Math.abs(b / a)) + Math.sqrt(Math.sin(c) + Math.exp(d)));
    }

    // Обчислення 16
    static double calc16(double a, double b, double c, double d) {
        double term1 = 2.0 * (Math.sin(a) / Math.acos(-2.0 * b));
        double term2 = Math.sqrt(Math.log(c * Math.abs(2.0 * d)));
        return term1 - term2;
    }

    // Обчислення 26
    static double calc26(double a, double b, double c, double d) {
        double numerator = Math.pow(Math.tan(a), 1.0 / c);
        double denominator = 2.0 - (Math.sinh(b) / Math.log(Math.abs(d + c)));
        return numerator / denominator;
    }
}