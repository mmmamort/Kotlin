package day04


/**
 * ClassName:`14.扩展函数和成员函数`
 * Description:
 * 优先执行成员函数
 */
fun main(args: Array<String>) {
    val data = Data()
    data.sayHello()
}
fun Data.sayHello(){
    println("扩展函数打印了sayHello")
}
class Data{
    fun sayHello(){
        println("成员函数打印了sayHello")
    }
}