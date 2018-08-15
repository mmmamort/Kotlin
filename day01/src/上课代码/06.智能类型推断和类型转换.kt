package day01


/**
 * ClassName:`06.智能类型推断和类型转换`
 * Description:
 * kotlin对于类型检查非常严格 不同的数据类型之间不能直接赋值
 */
fun main(args: Array<String>) {
    /*---------------------------- 智能类型推断 ----------------------------*/
//    var a:Int = 10//标准写法
    var a = 10 //kotlin编译器会根据变量值 推断出来当前数据类型就是Int数据类型
    var b = 10L
    var c = 10

    /*---------------------------- 类型转换:基本数据类型 ----------------------------*/
    var m = 10//Int
    var n = 20L//Long
    //m赋值给n
    n = m.toLong()
    //n赋值给m
    m = n.toInt()

    //java  kotlin  js  python
    //检查的严格程度:js python   java  kotlin
}