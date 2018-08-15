package day03.修改可见性


/**
 * ClassName:`04.类成员的get和set方法`
 * Description:
 */
fun main(args: Array<String>) {
    //创建Person对象
    val person = Person()
    println(person.name)
    //setName
//    person.name = "李四"
//    person.age
//    person.age = 20

}
//在外面 只能访问name  不能修改name   在里面可以修改
class Person{
    var name = "张三"
    private set//把name的set属性去掉
    //在外面既不能访问age  也不能修改age  在里面可以
    private var age = 20

//    fun sayHello(){
//        name = "李四"
//    }
}