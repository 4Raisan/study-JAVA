class CSAnswers {

    public static int num = 70;

    // check range
    public static String check() {
        if (num>=0 && num<=100) {
            String x = "Green";
            System.out.println(x+" LK");
            return x;
        } else {
            return "Guy";
        }
    }


    public static void main (String[] args) {

        System.out.println(check());
        System.out.println();
        
        
    }
}