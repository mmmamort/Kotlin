package 复习.枚举及其高级用法

/**
 * @ 文件名:   `14.枚举及其高级用法`
 * @ 创建者:   Eason
 * @ 时间:    2018/8/9 15:28
 * @ 描述:
 */
fun main(args: Array<String>) {
    cheakWorkDay(Week.星期一)
    println(RGB.Blue.b)//可以获取枚举的变量，也可以重新赋值
    RGB.Red.r = 20
    println(RGB.Red.r)
}

enum class Week {
    星期一, 星期二, 星期三, 星期四, 星期五, 星期六, 星期日
}

fun cheakWorkDay(day: Week) {
    when (day) {
        in Week.星期一..Week.星期五 -> println("上班")
        in Week.星期六..Week.星期日 -> println("休息")
        else -> {
        }
    }
}

enum class RGB(var r: Int, var g: Int, var b: Int) { //高级用法，枚举可以有参数
    Red(255, 0, 0), Green(0, 255, 0), Blue(0, 0, 255)
}