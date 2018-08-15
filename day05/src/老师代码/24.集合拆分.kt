package day05


/**
 * ClassName:`24.集合拆分`
 * Description:
 */
fun main(args: Array<String>) {
    val list = listOf("张三","李四","王五","赵六","张四","李五","李六")
    /*---------------------------- 姓张的一部分,另外的一部分 ----------------------------*/
    //两个集合
    val pair = list.partition {
        it.substring(0,1)=="张"
    }
    println(pair.first)
    println(pair.second)
}