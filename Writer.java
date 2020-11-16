package cn.itcast.experiment.five;

import java.io.FileWriter;
import java.io.IOException;

public class Writer {
    static FileWriter writer;
    public static void Writer(String k,String l){
        try {
            writer = new FileWriter(l);

            //write.write("");//清空原文件内容
            writer.write(k.replace("null",""));
            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }


}
