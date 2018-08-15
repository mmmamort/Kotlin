package 老师代码


/**
 * ClassName:`07.遍历区间`
 * Description:
 */
fun main(args: Array<String>) {
    val range = 1..100
    /*---------------------------- for ----------------------------*/
//    for (i in range) {
//        println(i)
//    }
    //加上步长遍历
//    for (i in range.step(2)) {
//        println(i)
//    }

    /*---------------------------- for循环加上index ----------------------------*/
//    for ((index,i) in range.withIndex()) {
//        println("index=$index i=$i")
//    }

    /*---------------------------- foreach ----------------------------*/
    range.forEach {
        println(it)
    }
    /*---------------------------- foreachindex ----------------------------*/
    range.forEachIndexed { index, i ->
        println("index=$index i=$i")
    }
}