package com.exam7;

/**
 * autour: 曹磊
 * date: 2016/11/30 19:40
 * update: 2016/11/30
 */
public class Test {


    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        YangHui yh = new YangHui();
        yh.print();
    }

}

class YangHui {
    int a[][];

    YangHui() {
        a = new int[10][10];
        a[0][0] = a[1][0] = a[1][1] = 1;
    }

    public void print() {
        for (int k = 1; k < 10; k++)
            a[k][k] = 1;
        for (int f = 0; f < 10; f++)
            a[f][0] = 1;
        for (int i = 2; i < 10; i++) {
            for (int j = 1; j < i; j++) {
                a[i][j] = a[i - 1][j - 1] + a[i - 1][j];

            }
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j <= i; j++)
                System.out.print(a[i][j] + " ");
            System.out.println();
        }

    }


}
