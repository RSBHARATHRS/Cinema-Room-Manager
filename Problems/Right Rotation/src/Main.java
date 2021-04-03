import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = sc.nextLine().split(" ");
        int rotationCount = sc.nextInt();
        int[] intArr = new int[arr.length];
        int index = 0;
        for (String str : arr) {
            intArr[index] = Integer.parseInt(str);
            index++;
        }
        int temp;
        for (int i = 1; i <= rotationCount % intArr.length; i++) {
            temp = intArr[intArr.length - 1];
            for (int j = intArr.length - 1; j >= 1; j--) {
                intArr[j] = intArr[j - 1];
            }
            intArr[0] = temp;
        }
        for (int n : intArr) {
            System.out.print(n + " ");
        }
    }
}