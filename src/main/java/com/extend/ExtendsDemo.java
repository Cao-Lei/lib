package com.extend;

/**
 * autour: ����
 * date: 2016/11/30 11:24
 * update: 2016/11/30
 */

public class ExtendsDemo {
    public static void main(String[] args) {
        LiHaiKuai liHaiKuai = new LiHaiKuai();
        liHaiKuai.setName("���");
        liHaiKuai.setSex("��");
        liHaiKuai.setAge(20);
        System.out.print("����:" + liHaiKuai.getName() + "\n�Ա�:" + liHaiKuai.getSex() + "\n����:" + liHaiKuai.getAge() + "\n");
        liHaiKuai.run();
        XiaoMing xingming = new XiaoMing();
        xingming.setName("С��");
        xingming.setSex("��");
        xingming.setAge(21);

        System.out.print("\n����:" + xingming.getName() + "\n�Ա�:" + xingming.getSex() + "\n����:" + xingming.getAge() + "\n");
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
        System.out.print(name + "�Ͽδ���Ϸ");
    }

    public void play() {
        System.out.print(name + "�Ͽ�˯��");
    }
}

class LiHaiKuai extends Person {

}

class XiaoMing extends Person {

}
