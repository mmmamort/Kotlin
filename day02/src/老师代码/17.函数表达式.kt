package 老师代码


/**
 * ClassName:`17.函数表达式`
 * Description:
 * 函数表达式:如果函数只有一行处理代码,就可以省略掉{} 以= 连接  去掉return以及返回值类型
 * 函数表达式只能适用于一行代码的函数
 */
fun main(args: Array<String>) {
    val a = 10
    val b = 20
    //求a 加 b 的和
    println(add(a, b))
}
//最标注的写法
//fun add(a: Int, b: Int): Int {
//    return a + b
//}

//函数处理代码只有一行
//如果只有一行可以省略{} 需要在函数和返回值中间加上=   把return去掉
//fun add(a: Int, b: Int): Int = a + b

//智能类型推断
fun add(a: Int, b: Int) = a + b

//fun sayHello(){
//    println("hello")
//}
fun sayHello() = println("hello")

//求a和b的最大值
//从if语句
//函数表达式
//fun max(a:Int,b:Int):Int{
//    if(a>b){
//        return a
//    }else{
//        return b
//    }
//}

//fun max(a:Int,b:Int):Int{
//    return if(a>b){
//         a
//    }else{
//         b
//    }
//}

//fun max(a:Int,b:Int):Int{
//    return if(a>b) a else b
//}

//fun max(a:Int,b:Int):Int = if(a>b) a else b

fun max(a:Int,b:Int) = if(a>b) a else b

fun haha(){
    print("hello")
}




