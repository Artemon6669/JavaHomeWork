/**
* Java 1. Homework 3
*
* @author Artem N
* version 24.01.2022
*/
import java.util.Arrays;

class HomeWork3{
    public static void main (String args[]){
        invertArray();
        fillArray();
        changeArray();
        fillDigonal();
        printArrays(10,5);
    }
    static void invertArray() {
        int[] arr = { 1, 0, 1, 0, 0, 1 };
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==0) {
                arr[i]++;
            } else {
                arr[i]--;}
    }
    System.out.println(Arrays.toString(arr));
    }
    static void fillArray() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=i+1;
            }
        System.out.println(Arrays.toString(arr));
    }
    static void changeArray() {
        int[] arrr = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        System.out.println(Arrays.toString(arrr));
            for (int i = 0; i < arrr.length; i++) {
                if (arrr[i]<6) {
                    arrr[i]*= 2;
                    }
            }
        System.out.println(Arrays.toString(arrr));
    }
    static void fillDigonal() {
        int[] [] arrm =new int [4] [4];
        for (int i = 0; i<4; i++) {
            arrm [i] [i] = 1 ;
            arrm [i] [arrm.length - i - 1] = 1;
        }
        for (int i = 0; i<4; i++) {
            System.out.println (Arrays.toString (arrm[i]));
        }
    }
    static void printArrays (int len, int initialValue) {
        int [] arrt = new int [len];
        for(int i = 0; i<len; i++){
            arrt [i] = initialValue;
        }
        System.out.println(Arrays.toString(arrt));
    }
}


