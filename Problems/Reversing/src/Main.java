import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp = num % 10;
        num /= 10;
        temp = temp * 10 + num % 10;
        num /= 10;
        temp = temp * 10 + num;
        System.out.println(temp);
    }
}