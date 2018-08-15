package day05


/**
 * ClassName:`13.单独存在的lambda表达式`
 * Description:
 */
fun main(args: Array<String>) {
    /*---------------------------- 无参的lambda表达式 ----------------------------*/
    //无参lambda表达式
//    {
//        println("hello")
//    }()

//    {
//        println("hello")
//    }.invoke()
    /*---------------------------- 有参的lambda表达式 ----------------------------*/
//    val result = {a:Int,b:Int->
//        a+b
//    }(10,20)
//    println(result)

    val result = {a:Int,b:Int->
        a+b
    }.invoke(10,20)
    println(result)

}