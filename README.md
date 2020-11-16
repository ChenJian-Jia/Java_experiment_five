# Java_experiment_five
计191 贾忱健 2019310177 实验五 模拟学生作业处理
# 一、实验目的：
掌握字符串String及其方法的使用  
掌握文件的读取/写入方法  
掌握异常处理结构  
# 二、业务要求：
在某课上,学生要提交实验结果，该结果存储在一个文本文件A中。  
文件A包括两部分内容：  
一是学生的基本信息；  
二是学生处理后的作业信息，该作业的业务逻辑内容是：利用已学的字符串处理知识编程完成《长恨歌》古诗的整理对齐工作，写出功能方法，实现如下功能：  

1.每7个汉字加入一个标点符号，奇数时加“，”，偶数时加“。”  
2.允许提供输入参数，统计古诗中某个字或词出现的次数  
3.输入的文本来源于文本文件B读取，把处理好的结果写入到文本文件A   
4.考虑操作中可能出现的异常，在程序中设计异常处理程序  
  
输入：  
汉皇重色思倾国御宇多年求不得杨家有女初长成养在深闺人未识天生丽质难自弃一朝选在君王侧回眸一笑百媚生六宫粉黛无颜色春寒赐浴华清池温泉水滑洗凝脂侍儿扶起娇无力始是新承恩泽时云鬓花颜金步摇芙蓉帐暖度春宵春宵苦短日高起从此君王不早朝承欢侍宴无闲暇春从春游夜专夜后宫佳丽三千人三千宠爱在一身金屋妆成娇侍夜玉楼宴罢醉和春姊妹弟兄皆列士可怜光采生门户遂令天下父母心不重生男重生女骊宫高处入青云仙乐风飘处处闻缓歌慢舞凝丝竹尽日君王看不足渔阳鼙鼓动地来惊破霓裳羽衣曲九重城阙烟尘生千乘万骑西南行  

