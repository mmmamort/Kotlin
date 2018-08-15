package day03


/**
 * ClassName:`01.kotlin运算符重载`
 * Description:
 * kotlin每一个运算符:其实对应的是一个方法  假如说我们想把两个对象加起来的话,只需要把+对应的方法复写就可以实现了
 * kotlin每一个运算符对应的方法是什么呢?  http://kotlinlang.org/docs/reference/
 */
fun main(args: Array<String>) {
    val girl1 = Girl()
    val girl2 = Girl()
//    girl1 + girl2

    val a = 10
    val b = 20
    val c = a + b
}
class Girl{
    var name:String = "张三"
    var age:Int = 0
}