package 复习.次构函数间的相互调用.day03

/**
 * @ 文件名:   `08.次构参数间的相互调用`
 * @ 创建者:   Eason
 * @ 时间:    2018/8/8 15:51
 * @ 描述:
 */

class Person(var name: String, var age: Int) {
    constructor(name: String, age: Int, sex: String) : this(name, age)
    constructor(name: String, age: Int, sex: String, phone: Long) : this(name, age, sex)
}