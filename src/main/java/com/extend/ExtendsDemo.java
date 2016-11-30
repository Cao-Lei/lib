package com.extend;

/**
 * autour: 曹磊
 * date: 2016/11/30 11:24
 * update: 2016/11/30
 */

public class ExtendsDemo {
    public static void main(String[] args) {
        LiHaiKuai liHaiKuai = new LiHaiKuai();
        liHaiKuai.setName("李海宽");
        liHaiKuai.setSex("男");
        liHaiKuai.setAge(20);
        System.out.print("姓名:" + liHaiKuai.getName() + "\n性别:" + liHaiKuai.getSex() + "\n年龄:" + liHaiKuai.getAge() + "\n");
        liHaiKuai.run();
        XiaoMing xingming = new XiaoMing();
        xingming.setName("小明");
        xingming.setSex("男");
        xingming.setAge(21);

        System.out.print("\n姓名:" + xingming.getName() + "\n性别:" + xingming.getSex() + "\n年龄:" + xingming.getAge() + "\n");
        xingming.play();
    }
}

class Person {

    private String name;
    private int age;
    private String sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void run() {
        System.out.print(name + "上课打游戏");
    }

    public void play() {
        System.out.print(name + "上课睡觉");
    }
}

class LiHaiKuai extends Person {

}

class XiaoMing extends Person {

}
