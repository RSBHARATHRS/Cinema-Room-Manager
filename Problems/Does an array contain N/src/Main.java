import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        boolean flag=false;
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int number = sc.nextInt();
        for(int num:arr){
            if(num == number){
                flag = true;
            }
        }
        System.out.println(flag);
    }
}