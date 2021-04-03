import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        while (sc.nextInt() != 0) {
            count++;
        }
        System.out.println(count);


/*        int n = 100;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] == 0) {
                break;
            }
        }
        int count=0;
        for (int num : arr) {
            if(num==0){
                break;
            }else {
               count++;
            }
        }
        System.out.println(count);

 */
    }
}