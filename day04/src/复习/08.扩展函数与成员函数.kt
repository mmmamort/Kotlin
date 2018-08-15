package 复习.扩展函数

/**
 * @ 文件名:   `08.扩展函数`
 * @ 创建者:   Eason
 * @ 时间:    2018/8/9 15:21
 * @ 描述:
 */

fun main(args: Array<String>) {
    val num = Number(101)
    println(num.over100())
    num.sout()
}

class Number(var number: Int) {
    fun sout() {
        println("成员函数的sout()")//当扩展函数与成员函数重复了，优先使用成员函数
    }
}

fun Number.over100(): Boolean {
    if (number > 100) return true
    return false
}

fun Number.sout() {
    println("扩展函数的sout()")
}