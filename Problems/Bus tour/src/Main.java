import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int noOfBridges = sc.nextInt();
        int[] arr = new int[noOfBridges];
        boolean crash = false;
        for (int i = 0; i < noOfBridges; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < noOfBridges; i++) {
            if (n >= arr[i]) {
                System.out.println("Will crash on bridge " + (i + 1));
                crash = true;
                break;
            }
        }
        if (!crash) {
            System.out.println("Will not crash");
        }
    }
}