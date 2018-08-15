package 老师代码.haha


/**
 * ClassName:`18.函数变量和函数引用`
 * Description:
 * java 函数二等公民
 * kotlin 函数一等公民
 * 对象可以定义对象变量,函数也可以定函数变量
 */
fun main(args: Array<String>) {
    val a = 10
    val b = 20
    var sum = 0
    /*---------------------------- 函数变量 ----------------------------*/
//    //a+b
//    //padd相当于定义了函数变量
//    val padd:((Int,Int)->Int)? = {m,n->m+n}
//    //第一种调用方式
////    sum = padd(a,b)
//    //第二种方式:可以进行可空类型调用判断
//    padd?.invoke(a,b)
//
//    println(sum)

    /*---------------------------- 函数引用 ----------------------------*/
    val padd = ::add //获取函数引用 相当于c语言函数指针
    //调用函数
    padd(10,20)
    padd.invoke(10,20)
}

fun add(a: Int, b: Int): Int {
    return a + b
}

fun sub(a:Int,b:Int):Int{
    return a-b
}