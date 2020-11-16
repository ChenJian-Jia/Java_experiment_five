package cn.itcast.experiment.five;

import java.util.Scanner;

public class see3 {
    static String q=null;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Student stu=new Student();
        //输入学生姓名、班级和学号
        input.input(stu);
        System.out.println(stu);
        String c=stu.toString()+"\n";
        System.out.println("请输入那个文件");
        //获取要处理的文件地址
        String filePath =sc.next();
        System.out.println("请输入要存放在那里");
        //获取要存放处理完文件的地址
        String v=sc.next();
        //阅读文件将文件中的字符串赋值给q
        q=readTxt.readTxt(filePath);
        System.out.println("处理完的结果为：");
        //利用处理方法将处理好的字符串赋值给k
        String k=dispose.dispose(q.replace("null",""));
        k=c+k;
        System.out.println(k.replace("null",""));
        //将处理好的字符串给k,存放的地址给v，写入文件
        Writer.Writer(k,v);
        System.out.println("输入1退出程序，请输入想要查询的字：");
        //查询函数
        inquire.inquire(k);
    }

}


