package 老师代码


/**
 * ClassName:`22.递归`
 * Description:
 */
fun main(args: Array<String>) {
    //5阶乘  5*4*3*2*1   10 10*9*8*7*...*1
//    val result = fact(5)
//    println(result)

    println(fbnq(5))
}
//求n的阶乘 5  5*4的阶乘
fun fact(n:Int):Int{
    if(n==1){
        return 1
    }else{
        return n* fact(n-1)
    }
}

//斐波那契数列   1 1 2 3 5 8 13 21 34 55
//第n个
fun fbnq(n:Int):Int{
    if(n==1||n==2){
        return 1
    }else{
        //第n-1个斐波那契数列  +  第n-2个斐波那契数列
        return fbnq(n-1)+ fbnq(n-2)
    }
}
