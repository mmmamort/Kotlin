package 复习.主构函数参数的使用val与var的不同.day03

/**
 * @ 文件名:   `06.主构函数参数的使用val与var的不同`
 * @ 创建者:   Eason
 * @ 时间:    2018/8/8 15:49
 * @ 描述:
 */
fun main(args: Array<String>) {
    var person = Person("", 18, "女")
    person.age
    person.age = 17
    person.name
    person.name = "韩梅梅"
    person.sex
//    person.sex = "女"  val修饰的主构参数没有set方法
}

class Person(var name: String, var age: Int, val sex: String)