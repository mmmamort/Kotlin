package day03


/**
 * ClassName:`13.继承`
 * Description:
 * kotlin的class默认都是final的  不能被继承
 * 加上open关键字之后  就变成和java一样的class了
 * kotlin的成员函数和成员变量对应的get以及set方法都有final修饰  不能进行继承
 */
fun main(args: Array<String>) {
    val father = Father()
    father.name
    father.age
    father.sayHello()

    val son = Son()
    println(son.name)
    println(son.age)
    son.sayHello()
}

open class Father{
    open var name = "小头爸爸"
    open var age = 40
    open fun sayHello(){
        println("哥们  早上好")
    }
}
//extends
//1.需要将父类加上open关键字
//2.需要加上()
class Son:Father(){
    override var name: String = "大头儿子"
    override var age: Int = 20
    override fun sayHello() {
//        super.sayHello()
        println("同学  早上好")
    }

}