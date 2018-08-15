package day03.init和次构函数执行顺序


/**
 * ClassName:`06.主构函数`
 * Description:
 * kotlin  init代码优先于次构函数执行
 */
fun main(args: Array<String>) {
    val person = Person("张三",20)
}

class Person{
    //执行在主构函数
    init {
        println("执行了init")
    }
    constructor(name:String,age:Int){
        println("执行了次构")
    }
}
