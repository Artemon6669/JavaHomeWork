/**
* Java 2. Homework 2
*
* @author Artem N
* version 19.01.2022
*/
class HomeWorkAppLession2 {
    public static void main (String args[]) {
        System.out.println(within10and20 (5,5));
        isPositiveOrNegative (-5);
        System.out.println(isNegative (-10));
        printWordNTimes("back", 5);
        System.out.println (leapYear (2020));
    }
    static boolean within10and20 (int a, int b) {
        return a+b>=10 && a+b<=20;
    }
    static void isPositiveOrNegative (int c) {
        System.out.println( c >= 0 ? "positive" : "negative");
    }
    static boolean isNegative (int d) {
        if (d < 0) {
            return true;
        }
        return false;
    }
    static void printWordNTimes(String word, int times) {
        for (int i=0; i<times; i++) {
            System.out.println(word);
        }
    }
    static boolean leapYear (int y) {
        return (y % 4 == 0 && y % 100 != 0) || y % 400==0;
    }
}