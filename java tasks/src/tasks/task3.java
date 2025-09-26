package tasks;

public class task3 {
    public static void main(String[] args) {
        System.out.println("Завдання 1");
        Calc1.main(null);

        System.out.println("\nЗавдання 9");
        Calc9.main(null);

        System.out.println("\nЗавдання 12");
        Calc12.main(null);
    }
}

class Calc1 {
    public static double series1(int m, int k) {
        if (k <= 0 || k > 30) throw new IllegalArgumentException("k=" + k + ". k має бути в діапазоні [1, 30].");
        if (m <= 0) throw new IllegalArgumentException("m=" + m + ". m має бути більшим за 0.");
        double s = 0;
        for (int i = 1; i <= k; i++) {
            s += Math.sqrt(m * (1.0 / i)) * Math.sin(m * i);
        }
        return s;
    }

    static void printResults(int m, int k) {
        System.out.print("m:" + m + " k:" + k + " результат:");
        try {
            System.out.println(series1(m, k));
        } catch (IllegalArgumentException e) {
            System.out.println("ПОМИЛКА! Некоректні вхідні дані: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        printResults(2, 5);
        printResults(3, 10);
        printResults(1, 30);
        printResults(4, -5);   // помилка: k < 1
        printResults(5, 40);   // помилка: k > 30
    }
}

class Calc9 {
    public static double func9(int t, int l) {
        if (t <= 0) throw new IllegalArgumentException("t=" + t + ". t має бути більшим за 0.");
        if (l < 1 || l > 8) throw new IllegalArgumentException("l=" + l + ". l має бути в діапазоні [1, 8].");
        double sum = 0;
        for (int i = 1; i <= t; i++) {
            if (l == 1 || l == 3 || l == 5 || l == 8)
                sum += Math.sqrt(l * i) / i;
            else
                sum += (double) l / Math.sqrt(i);
        }
        return sum;
    }

    static void printResults(int t, int l) {
        System.out.print("t:" + t + " l:" + l + " результат:");
        try {
            System.out.println(func9(t, l));
        } catch (IllegalArgumentException e) {
            System.out.println("ПОМИЛКА! Некоректні вхідні дані: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        printResults(5, 1);
        printResults(5, 2);
        printResults(5, 3);
        printResults(5, 4);
        printResults(5, 0);  // помилка: l < 1
        printResults(5, 9);  // помилка: l > 8
    }
}

class Calc12 {
    public static double series12(double eps) {
        if (eps <= 0) throw new IllegalArgumentException("eps=" + eps + ". eps має бути більшим за 0.");
        double sum = 0;
        for (int i = 1; ; i++) {
            double term = 1.0 / (i * (i + 1.0));
            if (Math.abs(term) < eps) break;
            sum += term;
        }
        return sum;
    }

    static void printResults(double eps) {
        System.out.print("eps:" + eps + " результат:");
        try {
            System.out.println(series12(eps));
        } catch (IllegalArgumentException e) {
            System.out.println("ПОМИЛКА! Некоректні вхідні дані: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        printResults(0.01);
        printResults(0.0001);
        printResults(-0.1);  // помилка: eps <= 0
    }
}