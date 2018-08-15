package 复习

/**
 * @ 文件名:   `06.遍历区间`
 * @ 创建者:   Eason
 * @ 时间:    2018/8/6 16:29
 * @ 描述:循环打印1..100
 */
fun main(args: Array<String>) {
    val range = 1..100
/*========================== for==========================*/
    for (i in range) {
        println(i)
    }

/*========================== for加步长==========================*/
    for (i in range.step(2)) {
        println(i)
    }

/*========================== for带角标==========================*/
    for ((index, i) in range.withIndex()) {
        println("$index,$i")
    }

/*========================== foreach==========================*/
    range.forEach { println(it) }

/*========================== foreach带角标==========================*/
    range.forEachIndexed { index, i -> println("$index,$i") }
}
