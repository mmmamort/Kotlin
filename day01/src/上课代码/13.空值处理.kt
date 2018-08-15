package day01


/**
 * ClassName:`13.空值处理`
 * Description:
 * val str:String       非空类型
 * val str: String?     可空类型
 * str!!.               非空声明
 * str?.                空安全调用符  返回值有可能为空
 *  ?:                  Elvis
 */
fun main(args: Array<String>) {
    /*---------------------------- 异常演示 ----------------------------*/
//    val a = 10
//    val b = 0
//    println(a / b)
    /*---------------------------- kotlin空值处理运算符 ----------------------------*/
//    val a = 10
    val str: String? = null
    //str->Int
    //只有安全调用  或者申明不为空才能调用这个方法
//    if (str != null) {
//        str.toInt()
//    }
    //告诉编译器 我一定不为空  相信我
//    str!!.toInt()
    //空安全调用符
    str?.toInt()
//    if (str != null) {
//        return str.toInt()
//    }else{
//        return null
//    }


    //通过Int数据类型a保存对应的值
//    val a: Int = str?.toInt() ?: -1 //如果结果为null 返回默认值  不为null 返回当前结果
//    a+10

    
    /*---------------------------- 空值处理和java的区别 ----------------------------*/
}
