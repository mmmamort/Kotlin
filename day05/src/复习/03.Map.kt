package 复习.Map

/**
 * @ 文件名:   `03.Map`
 * @ 创建者:   Eason
 * @ 时间:    2018/8/11 16:49
 * @ 描述:
 */
fun main(args: Array<String>) {

/*========================== map不可变集合==========================*/
    val map = mapOf("王小明" to 15, "韩梅梅" to 14, "李雷" to 16)
/*========================== map可变集合==========================*/
    val map1 = mutableMapOf("王小明" to 15, "韩梅梅" to 14, "李雷" to 16)
//取元素
    val element = map1.get("王小明")
    val keys = map1.keys
    println(keys)
    val values = map1.values
    println(values)
//修改元素
/*========================== map集合遍历==========================*/
    println("/*========================== for键值对==========================*/")
    for (entry in map) {
        var name = entry.key
        var age = entry.value
        println("$name,$age")
    }

    println("/*========================== for键值分开打印==========================*/")
    for ((key, value) in map) {
        println("$key,$value")
    }

    println("/*========================== foreach键值对==========================*/")
    map.forEach { println(it) }

    println("/*========================== foreach键值分开打印==========================*/")
    map.forEach { t, u -> println("$t,$u") }
}
