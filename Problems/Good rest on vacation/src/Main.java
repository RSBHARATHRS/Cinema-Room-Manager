import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int days = sc.nextInt();
        int foodCost = sc.nextInt();
        int flightCost = sc.nextInt();
        int nightStayCost = sc.nextInt();
        System.out.println(days * foodCost + 2 * flightCost + nightStayCost * (days - 1));
    }
}