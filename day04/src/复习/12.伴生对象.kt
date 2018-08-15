package 复习.伴生对象

import 复习.伴生对象.Person.Companion.name1

/**
 * @ 文件名:   `12.伴生对象`
 * @ 创建者:   Eason
 * @ 时间:    2018/8/9 15:24
 * @ 描述:类中可以有非静态成员及(伴生对象：单例)
 */
/*object Person只适用于字段比较少的情况
class Person {
    var name: String = ""

    companion object {
        val name1 = "韩梅梅"//静态
        fun sayHello() {//静态
            println("Hello $name1")
        }
    }
}*/

/*========================== 仿Java懒汉式单例==========================*/
//私有化构造方法
class Person private constructor() {
    var name: String = ""

    companion object {
        //私有化对象，省去了if判断，惰性加载只会实现一次 bylazy 还是线程安全的不需要上锁
        val person by lazy { Person() }
        val name1 = "韩梅梅"//静态
    }

    fun sayHello() {//静态
        println("Hello $name1")
    }
}

fun main(args: Array<String>) {
    Person.person.sayHello()
}