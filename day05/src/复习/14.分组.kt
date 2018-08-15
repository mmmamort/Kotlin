package 复习.分组

/**
 * @ 文件名:   `14.分组`
 * @ 创建者:   Eason
 * @ 时间:    2018/8/11 17:31
 * @ 描述:
 */

val list1 = listOf("张三", "李四", "王五", "赵六", "张四", "李五", "李六")

/*---------------------------- 姓张的一组 姓李的一组 其他一组 ----------------------------*/

//public inline fun <T, K> Iterable<T>.groupBy(keySelector: (T) -> K): Map<K, List<T>>

fun main(args: Array<String>) {
    val map = list1.groupBy {
        val s = it.substring(0, 1)
        when (s) {
            "张" -> "张"
            "李" -> "李"
            else -> "其他"
        }
    }
    println(map)
}