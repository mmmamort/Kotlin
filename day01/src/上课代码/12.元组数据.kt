package day01


/**
 * ClassName:`12.元组数据`
 * Description:
 */
fun main(args: Array<String>) {
    /*---------------------------- 二元元组 ----------------------------*/
    //张三 20
//    val pair = Pair<String,Int>("张三",20)
//    val pair = "张三" to 20
//    val name = pair.first
//    val age = pair.second
//    println(name)
//    println(age)

    /*---------------------------- 三元元组 ----------------------------*/
    //Triple
    //姓名   性别 年纪
    val triple = Triple<String,String,Int>("李四","男",30)
    val name = triple.first
    val sex = triple.second
    val age = triple.third
    println(name)
    println(sex)
    println(age)
}