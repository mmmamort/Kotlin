package 老师代码;

/**
 * ClassName:NetUtil
 * Description:进行网络请求
 * 最好的方案就是让NetUtil只能创建一次就可以了 只有一个对象的实例
 * java的单例:懒汉式  饿汉式
 */
class NetUtil {

    /*---------------------------- 饿汉式 ----------------------------*/
//    //1.私有化构造函数
////    private NetUtil(){}
////    //2.提供一个方法把当前实例提供给外部使用
////    //定义实例的成员变量
////    private static NetUtil mNetUtil = new NetUtil();
////    //函数可以把实例对象提供出去  调用这个函数不能使用对象的实例 (函数和对象没有关系)
////    public static NetUtil getInstance(){
////        return mNetUtil;
////    }

    /*---------------------------- 懒汉式 ----------------------------*/
    //多线程  加锁处理  防止多线程问题
    //1.私有化构造函数
    private NetUtil() {
    }

    //2.提供一个方法把当前实例提供给外部使用
    //定义实例的成员变量  用的时候再初始化
    private static NetUtil mNetUtil = null;

    //函数可以把实例对象提供出去  调用这个函数不能使用对象的实例 (函数和对象没有关系)
    public static synchronized NetUtil getInstance() {
        //只能赋值给mNetUtil一次
        if (mNetUtil == null) {
            mNetUtil = new NetUtil();
        }
        return mNetUtil;
    }

    /**
     * 网络请求方法
     */
    public void sendRequest() {
        System.out.println("发送了网络请求");
    }
}
