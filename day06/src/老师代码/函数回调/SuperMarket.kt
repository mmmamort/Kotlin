package day06.函数回调

import kotlin.concurrent.thread


/**
 * ClassName:SuperMarket
 * Description:
 */
class SuperMarket {
    private var callBack: ((Soy) -> Unit)? = null
    //设置函数对象
    fun setCallBack(callBack: (Soy) -> Unit) {
        this.callBack = callBack
    }

    fun buySoy() {
        thread {
            Thread.sleep(3000)
            val soy = Soy("海天")
            //回调
            callBack?.invoke(soy)
        }.start()
    }
}