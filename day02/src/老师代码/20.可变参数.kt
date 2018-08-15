package 老师代码.可变参数


/**
 * ClassName:`20.可变参数`
 * Description:
 */
fun main(args: Array<String>) {
    var a = 10
    var b = 20
    var c =  40
    //数据不确定有多少个?
    //a+b
    println(add(a, b,c,50,60,70,70,80,90))
}
//可变参数  数据必须是Int数据类型
fun add(vararg a:Int):Int{
    //a是什么数据类型?
    var count = 0
    a.forEach {
        count += it
    }
    return count
}