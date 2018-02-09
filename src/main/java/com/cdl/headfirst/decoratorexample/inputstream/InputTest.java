package com.cdl.headfirst.decoratorexample.inputstream;


import java.io.*;

public class InputTest {

    public static void main(String[] args) {
        try {
            int c;
            InputTest it = new InputTest();
            InputStream in = new LowerCaseInputStream(new BufferedInputStream(it.getFile()));
            System.out.print("大写转换成小写：");
            while((c = in.read()) >= 0) {
                System.out.print((char) c);
            }
            in.close();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 读取resources目录下的文件
     * @return
     */
    public InputStream getFile(){
        return this.getClass().getResourceAsStream("/test.txt");
    }

}
