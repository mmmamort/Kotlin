package 复习

import 老师代码.add1

/**
 * @ 文件名:   `14.函数变量与函数引用`
 * @ 创建者:   Eason
 * @ 时间:    2018/8/6 16:56
 * @ 描述:
 */
/*========================== 函数变量==========================*/
fun main(args: Array<String>) {
    val a = 10
    val b = 20
    var sum = 0
    val add1: ((Int, Int) -> Int)? = { a, b -> a + b }
    // sum = add1(a, b)
    println(sum)
//两种调用方式的不同
    sum = add1?.invoke(a, b) ?: -1//参数可以进行空类型调用判断
/*========================== 函数引用==========================*/
    val add_copy = ::add
}

