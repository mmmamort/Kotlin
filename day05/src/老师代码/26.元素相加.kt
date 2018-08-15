package day05


/**
 * ClassName:`26.元素相加`
 * Description:
 */
fun main(args: Array<String>) {
    val personList = listOf(Person("林青霞",50),Person("张曼玉",30),Person("郑少秋",70))
    /*---------------------------- 求出所有人的年龄之和 ----------------------------*/
    val totalAge = personList.sumBy {
        it.age
    }
    println(totalAge)

//    personList.sumByDouble {  }
}