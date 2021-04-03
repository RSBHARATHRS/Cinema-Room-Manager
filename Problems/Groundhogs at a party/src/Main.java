import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        boolean b = scanner.nextBoolean();
        if (b) {
            System.out.println(count <= 25 && count >= 15);
        } else {
            System.out.println(count >= 10 && count <= 20);
        }
    }
}