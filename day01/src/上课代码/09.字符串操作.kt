package day01


/**
 * ClassName:`09.字符串操作`
 * Description:
 */
fun main(args: Array<String>) {
    val s = "  张三  "
    println(s)
    /*---------------------------- 删除空格 ----------------------------*/
    println(s.trim())
    /*---------------------------- 原样输出字符串删除空格 ----------------------------*/
    val place = """
        /广东省
        /深圳市
        /宝安区
    """.trimMargin("/")
    println(place)



    /*---------------------------- 字符串比较 ----------------------------*/
    val str1 = "hello"
    val str2 = String(charArrayOf('h','e','l','l','o'))
    println(str1)
    println(str2)

    //equals 比较的是值
    println(str1.equals(str2))
    //==和equals效果是一样的
    println(str1==str2)
    //=== 比较的是地址 相当于java的==
    println(str1 === str2)
}