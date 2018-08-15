package 复习.惰性加载与延迟加载

/**
 * @ 文件名:   `07.惰性加载与延迟加载`
 * @ 创建者:   Eason
 * @ 时间:    2018/8/9 15:21
 * @ 描述:
 */

val numberA: Int by lazy {
    println("如果比main函数早，numberA则自动加载")
    10
} //惰性加载：用的时候才加载，只加载一次，必须是val修饰


fun main(args: Array<String>) {
    println("惰性加载有没有自动加载")
    println(numberA)

    StringB().print()
}

class StringB {
    lateinit var stringB: String
    /*
    基本数据类型不能使用 延迟加载：稍后再赋值，因为Kotlin中变量一定要赋值，
    容易造成变量初始化没赋值而没检测出来，通过延迟加载并通过运行异常来找到未初始化的参数
    */
    fun print() {
        stringB = "20"
        println(stringB)
    }
}

