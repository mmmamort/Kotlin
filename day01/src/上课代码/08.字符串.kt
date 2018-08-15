package day01


/**
 * ClassName:`08.字符串`
 * Description:
 */
fun main(args: Array<String>) {
    /*---------------------------- 普通字符串 ----------------------------*/
    //地址
//    var place = "广东省\n深圳市\n宝安区"
//    省 市 区
//    println(place)
    /*---------------------------- 原样输出字符串:自动帮我们加上一些特殊字符 ----------------------------*/
//    val place = """
//        广东省
//        深圳市
//        宝安区
//    """.trimIndent()
//    println(place)

    //groovy
    val place = """
        /广东省
        /深圳市
        /宝安区
    """.trimMargin("/")
    println(place)
}