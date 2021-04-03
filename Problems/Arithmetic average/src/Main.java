import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        double res = 0;
        int count = 0;
        for (int i = start; i <= end; i++) {
            if (i % 3 == 0) {
                res += i;
                count++;
            }
        }
        System.out.println(res / count);
    }
}