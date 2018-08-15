package day05


/**
 * ClassName:`07.Map循环遍历`
 * Description:
 */
fun main(args: Array<String>) {
    val map = mapOf<String,String>("中国" to "China","英国" to "England","美国" to "USA")
    /*---------------------------- 遍历map ----------------------------*/
    /*---------------------------- for循环遍历出Entry对象 ----------------------------*/
//    for (ele in map){
//        val key = ele.key
//        val value = ele.value
//        println("key=$key value=$value")
//    }

    /*---------------------------- for循环遍历出key和value ----------------------------*/
//    for ((key,value) in map){
//        println("key=$key value=$value")
//    }

    /*---------------------------- foreach ----------------------------*/
//    map.forEach {
//        val key = it.key
//        val value = it.value
//        println("key=$key value=$value")
//    }
    /*---------------------------- foreach打印key和value ----------------------------*/
//    map.forEach { key, value ->
//        println("key=$key value=$value")
//    }

    /*---------------------------- 打印key ----------------------------*/
    val keySet = map.keys

    /*---------------------------- 打印value ----------------------------*/
    val values = map.values
    for (value in values) {

    }
    for ((index,ele) in values.withIndex()){

    }
}