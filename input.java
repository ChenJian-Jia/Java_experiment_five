package cn.itcast.experiment.five;

import cn.itcast.experiment.four.Determine_the_inputException;

import java.util.InputMismatchException;
import java.util.Scanner;
public class input {

    public static void input(Student stu){
        Scanner sc=new Scanner(System.in);
        String q;
        System.out.println("请输入您要管理的的人员的姓名:");
        System.out.println("******************************************************************************************************");
        z:while (true) {
            try {
                sc = new Scanner(System.in);
                //获取作为需要管理的人员的名字
                q=sc.next();
                //利用正则表达式对输入的字符判断是不是数字，如果是数字则抛出自定义异常
                if (q != null && q.matches("^[0.0-9.0]+$")){
                    throw new Determine_the_inputException();
                }
                //选择所需的管理人员的名字
                stu.setName(q);
                break z;
            } catch (Determine_the_inputException n){
                System.out.println("别整数字");
            }
            catch (InputMismatchException e) {
                System.out.println("输入格式错误请重新输入");
            }
        }
        System.out.println("请输入您要管理的的人员的班级:");
        System.out.println("******************************************************************************************************");
        a:while (true) {
            try {
                sc = new Scanner(System.in);
                q=sc.next();
                if (q != null && q.matches("^[0.0-9.0]+$")){
                    throw new Determine_the_inputException();
                }

                stu.setSex(q);
                break a;
            } catch (Determine_the_inputException n){
                System.out.println("别整数字");
            }
            catch (InputMismatchException e) {
                System.out.println("输入格式错误请重新输入");
            }
        }

        System.out.println("请输入您要管理的人员的学号：:");
        System.out.println("******************************************************************************************************");
        v:while (true) {
            try {
                sc = new Scanner(System.in);
                stu.setID(sc.nextInt());
                break v;
            } catch (InputMismatchException e) {
                System.out.println("输入格式错误请重新输入");
            }
        }
    }
}
