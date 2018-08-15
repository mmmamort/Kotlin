package day04


/**
 * ClassName:`02.泛型函数`
 * Description:
 */
fun main(args: Array<String>) {
//    parseType<Int>(10)
//    parseType(10)
    parseType('a')
}
//泛型函数
//泛型申明  泛型使用
fun <T>parseType(thing:T){
    when (thing){
        is Int-> println("int类型")
        is String-> println("字符串类型")
        is Char-> println("字符类型")
    }
}