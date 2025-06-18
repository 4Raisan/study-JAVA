class CSAnswers {
    // Marks enter
    public CSAnswers(int num) {
        this.num = num;
    }

    // check range
    public String check() {
        if (num>=0 & num<=100) {
            System.out.println("Green");
            return "Hi";
        }
    }
    public static void main (String[] args) {

    }
}