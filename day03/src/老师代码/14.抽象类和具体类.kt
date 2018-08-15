package day03


/**
 * ClassName:`14.抽象类和具体类`
 * Description:
 * 如果是抽象类就不需要加open关键字了
 */
fun main(args: Array<String>) {
    //匿名对象
    val human = ZhHuman()
    val usHuman = USHuman()
    val afHuman = AfHuman()

}
//人类 (抽象类)
abstract class Human{
    abstract var color:String
    abstract var language:String
    abstract fun eat()
}

//具体实现类
class ZhHuman:Human(){
    override var color: String = "yellow"
    override var language: String = "chinese"

    override fun eat() {
        println("用筷子吃饭")
    }
}

class USHuman:Human(){
    override var color: String = "white"
    override var language: String = "english"

    override fun eat() {
        println("用刀叉吃饭")
    }
}

class AfHuman:Human(){
    override var color: String = "black"
    override var language: String = "葡萄牙语"

    override fun eat() {
        println("用手吃饭")
    }
}