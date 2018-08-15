package 复习

/**
 * @ 文件名:   `10.父类与子类扩展函数的使用`
 * @ 创建者:   Eason
 * @ 时间:    2018/8/9 15:23
 * @ 描述:
 */
fun main(args: Array<String>) {
    val num1 = Number(101)
    val num2 = Num(123)
    val num3: Number = Num(111)
    println(num1.over100())
    println(num2.over100())
    println(num3.over100())//与多态不一样，会使用父类中的扩展方法
}

open class Number(var number: Int)

fun Number.over100(): Boolean {
    println("父类的")
    if (number > 100) return true
    return false
}

class Num(number: Int) : Number(number)

fun Num.over100(): Boolean {
    println("子类的")
    if (number > 100) return true
    return false
}