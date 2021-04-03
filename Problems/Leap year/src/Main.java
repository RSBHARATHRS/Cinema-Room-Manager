import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println("Leap");
                } else {
                    System.out.println("Regular");
                }

            } else {
                System.out.println("Leap");
            }

        } else {
            System.out.println("Regular");
        }
    }
}