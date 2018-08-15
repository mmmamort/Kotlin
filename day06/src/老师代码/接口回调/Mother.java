package 老师代码.接口回调;

/**
 * ClassName:Mother
 * Description:
 */
class Mother {
    public static void main(String[] args) {
        System.out.println("去超市买酱油了");
        //去超市买酱油
        SuperMarket superMarket = new SuperMarket();
        //让儿子进超市
        Son son = new Son();
        superMarket.setFeedBack(son);

        superMarket.buySoy();


        System.out.println("蒸米饭");

    }


    //儿子
    static class Son implements SuperMarket.FeedBack {
        @Override
        public void feed(Soy soy) {
            System.out.println("已经取回来酱油了:酱油品牌:" + soy.getBrand());
        }
    }
}
