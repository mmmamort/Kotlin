package 复习.闭包


/**
 * @ 文件名:   `04.闭包`
 * @ 创建者:   Eason
 * @ 时间:    2018/8/11 16:52
 * @ 描述:定义在函数内部的函数
 */
fun main(args: Array<String>) {
    val func = addA()
//    func()  func是一个函数所以需要加()来运行
    func()
    func()
    func()
}

fun addA(): () -> Unit {//返回值类型为 () -> Unit ，一个无返回值的函数
    var a = 0
    return {
        //返回的是一个函数
        println(a)
        a++
    }
}