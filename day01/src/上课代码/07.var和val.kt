package day01


/**
 * ClassName:`07.var和val`
 * Description:
 * 可变和不可变
 * var 对应java的普通变量
 * val可以简单理解成java的final变量
 * final 编译器常亮
 * val 运行时的
 */
const val d = 10//final
fun main(args: Array<String>) {
    //可变变量var
    var a = 10
    a = 20
    a = 30
    //不可变变量val(value)
    val b = 20
//    b = 30

    /*---------------------------- 项目开发时优先使用var还是val呢? ----------------------------*/
    //能够使用val的话尽量使用val 实在不能使用的话再使用var
    //主要解决的是java中final

}