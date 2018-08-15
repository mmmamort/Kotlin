package 复习.类成员私有化.day03

/**
 * @ 文件名:   `03.类成员私有化`
 * @ 创建者:   Eason
 * @ 时间:    2018/8/8 15:46
 * @ 描述:
 */
fun main(args: Array<String>) {
    var stu1 = Student()
    println(stu1)
    println(stu1.name)//默认生成get方法
    stu1.name = "李明"//默认生成set方法
    stu1.age = 15
    stu1.sex = "男"
    stu1.age
    println(stu1)
}

class Student {
    var name = ""
    //    private var name = ""   私有属性
    //    private set   私有name的set方法
    var age = 0
    //    private set   私有age的set方法
    var sex = ""

    override fun toString(): String {
        return "Student(name='$name', age=$age, sex='$sex')"
    }
}