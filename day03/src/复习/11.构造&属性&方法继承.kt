package 复习

/**
 * @ 文件名:   `11.构造&属性&方法继承`
 * @ 创建者:   Eason
 * @ 时间:    2018/8/8 16:00
 * @ 描述:
 */
fun main(args: Array<String>) {
    var son = Son("李明", 12)
    son.age = 12
}

open class Father(var name: String, var age: Int) {
    //属性或方法不写Open，子类无法重写
    fun behaviour() {
        println("上班")
    }
}

class Son(name: String, age: Int) : Father(name, age)//无参可以省略子类的括号