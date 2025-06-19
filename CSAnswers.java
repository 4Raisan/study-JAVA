class CSAnswers {

    // 1
    public static int num = 70;

    // 2
    public static String check() {
        if (num>=0 && num<=100) {
            String x = "Green";
            System.out.println(x+" LK");
            return x;
        } else {
            return "Guy";
        }
    }

    // 3
    public static void failed() {
        if (num>=50) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
    }


    public static void main (String[] args) {

        System.out.println(check());
        System.out.println();
        failed();

    }
}