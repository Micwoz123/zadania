import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Wprowadź pierwszą liczbę: ");
        int num1 = scanner.nextInt();

        System.out.print("Wprowadź drugą liczbę: ");
        int num2 = scanner.nextInt();

        int lcm = (num1 * num2) / gcd(num1, num2);

        System.out.println("Największa wspólna wielokrotność: " + lcm);
    }

    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            System.out.print("Podaj liczbę " + (i + 1) + ": ");
            int number = scanner.nextInt();
            sum += number;
        }
        double average = (double) sum / 5;
        System.out.println("Suma: " + sum);
        System.out.println("Średnia: " + average);
    }
}