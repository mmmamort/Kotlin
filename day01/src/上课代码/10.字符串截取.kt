package day01


/**
 * ClassName:`10.字符串截取`
 * Description:
 */
fun main(args: Array<String>) {
    val path = "/Users/yole/kotlin-book/chapter.adoc"
    /*---------------------------- 获取前6个字符 ----------------------------*/
    val result1 = path.substring(0,6)
    println(result1)
    /*---------------------------- 把第一个r之前的字符截取 ----------------------------*/
    //先找第一个r角标
//    val index = path.indexOf("r")
//    val result2 = path.substring(0,index)
//    println(result2)

    val result2 = path.substringBefore("r")
    println(result2)
    
    /*---------------------------- 把最后一个r之前的字符截取 ----------------------------*/
    val result3 = path.substringBeforeLast("r")
    println(result3)
    
    /*---------------------------- 把第一个r之后的字符截取 ----------------------------*/
    val result4 = path.substringAfter("r")
    println(result4)
    /*---------------------------- 把最后一个r之后的字符截取 ----------------------------*/
    val result5 = path.substringAfterLast("r")
    println(result5)
}