package day04


/**
 * ClassName:`08.类委托`
 * Description:
 * 静态代理
 * 动态代理
 */
fun main(args: Array<String>) {
    //具备洗碗能力的对象
    val bigHeadSon = BigHeadSon()
    val smallHeadFather = SmallHeadFather(Sister())
    //小头爸爸开始洗碗
    smallHeadFather.wash()
}
//洗碗能力
interface WashPower{
    fun wash()
}
class Sister:WashPower{
    override fun wash() {
        println("妹妹开始洗碗了")
    }

}
//大头儿子
class BigHeadSon:WashPower {
    override fun wash() {
        println("大头儿子开始洗碗了...")
    }
}

//第一种类委托方式
//小头爸爸
//把洗碗的能力委托给了大头儿子实现
//class SmallHeadFather:WashPower by BigHeadSon()

//第二种类委托  具备洗碗能力都可以
class SmallHeadFather(washPower: WashPower):WashPower by washPower