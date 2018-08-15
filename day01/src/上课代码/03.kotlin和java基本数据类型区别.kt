package day01


/**
 * ClassName:`03.kotlin和java基本数据类型区别`
 * Description:kotlin只有基本数据类型  没有包装数据类型
 * kotlin基本数据类型相当于具备了java的基本数据类型和包装数据类型的功能
 * 会根据不同的使用场景选择使用基本数据类型还是包装数据类型
 */
fun main(args: Array<String>) {
    //定义Int数据类型
    var a:Int = 10
    //基本加减法
    a = a+10
    //hashCode
    var hashCode = a.hashCode()
    println(hashCode)
}