package day03.主构函数参数使用


/**
 * ClassName:`06.主构函数`
 * Description:
 */
fun main(args: Array<String>) {
    val person1 = Person("张三",20)
    val person2 = Person("李四",20)
    val person3 = Person("王五",40)

//    Person()

    person1.name
    person1.name = "李四"
    println(person1.name)

}
//kotlin构造函数
class Person(name:String,age:Int){
    var name = ""
    var age = 0
    //构造函数里面实现赋值
    //如果说想要在构造函数里面实现一些操作 把代码写在init
    init {
        this.name = name
        this.age = age
    }

}
class Data{
    init {

    }
}

//class Person{
//    var name = "张三"
//    var age = 20
//}