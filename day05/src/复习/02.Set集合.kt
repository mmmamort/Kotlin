package 复习

import jdk.nashorn.api.tree.Tree

/**
 * @ 文件名:   `02.set集合`
 * @ 创建者:   Eason
 * @ 时间:    2018/8/11 16:49
 * @ 描述:
 */
fun main(args: Array<String>) {

/*========================== set不可变集合==========================*/
    val set1 = setOf("a", "b", "c", "a")
    println(set1)
/*========================== set可变集合==========================*/
    val mutSet = mutableSetOf("a", "b", "c", "a")
//添加元素
    mutSet.add("e")
/*========================== set子集合==========================*/
    val hashSet = hashSetOf<String>()
/*========================== set集合遍历==========================*/
//    同list
}
