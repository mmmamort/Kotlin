package 复习.中缀表达式

/**
 * @ 文件名:   `05.中缀表达式`
 * @ 创建者:   Eason
 * @ 时间:    2018/8/9 15:12
 * @ 描述:
 */
fun main(args: Array<String>) {
    val 李明 = Person()
    李明 sayHello "韩梅梅"
}

class Person {
    infix fun sayHello(name: String) {
        println("Hello $name")
    }
}