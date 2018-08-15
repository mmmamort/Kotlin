package 复习

/**
 * @ 文件名:   `20.新建对象`
 * @ 创建者:   Eason
 * @ 时间:    2018/8/6 17:05
 * @ 描述:
 */
/*========================== 新建学生对象==========================*/
fun main(args: Array<String>) {
    val stu1 = Student()
    println(stu1.name)
    println(stu1.age)
    stu1.gaoShiQing()
}

class Student {
    var name = "张三"
    var age = 22

    fun gaoShiQing() {
        println("你愁啥")
    }
}
    