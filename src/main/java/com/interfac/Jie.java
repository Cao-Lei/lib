package com.interfac;

/**
 * 1.
 * 2.曹磊
 * 3.2016/11/23
 */
public class Jie implements Demo{
    @Override
    public void a() {

        System.out.print("这是接口的运用");
        final int a=10,b=20;
        double c;
        c=(double)(a+b);
    }

    @Override
    public void b() {

        System.out.print("这也是接口的运用");
    }
}
