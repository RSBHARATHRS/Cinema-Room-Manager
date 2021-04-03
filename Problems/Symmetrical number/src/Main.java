

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp = num;
        int rev = 0, t, mul = 1;
        while (temp != 0) {
            t = temp % 10;
            temp = temp / 10;
            rev = mul * rev + t;
            mul = 10;
        }
        if (num == rev) {
            System.out.println(1);
        } else {
            System.out.println(37);
        }
    }
}