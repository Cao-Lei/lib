package com.exam2;

/**
 * autour: 曹磊
 * date: 2016/11/30 18:51
 * update: 2016/11/30
 */

public class CharsCount {


    public static void main(String[] args) {
        String str = "ABCDEFGBIJKLMNOPQRSTUVWXYZ   abcdefghijklmnopqrstuvwxyz 123456789 ,,,,,,......?????? ///////";

        int bigletter = 0;
        int smallLetter = 0;
        int num = 0;
        int other = 0;
        int trim = 0;


        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (ch >= '0' && ch <= '9') {
                num++;
            } else if (ch >= 'a' && ch <= 'z') {
                smallLetter++;
            } else if (ch >= 'A' && ch <= 'Z') {
                bigletter++;
            } else if (ch == ' ') {

                trim++;
            } else {
                other++;
            }
        }
        System.out.print("\nbigletter:" + bigletter);
        System.out.print("\nsmallLetter:" + smallLetter);
        System.out.print("\ntrim:" + trim);
        System.out.print("\nnum:" + num);
        System.out.print("\nother:" + other);


    }
}
