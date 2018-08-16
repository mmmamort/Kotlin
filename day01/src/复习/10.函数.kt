package 复习

/**
 * @ 文件名:   `10.函数`
 * @ 创建者:   Eason
 * @ 时间:    2018/8/5 20:52
 * @ 描述:
 */
fun main(args: Array<String>) {
    sayHello()
    println(sayHello2())
    sayHello3("李明")
    println(sayHello4("韩梅梅"))
/*============================= 嵌套=============================*/
    fun sayHello5() {
        println("Hello5!!!")
    }
    sayHello5()
}

/*========================== 无参无返回==========================*/
fun sayHello() {
    println("Hello!!!")
}

/*========================== 无参有返回==========================*/
fun sayHello2(): String {
    return "Hello2!!!"
}

/*========================== 有参无返回==========================*/
fun sayHello3(name: String) {
    println("$name Hello3!!!")
}

/*========================== 有参有返回==========================*/
fun sayHello4(name: String): String {
    return "$name Hello4!!!"
}