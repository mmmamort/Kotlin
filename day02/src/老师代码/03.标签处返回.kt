package 老师代码


/**
 * ClassName:`03.标签处返回`
 * Description:
 */
fun main(args: Array<String>) {
    val str1 = "abc"
    val str2 = "123"
    /*---------------------------- 找到str1和str2每一个元素组合 ----------------------------*/
    //a1 a2 a3 b1 b2 b3 c1 c2 c3
//    for (c1 in str1) {
//        for (c2 in str2) {
//            println("${c1} $c2")
//        }
//    }

    /*---------------------------- 找到b2之后就不再打印了 ----------------------------*/
    haha@for (c1 in str1) {
        for (c2 in str2) {
            println("${c1} $c2")
            if(c1=='b'&&c2=='2'){
//                break//只是跳出了内层循环 需要的是跳出外层循环
                break@haha
            }
        }
    }
}