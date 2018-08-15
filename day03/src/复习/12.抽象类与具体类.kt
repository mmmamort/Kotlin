package 复习.抽象类与具体类.day03

/**
 * @ 文件名:   `12.抽象类与具体类`
 * @ 创建者:   Eason
 * @ 时间:    2018/8/8 16:00
 * @ 描述:
 */
fun main(args: Array<String>) {
    var cat = Cat()
    cat.name = "小咪"
    cat.eat()
}

abstract class Animal {
    abstract var name: String
    abstract fun eat()
}

class Cat : Animal() {
    override var name: String = ""

    override fun eat() {
        println("${name}吃小鱼干")
    }
}