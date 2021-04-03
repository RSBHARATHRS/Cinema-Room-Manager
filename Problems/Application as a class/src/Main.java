class Application {

    String name;

    public static void main(String[] args){ //Just for testing...while submitting plz remove main method
        String[] arr = new String[2];
        //method(null);

        run();
    }

    public static void run(String[] args) {
        System.out.println(args.length);
        for (String str : args) {
            System.out.println(str);
        }
    }
    public static void method(int... vararg) {
        System.out.println(vararg.length);
    }
}