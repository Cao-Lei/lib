package com.exam1;


import java.io.File;
import java.util.ArrayList;

public class FilePath {
    /**
     * @param args
     * 1.遍历出一个文件夹下的所有文件，并展示出层级关系，文件夹优先显示，最后以一定格式写入文本中
     * 要求：尽可能简单、逻辑清晰
     * 所选存储格式结构也能看出层级关系，并可读写后直接使用
     */

    private static ArrayList<String> filelist = new ArrayList<String>();

    public static void main(String[] args) throws Exception {
        // TODO Auto-generated method stub
        File mPath = new File("D:/Android UI 初/第一周周考") ;// 操作路径,可以有外部参数决定的   + File.separator
        print(mPath) ;

/*
        String path = "D:\\Android UI 初/第一周周考";
        getFiles(path);*/
    }

   /* private static void getFiles(String path) {

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
    }*/

    public static void print(File file){// 递归调用
        // 判断对象是否为空
        if(file!=null){
            // 如果是目录
            if(file.isDirectory()){
                // 列出全部的文件
                File f[] = file.listFiles() ;
                // 判断此目录能否列出
                if(f!=null){
                    for(int i=0;i<f.length;i++){
                        // 因为给的路径有可能是目录，所以，继续判断  利用递归的思想
                        print(f[i]) ;
                    }
                }
            }else{
                // 输出路径
                System.out.println(file) ;
            }
        }
    };

}
