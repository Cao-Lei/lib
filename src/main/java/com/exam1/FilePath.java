package com.exam1;


import java.io.File;
import java.util.ArrayList;

public class FilePath {
    /**
     * @param args
     * 1.������һ���ļ����µ������ļ�����չʾ���㼶��ϵ���ļ���������ʾ�������һ����ʽд���ı���
     * Ҫ�󣺾����ܼ򵥡��߼�����
     * ��ѡ�洢��ʽ�ṹҲ�ܿ����㼶��ϵ�����ɶ�д��ֱ��ʹ��
     */

    private static ArrayList<String> filelist = new ArrayList<String>();

    public static void main(String[] args) throws Exception {
        // TODO Auto-generated method stub
        File mPath = new File("D:/Android UI ��/��һ���ܿ�") ;// ����·��,�������ⲿ����������   + File.separator
        print(mPath) ;

/*
        String path = "D:\\Android UI ��/��һ���ܿ�";
        getFiles(path);*/
    }

   /* private static void getFiles(String path) {

        File file = new File(path);

        File[] files = file.listFiles();

        for (File f : files) {

            if (f.isDirectory()) {

                getFiles(f.getAbsolutePath());

                filelist.add(f.getAbsolutePath());

                System.out.print("��ʾ" + path + "��������Ŀ¼�����ļ�" + f.getAbsolutePath() + "\n");
            } else {
                System.out.print("\n��ʾ" + path + "��������Ŀ¼" + f.getAbsolutePath());
            }
        }
    }*/

    public static void print(File file){// �ݹ����
        // �ж϶����Ƿ�Ϊ��
        if(file!=null){
            // �����Ŀ¼
            if(file.isDirectory()){
                // �г�ȫ�����ļ�
                File f[] = file.listFiles() ;
                // �жϴ�Ŀ¼�ܷ��г�
                if(f!=null){
                    for(int i=0;i<f.length;i++){
                        // ��Ϊ����·���п�����Ŀ¼�����ԣ������ж�  ���õݹ��˼��
                        print(f[i]) ;
                    }
                }
            }else{
                // ���·��
                System.out.println(file) ;
            }
        }
    };

}
