package day03


/**
 * ClassName:第二天练习题
 * Description:
 */
fun main(args: Array<String>) {
    val str = "hhew2383dW_fkf&E@^"
    println(isLegel(str))

    var a = 10
    var b = a++
    b = ++a
}

/**
 * 判断用户名是否合法
 */
fun isLegel(str:String):Boolean{
    // 需要在3到20位,
    if(!(str.length>=3&&str.length<=20))return false
    //定义出大写字母  小写字母  数组
    val upRange = 'A'..'Z'
    val lowRange = 'a'..'z'
    val numberRange = '0'..'9'

    //定义大写字母 小写字母 数字  个数
    var upCount = 0
    var lowCount = 0
    var numberCount = 0



    str.forEach {
        when(it){
            in upRange->upCount++
            in lowRange->lowCount++
            in numberRange->numberCount++
            '_'->{}
            else->return false//用户名是数字字母或者_,
        }
    }

    // 必须有2个或以上大写字母,
    // 2个或以上小写字母,
    // 3个或以上数字
    return upCount>=2&&lowCount>=2&&numberCount>=3
}