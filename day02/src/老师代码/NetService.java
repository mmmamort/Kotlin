package 老师代码;

/**
 * ClassName:NetService
 * Description:负责网络请求
 * java的方法重载 几十个
 */
class NetService {
    /**
     * 专门负责进行GET请求
     * @param path
     */
    public static void sendRequest(String path){
        System.out.println("请求方式是:GET--请求路径是:"+path);
    }
    /**
     * 网络请求
     * @param method 请求方式
     * @param path 请求路径
     */
    public static void sendRequest(String method,String path){
        System.out.println("请求方式是:"+method+"--请求路径是:"+path);
    }
}
