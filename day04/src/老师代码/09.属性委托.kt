package day04.属性委托

import kotlin.reflect.KProperty


/**
 * ClassName:`09.属性委托`
 * Description:
 */
fun main(args: Array<String>) {
    val bigHeadSon = BigHeadSon()
    //爷爷给了100块钱压岁钱
    bigHeadSon.压岁钱 = 100
    //取出压岁钱
    println(bigHeadSon.压岁钱)
}
//围裙妈妈
class WeiQunMama{
    //存钱罐  专门存儿子的压岁钱
    var 儿子的压岁钱 = 0
    var 自己的存钱罐 = 0
    //委托的压岁钱的get方法
    operator fun getValue(bigHeadSon: BigHeadSon, property: KProperty<*>): Int {
        return 儿子的压岁钱
    }
    //委托的压岁钱set方法
    operator fun setValue(bigHeadSon: BigHeadSon, property: KProperty<*>, i: Int) {
        儿子的压岁钱 += 20
        自己的存钱罐 += i-20
    }
}
class BigHeadSon{
    //压岁钱  围裙妈妈帮你保存
    var 压岁钱:Int  by WeiQunMama()
}