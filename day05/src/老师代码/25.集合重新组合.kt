package day05


/**
 * ClassName:`25.集合重新组合`
 * Description:
 */
fun main(args: Array<String>) {
    val personList = listOf(Person("林青霞",50),Person("张曼玉",30),Person("郑少秋",70))
    /*---------------------------- 将Person里面每一个name获取 ----------------------------*/
   val nameList =  personList.map {
        it.name
    }
    println(nameList)

//    flatMap
}