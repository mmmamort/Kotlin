package 复习

/**
 * @ 文件名:   a
 * @ 创建者:   Eason
 * @ 时间:    2018/8/5 20:10
 * @ 描述:
 */

//不可变参数
const val value = 10

fun main(args: Array<String>) {
    //Java中不可修改的设置为 final
    //(伪)不可变参数
    val a = 10
    //可变参数;
    var b = 10
    b = 20
}