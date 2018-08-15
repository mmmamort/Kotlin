package 复习


/**
 * @ 文件名:   `10.常见的lambda表达式`
 * @ 创建者:   Eason
 * @ 时间:    2018/8/11 17:21
 * @ 描述:
 */
fun main(args: Array<String>) {
    val s = "abcdefghijklmnopqrstuvwxyz"
/*========================== foreach==========================*/

//public inline fun CharSequence.forEach(action: (Char) -> Unit): Unit

//    foreach是一个扩展函数，函数内有一个参数（是一个函数），该函数的输入为char、无返回值；foreach也无返回值

//    s.forEach() { element -> println(element) }

    s.forEach { println(it) }

/*========================== indexof==========================*/

    val arr = arrayOf("a", "b", "c", "d", "c")

//public inline fun <T> Array<out T>.indexOfFirst(predicate: (T) -> Boolean): Int

//    indexOfFirst是一个扩展函数，函数内有一个参数（是一个函数），该函数的输入为数组当前类型及其子类型、返回值为Boolean；indexOfFirst返回值为Int

    val index = arr.indexOfFirst { element -> element == "c" }

    println(index)

/*========================== list直接设定容量并初始化==========================*/

//public inline fun <T> MutableList(size: Int, init: (index: Int) -> T): MutableList<T>

//    indexOfFirst内有两个参数（其中一个是函数），该函数的输入为Int、返回值为任意类型；indexOfFirst返回值为init返回值的类型

//    val list = MutableList(10, { index -> 20 })
//    val list = MutableList(10) { it -> 20 }
    val list = MutableList(10) { 20 }
}
