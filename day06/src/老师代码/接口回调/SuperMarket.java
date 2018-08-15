package 老师代码.接口回调;

/**
 * ClassName:SuperMarket
 * Description:超市
 */
class SuperMarket {
    //这个mSon就是Mather里面创建的son对象
//    private Mother.Son mSon;
//    public void setSon(Mother.Son son) {
//        mSon = son;
//    }
    //具备拿酱油能力的接口
    interface FeedBack {
        void feed(Soy soy);
    }

    //有取酱油的能力都可以
    //1.定义具有能力的接口
    private FeedBack mFeedBack;

    //2.设置接口对象
    public void setFeedBack(FeedBack feedBack) {
        this.mFeedBack = feedBack;
    }

    /**
     * 买酱油 暂时没有酱油  需要到库房里面去取
     * 正确的做法  应该是先回去,让儿子在超市等着 等到取完酱油之后再拿回去
     *
     * @return
     */
    public void buySoy() {
        //睡眠
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                Soy soy = new Soy("海天");
                //让儿子拿回去 具备拿酱油的能

//                mSon.feed(soy);
                //多态  调用的是子类的feed方法
                //3.回调数据
                if (mFeedBack != null) {
                    mFeedBack.feed(soy);
                }
            }
        }).start();
    }
}
