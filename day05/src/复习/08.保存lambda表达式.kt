package 复习.保存lambda表达式

/**
 * @ 文件名:   `08.保存lambda表达式`
 * @ 创建者:   Eason
 * @ 时间:    2018/8/11 17:07
 * @ 描述:
 */
fun main(args: Array<String>) {
    val func = { a: Int, b: Int ->
        a + b
    }
    println(func(1, 2))
}