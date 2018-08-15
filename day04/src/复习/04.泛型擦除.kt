package 复习

/**
 * @ 文件名:   `04.泛型擦除`
 * @ 创建者:   Eason
 * @ 时间:    2018/8/9 15:11
 * @ 描述:无法直接获得泛型当前的类型，只能通过 inline reified来获得
 */
inline fun <reified T> fun1(ele: T): String {
    return T::class.java.name
}