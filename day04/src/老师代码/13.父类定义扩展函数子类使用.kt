package day04.父类定义扩展函数子类使用


/**
 * ClassName:`13.父类定义扩展函数子类使用`
 * Description:
 */
fun main(args: Array<String>) {
    val father = Father()
    father.sayHello()

    val son = Son()
    son.sayHello()

}
//给Father定义扩展函数
fun Father.sayHello(){
    println("打招呼")
}

open class Father

class Son:Father()