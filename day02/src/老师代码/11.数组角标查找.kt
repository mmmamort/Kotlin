package 老师代码


/**
 * ClassName:`11.数组角标查找`
 * Description:
 */
fun main(args: Array<String>) {
    val arr = arrayOf("张三","李四","张四","王五","张三","赵六")
    /*---------------------------- 查找第一个”张三”角标 ----------------------------*/
    val index1 = arr.indexOf("张三")
    println(index1)

    /*---------------------------- 查找最后一个”张三”角标 ----------------------------*/
//    arr.lastIndexOf("张三")
    val index2 = arr.indexOfLast {
        it.equals("张三")//过滤的条件
    }
    println(index2)

    /*---------------------------- 查找第一个姓”张”的人的角标----------------------------*/
    val index3 = arr.indexOfFirst {
        it.startsWith("张")
    }
    println(index3)

    /*---------------------------- 查找最后一个姓”张”的人的角标 ----------------------------*/
    val index4 = arr.indexOfLast {
        it.startsWith("张")
    }
    println(index4)

}