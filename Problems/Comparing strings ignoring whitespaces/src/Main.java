import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        str1 = str1.replace(" ", "");
        str2 = str2.replace(" ", "");
        System.out.println(str1.equals(str2) ? "true" : "false");
    }
}