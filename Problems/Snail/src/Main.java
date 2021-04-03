import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int up = a - b;
        if (h < a) {
            System.out.print(1);
        } else if ((h - a) % up == 0) {
            System.out.println((h - a) / up + 1);
        } else {
            System.out.println((h - a) / up + 2);
        }
    }
}