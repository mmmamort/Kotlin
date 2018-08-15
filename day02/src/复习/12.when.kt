package 复习

/**
 * @ 文件名:   `12.when`
 * @ 创建者:   Eason
 * @ 时间:    2018/8/6 16:41
 * @ 描述:
 * 如果是简单的when表达式 支持的6种数据格式  ,when表达式最终都会翻译成switch语句
 * 如果是加强的when表达式,最终会翻译成if else
 */
//人 7 上小学  12 上中学  15 上高中 18 大学  社会大学
//需要判断当前我在干什么?
fun main(args: Array<String>) {
/*========================== ==========================*/
//给定的年纪在干什么事情?
    val age = 20
//    when (age) {
//        7 -> println("上小学")
//        12 -> println("上中学")
//        15 -> println("上高中")
//        18 -> println("大学")
//        else -> println("社会大学")
//    }
/*========================== when加强表达式==========================*/
//给定的年纪在干什么事情?（带范围）
//    when (age) {
//        in 7..11 -> println("上小学")
//        in 12..14 -> println("上中学")
//        in 15..17 -> println("上高中")
//        in 18..21 -> println("大学")
//        else -> println("社会大学")
//    }
/*========================== when加强表达式不带参数==========================*/
//    when {
//        age == 7 -> println("上小学")
//        age in 8..11 -> println("正在上小学")
//        age == 12 -> println("上中学")
//        age in 13..14 -> println("正在上中学")
//        age == 15 -> println("上高中")
//        age in 16..17 -> println("正在上中学")
//        age == 18 -> println("大学")
//        age in 19..21 -> println("大学")
//        else -> println("社会大学")
//    }
/*========================== when加强表达式返回值==========================*/
//如果方法没有返回值,返回默认是Unit
    println(study(age))
}

fun study(age: Int) = when (age) {
    7 -> "上小学"
    in 8..11 -> "正在上小学"
    12 -> "上中学"
    13, 14 -> "正在上中学"
    15 -> "上高中"
    16, 17 -> "正在上中学"
    18 -> "大学"
    in 19..21 -> "大学"
    else -> println("社会大学")//此处返回值为unit
}
