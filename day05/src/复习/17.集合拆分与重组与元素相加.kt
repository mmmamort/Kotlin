package 复习.集合拆分与重组

import 复习.Person

/**
 * @ 文件名:   `17.集合拆分与重组`
 * @ 创建者:   Eason
 * @ 时间:    2018/8/11 17:34
 * @ 描述:
 */
fun main(args: Array<String>) {

    val list1 = listOf("张三", "李四", "王五", "赵六", "张四", "李五", "李六")

/*---------------------------- 姓张的一部分,另外的一部分 ----------------------------*/

//public inline fun <T, K> Iterable<T>.groupBy(keySelector: (T) -> K): Map<K, List<T>>

    val list2 = list1.partition { it.startsWith("张") }

    println(list2)

    val personList = listOf(Person("林青霞", 50), Person("张曼玉", 30), Person("郑少秋", 70))

/*---------------------------- 将Person里面每一个name获取 ----------------------------*/

//public inline fun <T, R> Iterable<T>.map(transform: (T) -> R): List<R>

    val nameList = personList.map { it.name }

    println(nameList)

/*---------------------------- 求出所有人的年龄之和 ----------------------------*/

//    public inline fun <T> Iterable<T>.sumBy(selector: (T) -> Int): Int

    val sum = personList.sumBy { it.age }

    println(sum)

}
