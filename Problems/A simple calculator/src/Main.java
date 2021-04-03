import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //String str=sc.nextLine();
        long num1 = sc.nextLong();
        String c = sc.next();
        long num2 = sc.nextLong();
        switch (c) {
            case "+":
                System.out.print(num1 + num2);
                break;
            case "-":
                System.out.print(num1 - num2);
                break;
            case "*":
                System.out.print(num1 * num2);
                break;
            case "/":
                if (num2 != 0) {
                    System.out.print(num1 / num2);
                } else {
                    System.out.println("Division by 0!");
                }
                break;
            default:
                System.out.println("Unknown operator");
                break;
        }
    }
}