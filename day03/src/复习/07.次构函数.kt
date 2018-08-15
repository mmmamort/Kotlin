package 复习.次构函数.day03

/**
 * @ 文件名:   `07.次构函数`
 * @ 创建者:   Eason
 * @ 时间:    2018/8/8 15:51
 * @ 描述:
 */

/*========================== 次构函数一定要调用主构函数==========================*/

class Person(var name: String, var age: Int) {
    constructor(name: String, age: Int, sex: String) : this(name, age)
}