package 复习.排序

import 复习.list

/**
 * @ 文件名:   `13.排序`
 * @ 创建者:   Eason
 * @ 时间:    2018/8/11 17:30
 * @ 描述:
 */
fun main(args: Array<String>) {

    val list1 = listOf("g", "u", "q", "n", "d", "z", "a")

/*---------------------------- 正序排序 ----------------------------*/

//    public fun <T : Comparable<T>> Iterable<T>.sorted(): List<T>

    val list2 = list1.sorted()

    println(list2)

/*---------------------------- 倒序排序 ----------------------------*/

    val list3 = list1.sortedDescending()

    println(list3)

/*---------------------------- 按字段排序 ----------------------------*/

//    public inline fun <T, R : Comparable<R>> Iterable<T>.sortedBy(crossinline selector: (T) -> R?): List<T>

    val personList = listOf(Person("林青霞", 50), Person("张曼玉", 30), Person("郑少秋", 70))

    val list4 = personList.sortedBy { it.age }

    println(list4)

}

data class Person(var name: String, var age: Int)
