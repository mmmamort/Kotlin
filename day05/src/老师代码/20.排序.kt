package day05


/**
 * ClassName:`20.排序`
 * Description:
 */
fun main(args: Array<String>) {
    val list = listOf("g", "u", "q", "n", "d", "z", "a")
    /*---------------------------- 正序排序 ----------------------------*/
    val list1 = list.sorted()
//    println(list1)
    /*---------------------------- 倒序排序 ----------------------------*/
    val list2 = list.sortedDescending()
//    println(list2)

    /*---------------------------- 按字段排序 ----------------------------*/
    val personList = listOf(Person("林青霞",50),Person("张曼玉",30),Person("郑少秋",70))
    //普通对象不能直接比较 必须实现Compable或者传递Compator比较器
    val list5 = personList.sortedBy {
        it.age
    }
//    println(list5)
    val list6 = personList.sortedByDescending { it.age }
    println(list6)
}
data class Person(val name:String,val age:Int)
