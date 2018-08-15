package 复习

/**
 * @ 文件名:   `09.使用lambada`
 * @ 创建者:   Eason
 * @ 时间:    2018/8/11 17:08
 * @ 描述:
 */
/*========================== 使用下方的lambda函数==========================*/

fun add(m: Int, block: (Int) -> Int): Int {//block输入Int，输出Int
    return block(m)
}

fun main(args: Array<String>) {
    val a = 10
//    add(a, { m -> m + 10 })
    var num = add(a) { it + 10 }
    println(num)
}