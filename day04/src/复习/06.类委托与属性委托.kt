package 复习.类委托与属性委托

import kotlin.reflect.KProperty

/**
 * @ 文件名:   `06.类委托与属性委托`
 * @ 创建者:   Eason
 * @ 时间:    2018/8/9 15:20
 * @ 描述:
 */
fun main(args: Array<String>) {
    val 大雄 = 野比大雄()
    val 小夫 = 骨川小夫()//第二种将功能 委托给具体对象
    val 胖虎 = 刚田武(小夫)//第一种将功能 委托给实现该功能的对象
    胖虎.doHomeWork()//胖虎将作业 委托给具有做作业功能的对象之一：小夫，然后小夫指定给大雄做

    大雄.money = 10000
    println(大雄.money)
}

interface DoHomeWork {
    abstract fun doHomeWork()
}

class 野比大雄 : DoHomeWork {
    override fun doHomeWork() {
        println("大雄在做作业")
    }

    var money: Int by 刚田武1()
}

class 骨川小夫 : DoHomeWork by 野比大雄()

class 刚田武(doHomeWork: DoHomeWork) : DoHomeWork by doHomeWork

class 刚田武1 {
    var 刚田武的零花钱 = 0
    var 抢来的的零花钱 = 0
    operator fun getValue(野比大雄: 野比大雄, property: KProperty<*>): Int {
        return 抢来的的零花钱 - 刚田武的零花钱
    }

    operator fun setValue(野比大雄: 野比大雄, property: KProperty<*>, i: Int) {
        抢来的的零花钱 = i
        刚田武的零花钱 = (i * 0.8).toInt()
    }
}
