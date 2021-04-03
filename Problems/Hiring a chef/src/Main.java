//put imports you need here

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String eugene = sc.next();
        sc.next();
        sc.next();
        sc.next();
        String fusion = sc.next();
        System.out.print("The form for " + eugene + " is completed. ");
        System.out.print("We will contact you if we need a chef that cooks " + fusion + " dishes.");
    }
}