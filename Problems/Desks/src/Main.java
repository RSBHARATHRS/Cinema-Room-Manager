import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();
        int class1 = n1 % 2 + n1 / 2;
        int class2 = n2 % 2 + n2 / 2;
        int class3 = n3 % 2 + n3 / 2;

        System.out.println(class1 + class2 + class3);


    }
}