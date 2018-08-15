package 复习.接口回调;

/**
 * @ 文件名:   Market
 * @ 创建者:   Eason
 * @ 时间:    2018/8/12 20:09
 * @ 描述:
 */
public class Market {
//    Mother.Son mySon;
//
//    public void setMySon(Mother.Son mySon) {
//        this.mySon = mySon;
//    }

    Mother.GetSoy getSoy;

    public void setGetSoy(Mother.GetSoy getSoy) {
        this.getSoy = getSoy;
    }

    public void buySoy() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                Soy soy = new Soy("李锦记");

//                mySon.getSoy(soy);

                getSoy.getSoy(soy);
            }
        }).start();
    }
}
