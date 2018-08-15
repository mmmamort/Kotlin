package day05


/**
 * ClassName:`22.最值`
 * Description:
 */
fun main(args: Array<String>) {
    val list = listOf("z", "e", "t", "n")
    /*---------------------------- 最大值 ----------------------------*/
    val max = list.max()
//    println(max)
    /*---------------------------- 最小值 ----------------------------*/
    val min = list.min()
//    println(min)

    val personList = listOf(Person("林青霞",50),Person("张曼玉",30),Person("郑少秋",70))
    /*---------------------------- 对象集合最大值 ----------------------------*/
    val maxAge = personList.maxBy { it.age }
//    println(maxAge)
    /*---------------------------- 对象最小值 ----------------------------*/
    println(personList.minBy { it.age })
}