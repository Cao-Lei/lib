package com.exam9;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 1.
 * 2.����
 * 3.2016/11/23
 */
public class Text {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
        System.out.print("��������������");
        int p = input.nextInt();
        /**** ��ʼ����Ա ***/
        boolean[] per = new boolean[p];// boolean�����ʾվ��һȦ���ˣ�false��ʾ�˳�
        for (int i = 0; i < per.length; i++) {
            per[i] = true;
        }

        /**** ���� ***/
        int t = 0, len = per.length;
        while (len > 1) {
            for (int i = 0; i < per.length; i++) {
                if (per[i]) {
                    t++;
                    if (t == 3) {
                        t = 0;
                        per[i] = false;
                        len--;
                    }
                }
            }
        }
        /***** ��� *****/
        System.out.println("���������" + Arrays.toString(per));
        for (int i = 0; i < per.length; i++) {
            if (per[i]) {
                System.out.println("ԭ����������" + (i + 1) % 3);
            }
        }
    }


}
