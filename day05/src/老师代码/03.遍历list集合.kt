package day05


/**
 * ClassName:`03.遍历list集合`
 * Description:
 */
fun main(args: Array<String>) {
    val list = listOf("林青霞","张曼玉","关之琳")
    /*---------------------------- for ----------------------------*/
//    for (s in list) {
//        println(s)
//    }

//    for ((index,s) in list.withIndex()) {
//        println(s)
//    }
    /*---------------------------- foreach ----------------------------*/
    list.forEach {
        println(it)
    }
    list.forEachIndexed { index, s ->

    }
}