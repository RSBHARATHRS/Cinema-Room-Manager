import java.util.Scanner;

class FixingArithmeticException {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        boolean result1 = Boolean.parseBoolean(input);
        result1 = !result1;
        System.out.println(result1);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int result = 0;
        if (d == 0 || (b + c) == 0) {
            System.out.println("Division by zero!");
            return;
        } else {
            result = a / ((b + c) / d);
        }
        System.out.println(result);
    }
}