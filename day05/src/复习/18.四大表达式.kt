package 复习

import day05.sayHello

/**
 * @ 文件名:   `18.四大表达式`
 * @ 创建者:   Eason
 * @ 时间:    2018/8/11 17:36
 * @ 描述:
 */
fun main(args: Array<String>) {
    val list: MutableList<String>? = mutableListOf("林青霞", "张曼玉", "关之琳")
    /*---------------------------- Apply ----------------------------*/
    /**
     * 1.任意对象 任意类型都有apply扩展函数
     * 2.apply函数参数是函数类型 带接受者的函数字面值
     * 3.apply函数返回值是当前对象本身
     */
//    public inline fun <T> T.apply(block: T.() -> Unit): T

    list?.apply {
        add("钟楚红")
        add("朱茵")
    }?.add("王祖贤")

    /*---------------------------- let函数 ----------------------------*/
    /**
     * 1.let函数给任意类型添加的扩展函数
     * 2.let函数参数是函数类型   函数参数它的参数就是自己本身
     * 3.函数参数返回值是任意类型
     * 4.let函数返回值就是block函数的返回值
     *
     * let和apply最大的区别:函数参数不同 apply  let普通函数
     */
//    public inline fun <T, R> T.let(block: (T) -> R): R

    list.let {
        it?.add("王祖贤")
        it?.add("钟楚红")
        it?.add("朱茵")
    }

    /*---------------------------- with函数 ----------------------------*/
    /**
     * 1.with函数是一个独立的函数  可以独立使用
     * 2.with函数有两个参数  第一个可以传递任意类型  第二个参数:带接收者的函数字面值  接收者是第一个参数
     * 3.with函数返回值就是第二个函数参数返回值
     * with相当于是apply和let的结合
     */
//    public inline fun <T, R> with(receiver: T, block: T.() -> R): R

    with(list!!) {
        add("钟楚红")
        add("朱茵")
    }

    /*---------------------------- run ----------------------------*/
    /**
     * 和apply函数类似   区别就是函数的返回值
     */
//    public inline fun <T, R> T.run(block: T.() -> R): R

    list.run {
        add("钟楚红")
        add("朱茵")
    }

}