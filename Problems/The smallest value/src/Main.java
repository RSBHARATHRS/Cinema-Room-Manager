import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        int i = 1;
        while (num >= factorial(i)) {
            i++;
        }
        System.out.println(i);


    }

    static long factorial(int n) {
        long res = n;
        while (n > 1) {
            res *= n - 1;
            --n;
        }
        return res;
    }
}