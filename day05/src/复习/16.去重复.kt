package 复习.去重复

/**
 * @ 文件名:   `16.去重复`
 * @ 创建者:   Eason
 * @ 时间:    2018/8/11 17:33
 * @ 描述:
 */
val list1 = listOf("张三", "李四", "王五", "赵六", "张三", "张四", "李六")

fun main(args: Array<String>) {

/*---------------------------- 把重复的张三去掉 ----------------------------*/

    println(list1.distinct())

/*---------------------------- 把重复的姓张的去掉 ----------------------------*/

//    public inline fun <T, K> Iterable<T>.distinctBy(selector: (T) -> K): List<T>

    println(list1.distinctBy {
        val s = it.substring(0, 1)
        if (s == "张") "张"
        else it
    })

}
