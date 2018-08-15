package day06.函数回调


/**
 * ClassName:Mother
 * Description:
 */
fun main(args: Array<String>) {
    val superMarket = SuperMarket()
    //传递函数进去
    superMarket.setCallBack{soy->
        println("买到酱油了")
    }
    superMarket.buySoy()
}