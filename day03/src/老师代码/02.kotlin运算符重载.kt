package day03.运算符重载


/**
 * ClassName:`01.kotlin运算符重载`
 * Description:
 * 运算符重载步骤:
 * 在对象里面定义一个运算符函数(官网查看对应关系)
 * 方法前面加上operator
 */
fun main(args: Array<String>) {
    val girl1 = Girl()
    val girl2 = Girl()
//    val totalAge = girl1 + girl2
//    println(totalAge)
    girl1 + 10

}

class Girl {
    var name: String = "张三"
    var age: Int = 10
    /**
     * 运算符重载方法
     */
//    operator fun plus(girl: Girl): Int {
//        return age + girl.age
//    }

    operator fun plus(ele: Int): Int {
        return age + ele
    }
}