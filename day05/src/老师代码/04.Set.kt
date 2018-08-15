package day05

import java.util.*
import kotlin.collections.LinkedHashSet


/**
 * ClassName:`04.Set`
 * Description:
 */
fun main(args: Array<String>) {
    /*---------------------------- 快速Set:不能扩容  不能修改元素 ----------------------------*/
    val set1 = setOf("林青霞","张曼玉","关之琳","林青霞")
//    println(set1)
    /*---------------------------- 可变set ----------------------------*/
    val set2 = mutableSetOf("林青霞","张曼玉","关之琳","林青霞")
    set2.add("张三")
    println(set2)

    /*---------------------------- java的set集合 ----------------------------*/
    val set3 = TreeSet<String>()
    val set4 = LinkedHashSet<String>()
}