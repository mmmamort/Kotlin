package day01


/**
 * ClassName:`11.z字符串分割`
 * Description:
 */
fun main(args: Array<String>) {
    /*---------------------------- 普通分割 ----------------------------*/
    val str = "张三.李四.王五"
    val split = str.split(".")
    println(split)
    /*---------------------------- 多条件分割 ----------------------------*/
    val str1 = "张三.李四-王五"
    val split1 = str1.split(".", "-")
    println(split1)

}