输出：  
汉皇重色思倾国，御宇多年求不得。  
杨家有女初长成，养在深闺人未识。  
天生丽质难自弃，一朝选在君王侧。  
回眸一笑百媚生，六宫粉黛无颜色。  
春寒赐浴华清池，温泉水滑洗凝脂。  
侍儿扶起娇无力，始是新承恩泽时。  
云鬓花颜金步摇，芙蓉帐暖度春宵。  
春宵苦短日高起，从此君王不早朝。  
…………  
# 三、实验要求：
1.设计学生类（可利用之前的）；  
2.采用交互式方式实例化某学生；  
3.设计程序完成上述的业务逻辑处理，并且把“古诗处理后的输出”结果存储到学生基本信息所在的文本文件A中。  
# 四、解题思路：
第一步：根据题目要求创建八个类分别为测试类，文本输入类，输出类，交互类，学生类，查询类，处理类和计数类。    
第二步：在Student类中创建学生基本信息的变量并写出赋值和获取方法。  
第三步：在readTxt类中导入所需的包，定义所需变量，循环读入的程序和异常处理。  
第四步：在Writer类中导入所需的包，定义所需变量，写入程序和异常处理。  
第五步：在inquire类中导入所需的包，定义所需变量，循环实现查询的内容和异常处理。  
第六步：在input类中导入所需的包，定义变量，用循环和正则表达式来实现交互输入和异常处理。  
第七步：在dispose类中定义所需的变量，用循环和判断来实现处理文本。 
第八步：在count_1类中定义所需的变量，用循环来处理。  
第九步：在see3类中调用个类来具体实现需求。  
# 五、操作过程：  
（1）在Student中定义name和Class和ID变量，定义构造方法Student，接受参数并在构造函数里调用各个set函数来设置各个变量的值。    
（2）在Student中重写toString方法，用来返回对象的基本信息的字符串。    
（3）在readTxt中导入各个包，如java.util.ArrayList，java.io.File包，定义静态变量字符串q，b和字符串型数组a。    
（4）定义返回字符串方法readTxt接收参数为String类型的filePath，这个参数是在see3类中接收要处理的那个文本，创建File类型的file变量接收参数为filePath，用if来判定文件是文件时就返回返回true，只要存在就返回true方法为isFile，还有一个方法来判定不管他是不是文件只要存在就返回true，方法为exists。用InputStreamReader来接收要处理的文本。  
（5）定义String类型的List，用数组lineTxt来接收从文本中读取的每行，用while来循环当读取的为null时跳出循环，这一就是实现了将文本中的东西存到了字符串中。  
（6）用FileWriter类型的writer来实现写入，首先将可能发生错误的代码如writer.writer放到try中，再利用方法接收两个参数，参数k是已经处理好的字符串，参数l是需要存在哪里的地址，将l赋值给writer这就是实现了创建文件。  
（7）将k进行替换处理换掉多余的null，用replace来处理，放到writer.writer中。  
（8）在inquire类中创建sc的Scanner的对象用于输入接收是不是1，如果是1跳出循环，如果不是则调用count_1类中的count静态方法，个方法接收两个参数。  
（9）在count_1类中定义两个int变量count和index，用while循环处理查字，当(index = srcStr.indexOf(findStr, index)) != -1时就对index进行赋值将这时的index+上所需要查找的findStr的长度，并且进行count++。  
（10）在输入姓名的时候，用正则表达式去判断输入的是不是数字f (q != null && q.matches("^[0.0-9.0]+$"))，因为可能是浮点型数字所以用0.0到9.0实现了判断输入的是不是数字，如果是数字就抛出自定义异常。再catch和死循环来处理。    
（11） 当输入工资的时候需要判断是不是不是数字，用Scaaner对象的nextInt来获取整型，放入try中如果出现异常则抛出异常InputMismatchException，利用循环来实现知道输入正确位置。   
（12）在dispose类中定义方法dispose接收需要处理的文本用循环来实现进行奇数的判断每判断完7个数字如果i等于0的话就是偶数，对其切片并加上逗号，再来第二个if这样判断加上句号和换行就是实现了处理文本。  
（13）定义Student类调用input类的input放入stu对象，用sc来获取文本，赋值给filePath，再将filePath赋值给readTxt函数，并将返回值给q，将q赋值给dispose函数再赋值给k，将k和v赋值给Writer类的writer方法实现了写入，最后调用inquire类的inquier方法来计算次数。  
# 六、核心代码：  
一、see3测试类中的代码流程：  
```
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
```
二、input类中的获取名字的代码：  
```
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
```
三、阅读文本的代码：  
```
try {
            File file = new File(filePath);
            if(file.isFile() && file.exists()) {
                InputStreamReader isr = new InputStreamReader(new FileInputStream(file), "utf-8");
                BufferedReader br = new BufferedReader(isr);
                String lineTxt = null;
                //String[] a= new String[10000000];
                List<String> strings = new ArrayList<String>();

                while ((lineTxt = br.readLine()) != null) {
                    strings.add(lineTxt);
                    q=q+lineTxt;
                    a[b]=lineTxt;
                    b++;
                }
                br.close();
            } else {
                System.out.println("文件不存在!");
            }
        } catch (Exception e) {
            System.out.println("文件读取错误!");
        }

```
四、计数的代码：  
```
public static int count(String srcStr, String findStr) {
        int count = 0;
        int index = 0;
        while ((index = srcStr.indexOf(findStr, index)) != -1) {

            index = index + findStr.length();
            count++; // +1
        }
        return count;
    }
```
五、处理文本的代码：  
```
public static String dispose(String filePath)

    {
        filePath=filePath.replace("null","");

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

                //m=m+split+ "。" + "\n";
                m=m+split+ "。" + "\n";

                //m+="\n";
            }

        }
        return m;
    }
```
# 七、实验结果：  
![img1](https://github.com/ChenJian-Jia/Java_experiment_five/blob/main/img/experiment_reslut_picture_1.png)  
![img2](https://github.com/ChenJian-Jia/Java_experiment_five/blob/main/img/experiment_reslut_picture_2.png)  
# 八、实验感想： 
本次实验学习了字符处理和文件操作交互方法，此次实验对于我来说是很有难度的，本次实验基本掌握字符串String及其方法的使用，文件的读取/写入方法，异常处理结构。，主要难点在于文件的处理以及字与词的查询上，这个困扰了我好长时间，最后通过循环和indexOf方法来处理了。这次试验有用到了正则表达式，正则表达式对于我们来说至关重要不仅仅体现在文件处理上，巩固了正则表达式。这次也复习了前几个实验的重点内容，比如toString的复写，各种类型的数组。异常处理，多个类的一起操作。这是最后一次实验了，但Java之路远未结束，还有很长的路。
