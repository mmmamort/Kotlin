package 复习.函数调用

/**
 * @ 文件名:   Mother
 * @ 创建者:   Eason
 * @ 时间:    2018/8/12 21:08
 * @ 描述:
 */
fun main(args: Array<String>) {
    val market = Market()

    println("出门买酱油了")

    market.setGetWay { soy -> println("${soy.brand}酱油买回来了") }

    market.buySoy()

    println("先煮饭")
}