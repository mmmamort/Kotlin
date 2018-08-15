package 复习

/**
 * @ 文件名:   `15.最值`
 * @ 创建者:   Eason
 * @ 时间:    2018/8/11 17:32
 * @ 描述:
 */
fun main(args: Array<String>) {

    val list = listOf("z", "e", "t", "n")

    /*---------------------------- 最大值 ----------------------------*/

//    public inline fun <T, R : Comparable<R>> Iterable<T>.maxBy(selector: (T) -> R): T?

    val max = list.maxBy { it }

    println(max)

    /*---------------------------- 最小值 ----------------------------*/

    val min = list.minBy { it }

    println(min)

    val personList = listOf(Person("林青霞", 50), Person("张曼玉", 30), Person("郑少秋", 70))

    /*---------------------------- 对象集合最大值 ----------------------------*/

    val maxAge = personList.maxBy { it.age }

    println(maxAge)

    /*---------------------------- 对象最小值 ----------------------------*/

    val minAge = personList.minBy { it.age }

    println(minAge)
}

data class Person(var name: String, var age: Int)