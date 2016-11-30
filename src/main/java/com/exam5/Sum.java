package com.exam5;

/**
 * 1.
 * 2.²ÜÀÚ
 * 3.2016/11/23
 */
public class Sum {
    public static void main(String[] args) {
        System.out.println("1!+2!+3!+¡­¡­+20!=" + getSum(20));
    }

    public static long getSum(int n) {

        int i, k, fac, sum = 0;
        for (i = 1; i <= n; i++) {
            fac = 1;
            for (k = 1; k <= i; k++)
                fac = fac * k;
            sum = sum + fac;
        }
        return sum;
    }


}
