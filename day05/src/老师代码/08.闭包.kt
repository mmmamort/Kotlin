package day05


/**
 * ClassName:`08.闭包`
 * Description:函数执行完之后就释放了资源
 */
fun main(args: Array<String>) {
//    test()
//    test()
//    test()


    val block = test()
    block()
    block()
    block()
}
/*fun test():()->Int{//返回值是Int
    var a = 10
    return {
        println(a)
        a++
    }
}*/
fun test():()->Unit{//返回值是函数
    var a = 10
    return {
        println(a)
        a++
    }
}

//fun test(){
//    var a = 10
//    println(a)
//    a++
//}