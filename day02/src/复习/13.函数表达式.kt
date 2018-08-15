package 复习

/**
 * @ 文件名:   `13.函数表达式`
 * @ 创建者:   Eason
 * @ 时间:    2018/8/6 16:54
 * @ 描述:
 */
/*========================== 函数化==========================*/

fun main(args: Array<String>) {
    val a = 10
    val b = 20
    //求a 加 b 的和
    println(add(a, b))
}

fun add(a: Int, b: Int) = a + b