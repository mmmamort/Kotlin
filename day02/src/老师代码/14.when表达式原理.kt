package 老师代码.age


/**
 * ClassName:`14.when表达式原理`
 * Description:
 * when表达式原理:
 * 如果是简单的when表达式 支持的6中数据格式  ,when表达式最终都会翻译成switch语句
 * 如果是加强的when表达式,最终会翻译成if else
 */
fun main(args: Array<String>) {

}
//基础版本
//fun todo(age: Int): String {
//    when (age) {
//        7 -> return "开始上小学"
//
//        12 -> {
//            return "开始上中学"
//        }
//        15 -> {
//            return "开始上高中"
//        }
//        18 -> {
//            return "开始上大学"
//        }
//        else -> {
//            return "开始上社会大学"
//
//        }
//    }
//}
//加强版
fun todoUp(age: Int): String {
    when (age) {
        in 1..6 -> return "没有上学"

        7 -> return "开始上小学"

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