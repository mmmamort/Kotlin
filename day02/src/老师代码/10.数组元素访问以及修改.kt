package 老师代码


/**
 * ClassName:`10.数组元素访问以及修改`
 * Description:
 */
fun main(args: Array<String>) {
//    val a = arrayOf(1)//00BCEDFE
    val arr = arrayOf(1,2,3,4)//00ACFEBC


    /*---------------------------- 访问某一个元素 ----------------------------*/
    //第二个元素
    val ele = arr[1]//List里面元素的访问也可以通过[]方式进行访问
    println(ele)

    /*---------------------------- 数组元素的修改 ----------------------------*/
    //第三个元素修改为10
//    arr[2] = 10
//    println(arr[2])

    arr.set(2,10)
    println(arr[2])
}