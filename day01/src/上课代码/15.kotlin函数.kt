package day01


/**
 * ClassName:`15.kotlin函数`
 * Description:
 */
fun main(args: Array<String>) {
    val result = sayHello()
    println(result)
//    sayHello("张三")
//    println(getLength("李四"))
}
/*---------------------------- 无参无返回值函数 ----------------------------*/
fun sayHello(){
    println("hello")
}
/*---------------------------- 有参无返回值 ----------------------------*/
//fun sayHello(name:String){
//    println("hello"+name)
//}
/*---------------------------- 有参有返回值 ----------------------------*/
fun getLength(str:String):Int{
    return str.length
}
fun haha(str:String){
    println("hello")
}
