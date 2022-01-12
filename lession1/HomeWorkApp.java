class HomeWorkApp {
    public static void main (String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }
    static void printThreeWords() {
        System.out.println("Orange") ;
        System.out.println("Banana") ;
        System.out.println("Apple");
    }
    static void checkSumSign() {
        int a = 5 ;
        int b = -7 ;
        int sum = a + b ;
        System.out.println(sum >= 0 ? "Сумма положительная" : "Сумма отрицательная") ;
    }
    static void printColor() {
        int value = -5 ;
        if (value <= 0) {
            System.out.println("Red") ;
            } else if (value >0 && value <=100) {
            System.out.println("Yellow") ;
            } else {
            System.out.println("Green") ;
            }
    }
    static void compareNumbers() {
            int a = 10;
            int b = 11;
            System.out.println(a >= b ? "a >= b" : "a < b");
    }
    
    
}