package 复习.次构函数参数的使用.day03

/**
 * @ 文件名:   `09.次构函数参数的使用`
 * @ 创建者:   Eason
 * @ 时间:    2018/8/8 15:52
 * @ 描述:
 */
fun main(args: Array<String>) {
    val person = Person("李明", 15, "男", 13999999999)
}

class Person(var name: String, var age: Int) {
    var sex = ""
    var phone = 0L

    constructor(name: String, age: Int, sex: String) : this(name, age) {
        this.sex = sex
    }

    constructor(name: String, age: Int, sex: String, phone: Long) : this(name, age, sex) {
        this.phone = phone
    }
}