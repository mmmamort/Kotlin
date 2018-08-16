package 复习.构建器

/**
 * @ 文件名:   `05.构建器`
 * @ 创建者:   Eason
 * @ 时间:    2018/8/16 23:43
 * @ 描述:
 */

fun main(args: Array<String>) {
    val person = Temp()
            .setName("王小明")
            .setAge(10)
            .setSex("男")
            .returnPerson()
    println(person)
}

data class Temp(var name: String? = null, var age: Int? = null, var sex: String? = null) {
    fun setName(name: String): Temp {
        this.name = name
        return this
    }

    fun setAge(age: Int): Temp {
        this.age = age
        return this
    }

    fun setSex(sex: String): Temp {
        this.sex = sex
        return this
    }

    fun returnPerson(): Person {
        return Person(this)
    }
}

data class Person(var name: String? = null, var age: Int? = null, var sex: String? = null) {
    constructor(temp: Temp) : this() {
        this.name = temp.name
        this.age = temp.age
        this.sex = temp.sex
    }
}