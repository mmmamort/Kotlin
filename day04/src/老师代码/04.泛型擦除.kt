package day04.泛型擦除


/**
 * ClassName:`04.泛型擦除`
 * Description:
 * 泛型类型确实不一样,无法获取到泛型类型  就是泛型擦除
 */
fun main(args: Array<String>) {
    val box1 = Box<Int>(10)
    val box2 = Box<String>("张三")
    //box1和box2类型是否一样?类型不一样
    val clz1 = box1.javaClass.name//box1.getclass
    val clz2 = box2.javaClass.name

    Box::class.java

//    println(clz1)
//    println(clz2)


    println(parse(10))
    println(parse("张三"))
    println(parse(Box<String>("")))
}

/**
 * 传递一个泛型数据  返回泛型类型
 *  kotlin解决泛型擦除的问题:1.在泛型前面加上reified  2.在泛型函数前加上inline
 */
inline fun <reified T>parse(thing:T):String{
    return T::class.java.name//不能获取泛型类型 java需要通过反射获取泛型类型
}


open class Box<T>(thing:T)