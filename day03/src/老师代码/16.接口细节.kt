package day03.接口细节


/**
 * ClassName:`14.抽象类和具体类`
 * Description:
 * 如果是抽象类就不需要加open关键字了
 * 第一个区别:koltin的接口里面字段不能赋值
 *第二个区别:java接口里面方法不能实现  kotlin可以实现
 */
fun main(args: Array<String>) {
    //匿名对象

}

//人类 (抽象类)
abstract class Human{
    abstract var color:String
    abstract var language:String
    abstract fun eat()
}

//具体实现类
abstract class ZhHuman:Human(){
    abstract var name:String
    abstract var age:Int

    override var color: String = "yellow"
    override var language: String = "chinese"

    override fun eat() {
        println("用筷子吃饭")
    }
}
//小明
class XiaoMing:ZhHuman(),Ride,Drive{
    override val license: String = "12345676"

//    override fun driveCar() {
//        println("小明开车")
//    }

    override fun rideBike() {
        println("小明骑自行车")
    }

    override var name: String = "小明"
    override var age: Int = 30
}

//骑自行能力
interface Ride{
    fun rideBike()
}
//开车能力
interface Drive{
    //驾照
    val license:String
    fun driveCar(){
        println("放手刹  挂挡  走")
    }
}