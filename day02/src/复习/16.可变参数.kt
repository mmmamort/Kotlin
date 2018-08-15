package 复习

/**
 * @ 文件名:   `16.可变参数`
 * @ 创建者:   Eason
 * @ 时间:    2018/8/6 16:58
 * @ 描述:
 */
fun main(args: Array<String>) {
/*========================== 可变参数==========================*/
    println(sum(1, 2, 3, 4, 6, 7, 8, 9, 9, 0))
}

fun sum(vararg a: Int): Int {
    var sum = 0
    for (i in a) {
        sum += i
    }
    return sum
}