package day04


/**
 * ClassName:`15.子类和父类扩展函数`
 * Description:
 * 对于扩展函数:如果我们通过父类接收  执行的是父类的扩展函数
 */
fun main(args: Array<String>) {
    val view = View()
    val button:Button = Button()

//    view.onclick()
    button.onclick()
}
fun View.onclick(){
    println("点击了view")
}

fun Button.onclick(){
    println("点击了button")
}
open class View

class Button:View()