package 老师代码.name


/**
 * ClassName:`12.when表达式`
 * Description:
 */
fun main(args: Array<String>) {
    //人 7 上小学  12 上中学  15 上高中 18 大学  社会大学
    var age = 17
    //需要判断当前我在干什么?
    val result = todo(age)
    println(result)
}

//给定的年纪在干什么事情?
//when表达式分支处理 如果只有一行可以省略{}
//支持的数据格式比java要多,除了java支持的6中数据格式之外可以支持区间,表达式 判断语句
fun todo(age: Int): String {
    when (age) {
//        1 -> return "没有上学"
//        2 -> return "没有上学"
//        3 -> return "没有上学"
//        4 -> return "没有上学"
//        5 -> return "没有上学"
//        6 -> return "没有上学"

        //多个分支处理
//        1,2,3,4,5,6 -> return "没有上学"
        //通过在区间里面处理多个分支
        in 1..6 -> return "没有上学"

        7 -> return "开始上小学"

//        8 -> return "正在上小学"
//        9 -> return "正在上小学"
//        10 -> return "正在上小学"
//        11 -> return "正在上小学"

        in 8..11 -> return "正在上小学"

        12 -> {
            return "开始上中学"
        }
        13,14->return "正在上中学"
        15 -> {
            return "开始上高中"
        }
        16,17->return "正在上高中"
        18 -> {
            return "开始上大学"
        }
        else -> {
            return "开始上社会大学"

        }
    }
}
