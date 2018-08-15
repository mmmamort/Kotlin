package 复习.嵌套类.day03

/**
 * @ 文件名:   `16.嵌套类`
 * @ 创建者:   Eason
 * @ 时间:    2018/8/8 16:04
 * @ 描述:
 */
fun main(args: Array<String>) {
    Person.man().say()//嵌套类被static修饰，可以直接调用
}

class Person {
    var name = ""

    class man {
        //name 嵌套类独立存在无法获取到外部类中的内容
        fun say() {
            println("i am a man")
        }
    }
}