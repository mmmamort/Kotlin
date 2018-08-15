package 老师代码


/**
 * ClassName:`07.区间的反转和反向区间`
 * Description:
 */
fun main(args: Array<String>) {
    val range1 = 1..100
    //定义100到1
//    val range2 = 100..1
//    range2.forEach { println(it) }

    /*---------------------------- 反向区间定义 ----------------------------*/
//    val range2 = 100 downTo 1
//    range2.forEach { println(it) }

    /*---------------------------- 区间反转 ----------------------------*/
    val range2 = range1.reversed()
    range2.forEach { println(it) }
}