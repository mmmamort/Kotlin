package day05

import java.util.*
import kotlin.collections.HashMap


/**
 * ClassName:`01.java的集合体系`
 * Description:
 */
fun main(args: Array<String>) {
    /*---------------------------- List ----------------------------*/
    //ArrayList
    //Vector
    val list = ArrayList<String>()
    list.add("林青霞")
    list.add("张曼玉")
    list.add("关之琳")
    list.add("林青霞")
//    println(list)
//    Vector

    /*---------------------------- Set ----------------------------*/
    //HashSet
//    val set1 = HashSet<String>()
//    set1.add("林青霞")
//    set1.add("张曼玉")
//    set1.add("关之琳")
//    set1.add("林青霞")
//    println(set1)
    //TreeSet 可以对元素进行排序
//    val set2 = TreeSet<String>()
//    set2.add("g")
//    set2.add("z")
//    set2.add("e")
//    set2.add("a")
//    println(set2)

    /*---------------------------- Map ----------------------------*/
    //HashMap
    //HashTable
    val hashMap = HashMap<String,String>()
    hashMap.put("中国","China")
    hashMap.put("英国","England")
    hashMap.put("美国","USA")

    val value = hashMap.get("中国")
    println(value)
    val keySet = hashMap.keys
    val values = hashMap.values

}