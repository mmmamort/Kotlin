package 复习.标准写法

/**
 * @ 文件名:   标准写法
 * @ 创建者:   Eason
 * @ 时间:    2018/8/12 21:50
 * @ 描述:
 */
fun main(args: Array<String>) {
    val address = Address("香港", "九龙", 12)
    val person = Person("朱茵", 46, address)
    println(person)

}

data class Person(var name: String, var age: Int, var address: Address)
data class Address(var city: String, var street: String, var number: Int)