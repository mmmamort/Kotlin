package day01


/**
 * ClassName:`14.打字交互`
 * Description:
 */
fun main(args: Array<String>) {
    /*---------------------------- 输出函数 ----------------------------*/
    val str = "hello"
    println(str)
    /*---------------------------- 输入函数 ----------------------------*/
    var a:Int = readLine()?.toInt()?:0
    var b:Int = readLine()?.toInt()?:0
    var result = a+b
    println(result)
}