package 复习.数据类

/**
 * @ 文件名:   `15.数据类`
 * @ 创建者:   Eason
 * @ 时间:    2018/8/9 15:28
 * @ 描述:
 */
fun main(args: Array<String>) {
    var stu = Student("王小明", 19, "男")
    println(stu.component1())//componentN   N为数据类中第几个接口的变量
    stu.age = 33//可以使用普通的SET GET方法
    println(stu.component2())
    println(stu.component3())
}

data class Student(var name: String, var age: Int, var sex: String)