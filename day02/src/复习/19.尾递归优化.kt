package 复习

/**
 * @ 文件名:   `19.尾递归优化`
 * @ 创建者:   Eason
 * @ 时间:    2018/8/6 17:04
 * @ 描述:
 */
/*========================== 优化递归的栈内存溢出 1to100000的和==========================*/
fun main(args: Array<String>) {
    //println(sum(100000))  栈内存溢出
    //println(sum1(100000))//太繁琐
    println(sum100000(100000))
}

/*fun sum(n: Int): Int {
    if (n == 1) return 1
    else return n + sum(n - 1)
}

fun sum1(num: Int): Int {
    var n = num
    var sum = 0
    while (n-- > 0) {
        sum += n
    }
    return sum
}*/

tailrec fun sum100000(n: Int, s: Int = 0): Int {
    if (n == 1) return s + 1
    else return sum100000(n - 1, s + n)
}
    