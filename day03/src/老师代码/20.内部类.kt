package day03.内部类


/**
 * ClassName:`19.内部类`
 * Description:内部类需要通过Inner修饰
 */
fun main(args: Array<String>) {
    val inClass = OutClass().InClass()
}
class OutClass{
    var name = "李四"
    inner class InClass{
        fun sayHello(){
            println(name)
        }
    }
}