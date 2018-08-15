package 复习.函数调用

import kotlin.concurrent.thread

/**
 * @ 文件名:   Market
 * @ 创建者:   Eason
 * @ 时间:    2018/8/12 21:09
 * @ 描述:
 */
class Market {
    private var getWay: ((Soy) -> Unit)? = null

    fun setGetWay(getWay: (Soy) -> Unit) {
        this.getWay = getWay
    }

    fun buySoy() {
        thread {
            Thread.sleep(3000)
            val soy = Soy("海天")
            //回调
            getWay?.invoke(soy)
        }
    }
}