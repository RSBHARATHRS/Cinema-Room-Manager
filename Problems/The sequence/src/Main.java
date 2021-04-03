import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //int[] arr = new int[]{1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 5};
        //System.out.print(1 + " ");
        boolean b = true;
        int cn = 0;
        for (int i = 1; i <= n && b; i++) {
            int count = 0;
            while (count != i) {
                System.out.print(i + " ");
                count++;
                cn++;
                if (cn == n) {
                    b = false;
                    break;
                }

            }


        }
    }
}