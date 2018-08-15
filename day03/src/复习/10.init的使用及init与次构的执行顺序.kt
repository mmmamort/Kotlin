package 复习.init的使用及init与次构的执行顺序.day03

/**
 * @ 文件名:   `10.init的使用及init与次构的执行顺序`
 * @ 创建者:   Eason
 * @ 时间:    2018/8/8 15:56
 * @ 描述:
 */
fun main(args: Array<String>) {
    val person = Person("韩梅梅", 18, "女")
}

class Person(var name: String, var age: Int) {
    init {
        println("主构函数init")//先
    }

    constructor(name: String, age: Int, sex: String) : this(name, age) {
        println("次构函数init")//次
    }
}