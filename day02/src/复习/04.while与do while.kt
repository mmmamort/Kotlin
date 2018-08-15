package 复习

/**
 * @ 文件名:   `04.while与do while`
 * @ 创建者:   Eason
 * @ 时间:    2018/8/6 16:26
 * @ 描述:
 */
/*========================== for foreach while do..while 求1到100和==========================*/
fun main(args: Array<String>) {

    var sum = 0
    for (i in 1..100) sum += i
    println(sum)

    sum = 0
    (1..100).forEach { sum += it }
    println(sum)

    sum = 0
    var i = 0
    while (i++ < 100) sum += i
    println(sum)

    sum = 0
    i = 0
    do {
        sum += i
    } while (++i <= 100)
    println(sum)
}
