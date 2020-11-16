package cn.itcast.experiment.five;

public class dispose {
    static String m=null;
    public static String dispose(String filePath)

    {
        filePath=filePath.replace("null","");
        //System.out.println("++66");
        //System.out.println(filePath);



        for (int i = 0; i<filePath.length(); i = i+7) {

            if( i%2 == 0 ){//如果i除以2的余数不为零，为奇数个字。
                String split = filePath.substring(i, i+7);//截取字符串从i到i+7。
                //System.out.print(split+ "，");//输出加逗号。

                m=m+split+ "，";

                //m+="\n";
            }
            if( i%2 == 1 ){//如果i除以2的余数为零，为偶数个字。
                String split = filePath.substring(i, i+7);//截取字符串从i到i+7。
                //System.out.print(split+ "。" + "\n");  //输出加句号。

                m=m+split+ "。" + "\n";
                //m+="\n";
            }

        }
        return m;
    }

}
