package 复习

/**
 * @ 文件名:   `03.标签处返回`
 * @ 创建者:   Eason
 * @ 时间:    2018/8/6 16:24
 * @ 描述:"abc""123"
 */
fun main(args: Array<String>) {
    var s1 = "abc"
    var s2 = "123"
/*========================== 打印s1与s2元素的每一个组合==========================*/
    for (c1 in s1) {
        for (c2 in s2) {
            println("$c1$c2")
        }
    }
    println("\n")
/*========================== 找到某一个元素后就停止打印==========================*/
    tag@ for (c1 in s1) {
        for (c2 in s2) {
            if ("$c1$c2" == "b2") break@tag
            println("$c1$c2")
        }
    }
}
