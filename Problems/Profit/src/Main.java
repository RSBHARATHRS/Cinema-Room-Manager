import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double m = sc.nextInt();
        double p = sc.nextInt();
        double k = sc.nextInt();
        int year = 0;
        while (k > m) {
            m += m * p / 100;
            year++;
        }
        System.out.println(year);
    }
}