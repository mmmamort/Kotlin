package day05


/**
 * ClassName:`06.Map`
 * Description:
 */
fun main(args: Array<String>) {
    /*---------------------------- mapof ----------------------------*/
    val map = mapOf<String,String>("中国" to "China","英国" to "England","美国" to "USA")
    /*---------------------------- 可变map ----------------------------*/
    val map2 = mutableMapOf("中国" to "China","英国" to "England","美国" to "USA")
//    map2.put()
    //map  相同的key值只能存 一个   形同的hashcode  不是相同的key
    map2.put("中国","Chinese")
    println(map2)
    /*---------------------------- java的map ----------------------------*/
    val map3 = HashMap<String,String>()
    val map4 = hashMapOf("中国" to "China","英国" to "England","美国" to "USA")
}