package 复习.自定义set_get.day03

/**
 * @ 文件名:   `04.自定义set与get`
 * @ 创建者:   Eason
 * @ 时间:    2018/8/8 15:48
 * @ 描述:
 */
fun main(args: Array<String>) {
    var stu1 = Student()
    println(stu1)
    stu1.age = 200
    stu1.sex = "男"
    println(stu1)
}

class Student {
    var name = ""
    var age = 0
//        set方法自定义
        set(value) {
            if (value < 0 || value > 100) {
                println("录入错误")
                return
            }
            //不能写set方法的对象，否则会造成递归，循环赋值，使用field特殊变量
            field = value
        }
    var sex = ""
//        get方法自定义
        get() = "秀吉"

    override fun toString(): String {
        return "Student(name='$name', age=$age, sex='$sex')"
    }
}