package 复习

/**
 * @ 文件名:   `18.递归`
 * @ 创建者:   Eason
 * @ 时间:    2018/8/6 17:01
 * @ 描述:
 */
fun main(args: Array<String>) {
    println(nFactorial(5))

    println(fibonacci(5))
}

/*========================== n！==========================*/
fun nFactorial(n: Int): Int {
    if (n == 1) return 1
    else return n * nFactorial(n - 1)
}

/*========================== 斐波那契数列==========================*/
fun fibonacci(n: Int): Int {
    if (n == 1 || n == 2) return 1
    else return fibonacci(n - 1) + fibonacci(n - 2)
}
