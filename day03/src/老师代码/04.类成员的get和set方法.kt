package day03


/**
 * ClassName:`04.类成员的get和set方法`
 * Description:
 * 类成员可以访问并且可以修改
 * kotlin的类成员变量默认已经实现了get以及set方法
 */
fun main(args: Array<String>) {
    //创建Person对象
    val person = Person()
    //getName
    println(person.name)
    //setName
//    person.name = "李四"
    println(person.name)

}
class Person{
    val name = "张三"
    var age = 20
}