import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();
        boolean check1 = n1 > 0 && n2 <= 0 && n3 <= 0;
        boolean check2 = n1 <= 0 && n2 > 0 && n3 <= 0;
        boolean check3 = n1 <= 0 && n2 <= 0 && n3 > 0;
        System.out.println(check1 || check2 || check3);
    }
}