package 老师代码


/**
 * ClassName:`02.break和continue`
 * Description:
 */
fun main(args: Array<String>) {
    val str = "abcde"
    /*---------------------------- 遍历元素:找到c就停止 ----------------------------*/
//    for (c in str) {
//        println(c)
//        if(c.equals('c')){
//            break
//        }
//    }

    /*---------------------------- 遍历元素:除了c其它都打印 ----------------------------*/
    for (c in str) {
        if(c.equals('c')){
            continue
        }
        println(c)
    }
//    str.forEach {
//        println(it)
//        if(it.equals('c')){
//            break
//        }
//    }
}