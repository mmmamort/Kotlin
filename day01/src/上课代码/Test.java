package 上课代码;

/**
 * ClassName:Test
 * Description:
 * 小的可以直接赋值给大的  大的赋值给小的需要强转
 * 对象是一等公民,函数是二等公民
 */

class Test {
    public void sayHello() {
        //
        int a = 10;//4byyte
        long b = 20;//8byte
        //b赋值给a
        a = (int) b;
        //a赋值给b
        b = a;

        String s = "10";
        //字符串里面的值赋值给a
        a = Integer.parseInt(s);


        //可变
        int c = 10;
        c = 20;
        c = 30;
        //不可变
        final int d = 30;
//        d = 40;
    }

    //字符串比较
    public static void string() {
        String s = "hello";
        String s2 = new String(new char[]{'h', 'e', 'l', 'l', 'o'});
        System.out.println(s);
        System.out.println(s2);

        //equals 比较的是字符串的值
        boolean result1 = s.equals(s2);
        System.out.println(result1);
        //== 比较的是地址
        boolean result2 = s == s2;
        System.out.println(result2);
    }

    public void hello() {
        final int a = 10;

        new Thread(new Runnable() {
            @Override
            public void run() {
                //修改a
            }
        }).start();
    }

    public static void main(String[] args) {
//        List<Integer> list =new  ArrayList();
//        list.add(10);
//
//        int a = 10;
//        a = a+10;
//
//        //每一个对象都有hash值
//        Integer integer = Integer.valueOf(a);
//        int i = integer.hashCode();
//        System.out.println(i);
//
//        //十进制:120
//        //8进制
//        int g = 0170;
//        System.out.println(g);
//        //16进制
//        int h = 0x78;  //8+16*7
//        System.out.println(h);
//        //10进制10
//        int j = 0b1010;
//        System.out.println(j);

        string();
    }
}
