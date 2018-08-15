package 老师代码;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * ClassName:Test
 * Description:
 * java switch
 * 1.两个分支处理方案一样,可以省略break
 * 2.每一个分支都有返回值  可以通过renturn返回  省略break
 *3.支持的数据类型:char int byte  short String 枚举
 */
class Test {

    public void add(int... a){
        File file = new File("a.txt");
        if(!file.exists())return;
        try {
            BufferedReader bfr = new BufferedReader(new FileReader(file));//受检异常
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args){
        //A B C D
        String result = grade('B');
        System.out.println(result);System.out.println("he");
    }
    public static String grade(char c){
        switch (c){
            case 'A':
                return "优秀";
            case 'B':
            case 'C':
                return "良好";
            case 'D':
                return "一般";
            default:
                return "默认";
        }
    }
}
