package 复习

/**
 * @ 文件名:   `02.set与get方法`
 * @ 创建者:   Eason
 * @ 时间:    2018/8/8 15:45
 * @ 描述:
 */
fun main(args: Array<String>) {
    var stu1 = Student()
    println(stu1)
    println(stu1.name)//默认生成get方法
    stu1.name = "李明"//默认生成set方法
    stu1.age = 15
    stu1.sex = "男"
    println(stu1)
}

class Student {
    var name = ""
    var age = 0
    var sex = ""
    override fun toString(): String {
        return "Student(name='$name', age=$age, sex='$sex')"
    }
}