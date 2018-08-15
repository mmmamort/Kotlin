package 复习;

/**
 * @ 文件名:   Java单例
 * @ 创建者:   Eason
 * @ 时间:    2018/8/11 0:43
 * @ 描述:防止在调用对象时反复创建对象所造成的内存占用
 */
public class Java单例 {
    public static void main(String[] args) {
        NetUtil.getInstance();
    }
}

class NetUtil {
    /*========================== 饿汉式==========================*/
    /*
    //    私有化构造方法
        private NetUtil() {

        }

        //私有化静态对象
        private static NetUtil netUtil = new NetUtil();

        //提供公共的访问方法
        public static void getInstance() {
            netUtil.sentRequest();
        }*/


    /*========================== 懒汉式（需要注意多线程的问题）==========================*/

    //    私有化构造方法
    private NetUtil() {

    }

    //私有化静态对象
    private static NetUtil netUtil;

    /*public static void getInstance() {
        if (netUtil == null) netUtil = new NetUtil();//区别于饿汉式   这里存在一个问题多线程的时候有可能多线程同时创建多个对象。依旧占用资源，所以需要上锁
        netUtil.sentRequest();
    }*/
    public static void getInstance() {//可以直接方法上锁
        if (netUtil == null) {//可以对if上锁，但以上两种方式，倘若方法或者if中还有别的代码，则其它线程需要等待这些代码执行完才能进抢到锁，线程执行效率低，是不合理的
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            synchronized (NetUtil.class) {
                if (netUtil == null) netUtil = new NetUtil();//这种方式效率更高，不影响其它线程执行之前代码
            }
        }
        netUtil.sentRequest();
    }

    //提供公共的访问方法
    public void sentRequest() {
        System.out.println("实行网络连接");
    }
}
