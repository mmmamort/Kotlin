package 复习.object单例

/**
 * @ 文件名:   object单例
 * @ 创建者:   Eason
 * @ 时间:    2018/8/9 15:23
 * @ 描述:
 */
fun main(args: Array<String>) {
//    val p1 = Person()
//    val p2 = Person()
    Person.sayHello()
}

//不创建对象就可以访问成员，kotlin没有static修饰符
object Person {
    fun sayHello() {//单例中默认所有的东西都是static的，比较消耗内存，只适合属性方法不多的情况；如果有非静态的方法属性，则需要使用伴生对象
        println("Hello")
    }
}