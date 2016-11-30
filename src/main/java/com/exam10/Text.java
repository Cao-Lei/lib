package com.exam10;

/**
 * 1.
 * 2.曹磊
 * 3.2016/11/23
 */
public class Text {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        boolean isPrime; // 定义布尔变量判断是否素数.是:true;否:false
        for (int i = 2; i <= 100; i++) {
            isPrime = true;
            int k = (int) Math.sqrt(i);
            for (int j = 2; j <= k; j++) {
                if (i % j == 0) {
                    isPrime = false; // 如果能够有数整除i,那么就不是素数.
                    break;
                }
            }
            if (isPrime) {
                System.out.println(i);
            }
        }
    }

}
