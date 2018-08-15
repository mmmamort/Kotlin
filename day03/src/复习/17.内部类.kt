package 复习

/**
 * @ 文件名:   `17.内部类`
 * @ 创建者:   Eason
 * @ 时间:    2018/8/8 16:04
 * @ 描述:
 */
fun main(args: Array<String>) {
    Person().man().say()//与嵌套类不同通过外部类对象调用
}

class Person {
    var name = "李明"

    inner class man {
        //name 嵌套类独立存在无法获取到外部类中的内容
        fun say() {
            println("${this@Person.name}:i am a man")//通过@外部类，来调用外部类成员
        }
    }
}