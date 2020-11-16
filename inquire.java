package cn.itcast.experiment.five;
import java.util.Scanner;
public class inquire {
    static String strs=null;

    public static void inquire(String k){
        Scanner sc=new Scanner(System.in);
        x:while (true) {
            strs = sc.next();
            if(strs.equals("1")){
                break x;
            }
            int count = count_1.count(k, strs);
            System.out.println(strs + " 出现 " + count + " 次");
        }
    }
}
