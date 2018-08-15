package 复习

/**
 * @ 文件名:   `08.元组`
 * @ 创建者:   Eason
 * @ 时间:    2018/8/5 20:40
 * @ 描述:
 */
fun main(args: Array<String>) {
    //二元
    var student1 = Pair("张三", 20)
    println(student1)
    println(student1.first)
    println(student1.second)

    //二元快捷
    var student2 = "李四" to 22
    println(student2)

    //三元
    var student3 = Triple("王五", "男", 23)
    println(student3)
    println(student3.first)
    println(student3.second)
    println(student3.third)

}