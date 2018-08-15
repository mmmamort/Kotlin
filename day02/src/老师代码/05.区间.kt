package 老师代码


/**
 * ClassName:`05.区间`
 * Description:
 * 区间定义三种方式
 * kotlin有几种区间  IntRange  CharRange  LongRange
 */
fun main(args: Array<String>) {
    /*---------------------------- 定义区间 ----------------------------*/
    //1到100
    val range1 = IntRange(1,100)//闭区间 包含1 包含100
    val range2 = 1.rangeTo(100)//闭区间 包含1 包含100
    val range3 = 1..100//运算符重载方式创建区间

    //char字符区间
    val range4 = CharRange('a','z')
//    val range5 = CharRange('中','国')
    val range5 = 'a'.rangeTo('z')
    val range6 = 'a'..'z'

    //long区间
    val range7 = 10L..100L
    val range8 = LongRange(10,100)

}