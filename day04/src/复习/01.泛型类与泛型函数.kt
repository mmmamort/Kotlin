package 复习.泛型类与泛型函数

/**
 * @ 文件名:   `01.泛型类与泛型函数`
 * @ 创建者:   Eason
 * @ 时间:    2018/8/9 15:09
 * @ 描述:
 */
open class Creature<T>(var creature: T)//有点绕，简单来说ArrayLisy<T> 就是一个泛型类 T 可以是String int char等

class Person<T>(creature: T) : Creature<T>(creature)

class Person1<man>(creature: man) : Creature<man>(creature)

class Person2<woman>(creature: woman) : Creature<woman>(creature)

class man

class woman

fun <T> checkValueKind(value: T) {
    when (value) {
        is man -> "${value}是男人"
        is woman -> "${value}是女人"
        else -> "其他"
    }
}