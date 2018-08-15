package 复习.集合过滤

/**
 * @ 文件名:   `12.集合过滤`
 * @ 创建者:   Eason
 * @ 时间:    2018/8/11 17:27
 * @ 描述:
 */
val list1 = listOf("张三", "李四", "王五", "赵六", "张四", "李五", "李六")
val list2 = listOf("周芷若", "张无忌", "张五", "李善长", "林青霞", "李寻欢")
fun main(args: Array<String>) {

/*========================== 找到第一个姓张的==========================*/

//    public inline fun <T> List<T>.indexOfFirst(predicate: (T) -> Boolean): Int

    val member1 = list1.indexOfFirst { it.startsWith("张") }

    println(list1[member1])

/*========================== 把第一个集合中所有姓张的找出来==========================*/

//    public inline fun <T> Iterable<T>.filter(predicate: (T) -> Boolean): List<T>

    val list3 = list1.filter { it.startsWith("张") }

    println(list3)

/*========================== 把两个集合中所有姓张的找到并存放在同一个集合中==========================*/

//    public inline fun <T, C : MutableCollection<in T>> Iterable<T>.filterTo(destination: C, predicate: (T) -> Boolean): C

    val list4 = mutableListOf<String>()

    list1.filterTo(list4, { it.startsWith("张") })

    list2.filterTo(list4, { it.startsWith("张") })

    println(list4)

/*========================== 把第一个集合中角标为偶数的元素找出来==========================*/

//    public inline fun <T> Iterable<T>.filterIndexed(predicate: (index: Int, T) -> Boolean): List<T>

    val list5 = list1.filterIndexed { index, s -> index % 2 == 0 }

    println(list5)
}
