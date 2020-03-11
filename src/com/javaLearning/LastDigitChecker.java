package com.javaLearning;

public class LastDigitChecker {
    public static void main(String[] args){
        hasSameLastDigit(41,22,71);
        hasSameLastDigit(23,32,42);
        hasSameLastDigit(9,99,999);
        isValid(10);
        isValid(468);
        isValid(1051);
    }
    public static boolean hasSameLastDigit(int a, int b, int c){
        if (isValid(a) && isValid(b) && isValid(c)){
            int m = a % 10;
            int n = b % 10;
            int o = c % 10;
            if (m == n || n == o || m == o)
                return true;
            else
                return false;
        }
        else
            return false;
    }
    public static boolean isValid(int x){
        if (x >= 10 && x <= 1000)
            return true;
        else
            return false;
    }
}