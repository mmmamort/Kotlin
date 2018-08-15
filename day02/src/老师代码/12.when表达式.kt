package 老师代码


/**
 * ClassName:`12.when表达式`
 * Description:
 */
fun main(args: Array<String>) {
    //人 7 上小学  12 上中学  15 上高中 18 大学  社会大学
    var age = 7
    //需要判断当前我在干什么?
    val result = todo(age)
    println(result)
}

//给定的年纪在干什么事情?
//when表达式分支处理 如果只有一行可以省略{}
fun todo(age: Int): String {
    when (age) {
        7 -> return "开始上小学"

        12 -> {
            return "开始上中学"
        }
        15 -> {
            return "开始上高中"
        }
        18 -> {
            return "开始上大学"
        }
        else -> {
            return "开始上社会大学"

        }
    }
}
