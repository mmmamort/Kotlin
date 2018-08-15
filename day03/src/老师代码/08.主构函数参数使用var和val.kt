package day03.主构函数参数使用var和val


/**
 * ClassName:`06.主构函数`
 * Description:
 * 加上var和val之后相当于帮我们定义了字段  可以直接使用
 */
fun main(args: Array<String>) {
    val person1 = Person("张三",20)

    person1.name
    person1.name = "李四"
    println(person1.name)

}
//kotlin构造函数
//加上var之后  帮我们做了什么事情呢?
class Person(var name:String,val age:Int)
