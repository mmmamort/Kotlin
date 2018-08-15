package day05


/**
 * ClassName:`27.四大表达式`
 * Description:
 */
fun main(args: Array<String>) {
    val list: MutableList<String>? = mutableListOf("林青霞", "张曼玉", "关之琳")
    /*---------------------------- Apply ----------------------------*/
//    list?.add("林志玲")
//    list?.add("王祖贤")
//    list?.add("朱茵")
//    list?.add("朱茵")
//    list?.add("朱茵")
//    list?.add("朱茵")
//    list?.add("朱茵")
    /**
     * 1.任意对象 任意类型都有apply扩展函数
     * 2.apply函数参数是函数类型 带接受者的函数字面值
     * 3.apply函数返回值是当前对象本身
     */
    list?.apply {
        indexOf("朱茵")
        add("林志玲")
        add("王祖贤")
        add("朱茵")
        add("朱茵")
        add("朱茵")
        add("朱茵")
        add("朱茵")
    }?.add("张三")


    sayHello {
        println(name)
        haha()
        this.haha()
        this.name
    }


    /*---------------------------- let函数 ----------------------------*/
    /**
     * 1.let函数给任意类型添加的扩展函数
     * 2.let函数参数是函数类型   函数参数它的参数就是自己本身
     * 3.函数参数返回值是任意类型
     * 4.let函数返回值就是block函数的返回值
     *
     * let和apply最大的区别:函数参数不同 apply  let普通函数
     */

    val result = list.let {
        it?.add("张三")
        it?.add("张三")
        it?.add("张三")
        it?.add("张三")
        it
        10
    }

    /*---------------------------- with函数 ----------------------------*/
    /**
     * 1.with函数是一个独立的函数  可以独立使用
     * 2.with函数有两个参数  第一个可以传递任意类型  第二个参数:带接收者的函数字面值  接收者是第一个参数
     * 3.with函数返回值就是第二个函数参数返回值
     * with相当于是apply和let的结合
     */
    with(list!!) {
        add("张三")
        add("张三")
        add("张三")
        add("张三")
        this
    }.add("李四")

    /*---------------------------- run ----------------------------*/
    /**
     * 和apply函数类似   区别就是函数的返回值
     */
    list.run {

    }

}

//带有接受者的函数字面值
fun sayHello(block: Human.() -> Unit) {
//    Human().block()
    block(Human())
}

class Human {
    var name = ""
    fun haha() {

    }

}