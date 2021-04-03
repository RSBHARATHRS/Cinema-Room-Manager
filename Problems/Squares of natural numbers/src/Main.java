import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = 1;
        int res = 1;
        while (res <= n) {
            System.out.println(res);
            num++;
            res = (int) Math.pow(num, 2);
        }
    }
}