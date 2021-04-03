import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[40];
        Boolean ordered = false;
        int n = 0;

/*************** Getting input **************/
        while (sc.hasNext()) {
            arr[n] = sc.nextInt();
            if (arr[n] == 0) {
                break;
            }
            n++;
        }

/*************** Processing Input **************/
        int as_count = 0;
        int ds_count = 0;
        int eql = 0;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                as_count++;
            } else if (arr[i] > arr[i + 1]) {
                ds_count++;
            } else {
                eql++;
            }
        }

        if (as_count + eql == n - 1 || ds_count + eql == n - 1) {
            ordered = true;
        }
        System.out.println(ordered);
    }
}