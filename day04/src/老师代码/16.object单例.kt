package day04.object单例


/**
 * ClassName:`16.object单例`
 * Description:
 * kotlin的单例  object
 */
fun main(args: Array<String>) {
//    val person1 = Person()
//    val person2 = Person()
    Person.sayHello()
    Person.sayHello()
}
//原理:通过静态代码块创建Person对象实例  用的时候可以使用这个实例
//object单例每一个字段都是静态的  比较消耗内存
//object单例适用:成员变量比较少  成员变量比较多  不适用了
object Person{
    var name = "张三"
    var age = "张三"
    var phone = "张三"
    fun sayHello(){
        println("hello")
    }
}