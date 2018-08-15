package 复习

/**
 * @ 文件名:   `09.空值处理`
 * @ 创建者:   Eason
 * @ 时间:    2018/8/5 20:46
 * @ 描述:
 */
fun main(args: Array<String>) {
    //报错    var s:String=null;
    var s: String? = null
    var a = s?.toInt()//非空判断
    var b = s!!.toInt()//非空断言

    var x = readLine()?.toInt() ?: -1
    var y = readLine()?.toInt() ?: -1
    println(x + y)
}