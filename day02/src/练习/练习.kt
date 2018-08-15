package 练习

/**
 * @ 文件名:   练习
 * @ 创建者:   Eason
 * @ 时间:    2018/8/6 15:50
 * @ 描述:
1.判断登录用户名是否合法(不能用正则表达式)
2.用户名是数字字母或者_,需要在3到20位,必须有2个或以上大写字母,2个或以上小写字母,3个或以上数字
3.hhew2383dW_fkf&E@^
 */
fun main(args: Array<String>) {
    println(checkUser("asjf_1123AAA**"))
}

fun checkUser(userName: String): String {
    var aCount = 0
    var ACount = 0
    var numCount = 0
    var _count = 0
    userName.forEach {
        if (it in '0'..'9') numCount++
        else if (it in 'a'..'z') aCount++
        else if (it in 'A'..'Z') ACount++
        else if (it == '_') _count++
        else return "用户名不和法"
    }
    if (numCount < 3 || aCount < 2 || ACount < 2 || userName.length < 3 || userName.length > 20) return "用户名不和法"
    else return "用户名合法"
}