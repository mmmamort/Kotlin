package day04


/**
 * ClassName:`10.by lazy惰性加载`
 * Description:
 * by lazy  用在字段,必须val修饰
 * by lazy返回值在最后一行
 * by lazy只会加载一次
 * 对象里面也可以使用by lazy
 * 在以后的开发里面  尽量使用by lazy
 */
//不管你用不用 都会加载  内存都已经申请下来了
//希望用的时候再加载
val name by lazy {
    println("执行了加载的逻辑")
    "张三"
}

class D{
    val name by lazy {
        println("执行了加载的逻辑")
        "张三"
    }
}
fun main(args: Array<String>) {
    //或不会加载多次?
    println(name)
    println(name)
}