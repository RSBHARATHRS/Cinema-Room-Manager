class SimpleCalculator {
    // Implement your methods here
    public static void subtractTwoNumbers(long a, long b) {
        System.out.println(a - b);
    }


    public static void sumTwoNumbers(long a, long b) {
        System.out.println(a + b);
    }


    public static void divideTwoNumbers(long a, long b) {
        System.out.println(b == 0 ? "Division by 0!" : a / b);
    }


    public static void multiplyTwoNumbers(long a, long b) {
        System.out.println(a * b);
    }
}