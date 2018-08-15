package 复习.接口回调;

/**
 * @ 文件名:   Mother
 * @ 创建者:   Eason
 * @ 时间:    2018/8/12 20:09
 * @ 描述:
 */
public class Mother {
    public static void main(String[] args) {
        System.out.println("去买酱油了");

        Market market = new Market();

        Son son = new Son();

//        market.setMySon(son);//带儿子去市场

        market.setGetSoy(son);

        market.buySoy();//买酱油

        System.out.println("回家先做饭");

    }

    interface GetSoy {
        void getSoy(Soy soy);
    }

    static class Son implements GetSoy {

        @Override
        public void getSoy(Soy soy) {
            System.out.println("取回酱油了" + soy.getBrand());
        }
    }

}
