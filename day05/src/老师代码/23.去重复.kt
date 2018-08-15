package day05


/**
 * ClassName:`23.去重复`
 * Description:
 */
fun main(args: Array<String>) {
    val list = listOf("张三","李四","王五","赵六","张三","张四","李六")
    /*---------------------------- 把重复的张三去掉 ----------------------------*/
//    println(list.toSet())
    //重复的元素
    println(list.distinct())

    /*---------------------------- 把重复的姓张的去掉 ----------------------------*/
    println(list.distinctBy {
        val first = it.substring(0, 1)
        if(first=="张"){
            "张"
        }else{
            it
        }
    })
}