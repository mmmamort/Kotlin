package day05.lambda表达式去括号


/**
 * ClassName:`09.高阶函数`
 * Description:
 */
fun main(args: Array<String>) {
    val a = 10
    val b = 20
    //a+b
    var sum = 0
    //a-b
    var result = 0


    /*---------------------------- lambda表达式 ----------------------------*/
    //lambda表达式:匿名函数
    //匿名函数==lambda表达式
    //lambda表达式和高阶函数一般是成对出现的,但是lambda也可以独立存在

//    sum = cacl(a,b,{m,n->
//        m+n
//    })

    //lambda表达式是最后一个参数,可以把()前移
    //如果()前移之后  ()里面没有参数  ()可以省略
    sum = cacl(a,b){m,n->
        m+n
    }


    result = cacl(a,b,{m,n->
        m-n
    })

    println(sum)
    println(result)
}
//不知道具体是要求和还是求差  只要传递一个和的运算规则 就可以求和  传递一个求差的运算规则就可以求差
//高阶函数:把函数作为参数或者返回值的函数就是高阶函数
fun cacl(m:Int,n:Int,block:(Int,Int)->Int):Int{
    return block(m,n)
}
