package com.exam1;


import java.io.File;
import java.util.ArrayList;

public class FilePath {
    private static ArrayList<String> filelist = new ArrayList<String>();
    public static void main(String[] args) throws Exception{
        String path = "D:\\Android UI 初/第一周周考";
        getFiles(path);
    }

    private static void getFiles(String path) {
        File file = new File(path);

        File[] files = file.listFiles();

        for (File f : files) {

            if (f.isDirectory()) {

                getFiles(f.getAbsolutePath());

                filelist.add(f.getAbsolutePath());

                System.out.print("显示" + path + "下所有子目录机器文件" + f.getAbsolutePath() + "\n");
            } else {
                System.out.print("\n显示" + path + "下所有子目录" + f.getAbsolutePath());
            }
        }
    }
}
