package 复习

/**
 * @ 文件名:   字符串
 * @ 创建者:   Eason
 * @ 时间:    2018/8/5 20:21
 * @ 描述:
 * 1.创建普通字符串
 * 2.创建带格式字符串
 * 3.删除空格，按格式删除空格
 * 4.字符串截取
 * 5.字符串普通分割，多格式分割
 */
fun main(args: Array<String>) {
    var s1 = " abc def ghi "
    var s2 =
            """
                \abc
            \def
                 \ ghi"""
    println(s1)
    println(s2)
    println(s1.trim())
    println(s2.trimMargin("\\"))
    println(s1.substringAfter("a"))//截取“a”以后的
    println(s1.substringAfterLast("c"))//截取最后一个“c”以后的
    println(s2.substringBefore("d"))//截取“d”以前的
    s2.substringBeforeLast("i")//截取最后一个“i”以前的

    println(s1.split(" "))//与java不同 返回的是一个集合
    var list = "abc def-ghi".split(" ", "-")
    println(list)
}
