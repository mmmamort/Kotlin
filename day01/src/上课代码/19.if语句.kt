package day01


/**
 * ClassName:`19.if语句`
 * Description:
 */
fun main(args: Array<String>) {
    /*---------------------------- 求a和b的最大值 ----------------------------*/
    val a = 10
    val b = 20
    var c: Int
    c = maxValue(a, b)
    println(c)
}
//求a和b最大值
//kotlin里面没有三元运算符
//fun maxValue(a:Int,b:Int):Int{
//    if(a>b){
//        return a
//    }else{
//        return b
//    }
//}

//去{}
//fun maxValue(a:Int,b:Int):Int{
//    if(a>b)
//        return a
//    else
//        return b
//}

//fun maxValue(a:Int,b:Int):Int{
//    if(a>b) return a else return b
//}

fun maxValue(a:Int,b:Int):Int{
    return if(a>b) a else b 
}


//fun maxValue(a: Int, b: Int): Int {
//    return if (a > b) {
//        a
//    } else {
//        b
//    }
//}