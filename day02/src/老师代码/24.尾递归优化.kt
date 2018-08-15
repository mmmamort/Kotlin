package 老师代码.尾递归优化


/**
 * ClassName:`24.尾递归优化`
 * Description:
 * 尾递归优化需要一个前提:这个递归必须是尾递归
 * 尾递归:调用当前递归的方法之后,没有做任何其它操作就是尾递归
 * 在尾递归函数前面加上tailrec关键字
 *
 * 尾递归优化原理:帮我们把递归转换为迭代  按照递归的方式写代码,按照迭代的方式执行
 */
fun main(args: Array<String>) {
    println(add(100000))
}

tailrec fun add(n:Int,result:Int=0):Int{
    if(n==1){
        return result+1
    }else{
        return add(n-1,result+n)
    }
}

//求1到n的和  n+ 1到n-1的和
//fun add(n:Int):Int{
//    if(n==1){
//        return 1
//    }else{
//        return n+ add(n-1)
//    }
//}