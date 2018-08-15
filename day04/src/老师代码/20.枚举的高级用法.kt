package day04


/**
 * ClassName:`20.枚举的高级用法`
 * Description:
 * RED     r:255   g:0  b:0
 * GREEN   r:0   g:255  b:0
 * BLUE    r:0   g:0   b:255
 */
fun main(args: Array<String>) {
    println(Color.RED.r)
}
//枚举高级用法
enum class Color(var r:Int,var g:Int,var b:Int){
    RED(255,0,0),GREEN(0,255,0),BLUE(0,0,255)
}
