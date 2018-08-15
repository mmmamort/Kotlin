package day03.构造函数参数继承


/**
 * ClassName:`13.继承`
 * Description:
 */
fun main(args: Array<String>) {
//    val father = Father()
//    father.name
//    father.age
//    father.sayHello()

    val son = Son("张三",20)
    println(son.name)
    println(son.age)
    son.sayHello()
}

open class Father(var name:String,var age:Int){
    open fun sayHello(){
        println("哥们  早上好")
    }
}
//extends
//1.需要将父类加上open关键字
//2.需要加上()
class Son(name:String,age:Int):Father(name,age)