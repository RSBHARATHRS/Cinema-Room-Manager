import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num > 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}