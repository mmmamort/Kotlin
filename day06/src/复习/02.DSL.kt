package 复习.DSL


/**
 * @ 文件名:   DSL
 * @ 创建者:   Eason
 * @ 时间:    2018/8/12 21:54
 * @ 描述:
 */
fun main(args: Array<String>) {
    val person = person {
        name = "朱茵"
        age = 46
        address {
            //address为内部嵌套了一个函数的函数
            city = "深圳"//这个内部函数需要在Address中才能直接使用Address的成员
            street = "西丽"
            number = 162
        }
    }
    println(person)
}

fun person(block: Person.() -> Unit): Person {//Person下的一个方法，即block为Person的扩展函数
    return Person().apply(block)
}

fun Person.address(block: Address.() -> Unit) {
//这里不应该使用return，而是将address对象返回给person对象
//所以address函数应该为Person的内部函数，将这里新建的Address对象返回给person中的Address
    this.address = Address().apply(block)
}

data class Person(var name: String? = null, var age: Int? = null, var address: Address? = null)
data class Address(var city: String? = null, var street: String? = null, var number: Int? = null)