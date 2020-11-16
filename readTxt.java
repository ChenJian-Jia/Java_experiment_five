package cn.itcast.experiment.five;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class readTxt {
    static String q=null;
    static int b=0;
    static String[] a= new String[10000000];
    public static String    readTxt(String filePath) {

        try {
            File file = new File(filePath);
            if(file.isFile() && file.exists()) {
                InputStreamReader isr = new InputStreamReader(new FileInputStream(file), "utf-8");
                BufferedReader br = new BufferedReader(isr);
                String lineTxt = null;
                //String[] a= new String[10000000];
                List<String> strings = new ArrayList<String>();

                while ((lineTxt = br.readLine()) != null) {

                    //System.out.println(lineTxt);
                    strings.add(lineTxt);
                    q=q+lineTxt;
                    a[b]=lineTxt;
                    //System.out.println(a[b]);
                    b++;
                }

                //System.out.println("*/-/-*/*-/-");
                //System.out.println(a);

                br.close();
            } else {
                System.out.println("文件不存在!");
            }
        } catch (Exception e) {
            System.out.println("文件读取错误!");
        }
        return q;

    }
}
