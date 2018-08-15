package 复习

/**
 * @ 文件名:   `02.break与continue`
 * @ 创建者:   Eason
 * @ 时间:    2018/8/6 16:21
 * @ 描述:"abcdefghijkl"
 */
fun main(args: Array<String>) {
    var s = "abcdefghijkl"
/*========================== 遍历元素：找到字符x停止==========================*/
    for (c in s) {
        println(c)
        if (c == 'f') break
    }
    println("/*========================== ==========================*/")
/*========================== 遍历元素：不打印字符x==========================*/
    //foreach是一个高级函数不能使用被打断
    for (c in s) {
        if (c == 'd') continue
        println(c)
    }
}
