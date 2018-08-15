package day04.实现和java一样的单例


/**
 * ClassName:`18.实现和java一样的单例`
 * Description:
 */
fun main(args: Array<String>) {
    Person.person.sayHello()
    Person.person.sayHello()
    Person.person.sayHello()
    Person.person.sayHello()
}
//java的懒汉式方式
class Person private constructor(){//1.私有化构造函数
    var name = "张三"
    companion object {
        //2.定义静态变量保存对象实例  by lazy线程安全
        val person by lazy { Person() }
    }

    fun sayHello(){
        println("年后")
    }
}