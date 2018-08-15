package 复习

/**
 * @ 文件名:   `15.默认参数与具名参数`
 * @ 创建者:   Eason
 * @ 时间:    2018/8/6 16:57
 * @ 描述:
 */
fun main(args: Array<String>) {
/*========================== 默认参数==========================*/
    student("张三", 20)

/*========================== 具名参数==========================*/
    student1(age = 22)
    student1(name = "李四", age = 24)
}

fun student(name: String, age: Int) {
    println("学生$name,${age}岁")
}

fun student1(name: String = "张三", age: Int) {
    println("学生$name,${age}岁")
}
