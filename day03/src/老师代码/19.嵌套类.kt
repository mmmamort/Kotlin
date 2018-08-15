package day03.嵌套类


/**
 * ClassName:`19.嵌套类`
 * Description:嵌套类 默认都是static修饰的 静态类不依赖于外部环境
 */
fun main(args: Array<String>) {
    val inClass = OutClass.InClass()
}
class OutClass{
    var name = "李四"
    class InClass{
        fun sayHello(){
//            println(name)
        }
    }
}