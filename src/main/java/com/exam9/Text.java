package com.exam9;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 1.
 * 2.曹磊
 * 3.2016/11/23
 */
public class Text {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
        System.out.print("请输入总人数：");
        int p = input.nextInt();
        /**** 初始化人员 ***/
        boolean[] per = new boolean[p];// boolean数组表示站成一圈的人，false表示退出
        for (int i = 0; i < per.length; i++) {
            per[i] = true;
        }

        /**** 报号 ***/
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
        /***** 结果 *****/
        System.out.println("最后的情况：" + Arrays.toString(per));
        for (int i = 0; i < per.length; i++) {
            if (per[i]) {
                System.out.println("原来喊的数：" + (i + 1) % 3);
            }
        }
    }


}
