package day03.内部类使用this


/**
 * ClassName:`19.内部类`
 * Description:内部类需要通过Inner修饰
 */
fun main(args: Array<String>) {
    val inClass = OutClass().InClass()
    inClass.sayHello()
}
class OutClass{
    var name = "李四"
    inner class InClass{
        var name = "张三"
        fun sayHello(){
            println(this@OutClass.name)
        }
    }
}