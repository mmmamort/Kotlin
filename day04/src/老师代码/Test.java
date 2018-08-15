package 老师代码;

import java.util.ArrayList;

/**
 * ClassName:Test
 * Description:
 */
class Test {

    private static NetUtil netUtil;

    public static void main(String[] args){
        //1.通过.class
//        Test.class
        //2.对象.getClsss
//        Test test = new Test();
//        test.getClass();
        //3.Class.forname
//        Class.forName("")

//        ArrayList

        //发送昂立请求
//        netUtil = new NetUtil();
//        netUtil = new NetUtil();
//        netUtil = new NetUtil();

        NetUtil.getInstance().sendRequest();

        netUtil.sendRequest();
    }

    public void parse(ArrayList<?> list){
        netUtil.sendRequest();
    }
}
