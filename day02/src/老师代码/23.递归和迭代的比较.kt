package 老师代码


/**
 * ClassName:`23.递归和迭代的比较`
 * Description:
 * kotlin函数参数都是不可变的
 * 一般情况下:递归能解决的问题  用普通的迭代有也可以解决
 * 有一些问题我们用递归解决写起来比较简单,因为递归更加符合思维逻辑  迭代,我们需要抽象出数学模型才能解决
 * 递归:如果递归的层级比较深的话就会出现栈内存溢出
 *          优点          缺点
 * 递归:    写起来简单     容易内存溢出
 * 迭代      写起来麻烦     不会内存溢出
 * 能不能有一种方式既能够写起来简单又能够不会内存溢出呢?尾递归优化(kotlin独有的)
 */
fun main(args: Array<String>) {
    //递归
    //迭代
    //高斯问题  1到n元素的和
//    val result = add1(100000)
//    println(result)
    val result2 = add2(100000)
    println(result2)
}

//求1到100的和
fun add1(n: Int): Int {
    //保存数据
    var newN = n
    var count = 0
    //不用递归,用循环
    while (newN>=1){
        count += newN
        newN--
    }
    return count
}
//求1到n的和  n+ 1到n-1的和
fun add2(n:Int):Int{
    if(n==1){
        return 1
    }else{
        return n+ add2(n-1)
    }
}