package 复习.子类调用扩展函数

/**
 * @ 文件名:   `09.子类调用扩展函数`
 * @ 创建者:   Eason
 * @ 时间:    2018/8/9 15:23
 * @ 描述:
 */
fun main(args: Array<String>) {
    println(Num(102).over100())
}

open class Number(var number: Int)

fun Number.over100(): Boolean {
    if (number > 100) return true
    return false
}

class Num(number: Int) : Number(number)