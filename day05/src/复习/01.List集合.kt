package 复习.List集合

import java.util.*

/**
 * @ 文件名:   `01.List集合`
 * @ 创建者:   Eason
 * @ 时间:    2018/8/11 16:45
 * @ 描述:
 */
fun main(args: Array<String>) {

/*========================== list不可变集合==========================*/
    val list = listOf("a", "b", "c")
    println(list[1])
//修改元素
//    list[0] = "aa"  报错
/*========================== list可变集合==========================*/
    val listM = mutableListOf("a", "b", "c")
//修改元素
    listM[1] = "x"
    listM.set(2, "?")
    println(listM)
/*========================== list子集合==========================*/
    val arrList = arrayListOf(1, 2, 3, 4)
/*========================== list集合遍历==========================*/
    for (s in list) {
        println(s)
    }

    for ((index, s) in list.withIndex()) {
        println("$index,$s")
    }

    list.forEach { println(it) }

    list.forEachIndexed { index, s -> println("$index,$s") }
}

    
