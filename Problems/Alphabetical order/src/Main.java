import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split(" ");
        boolean ordered = true;

        for (int j = 0; j < str.length - 1; j++) {
            if (str[j].compareTo(str[j + 1]) >= 1) {
                ordered = false;
                break;
            }
        }
        System.out.println(ordered);
    }
}