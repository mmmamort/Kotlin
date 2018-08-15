package day04.泛型上限


/**
 * ClassName:`03.泛型上限`
 * Description:
 */
fun main(args: Array<String>) {
    //创建水果箱子
    val fruitBox = FruitBox<Pear>(Pear())

    //不满足条件  可以装其他东西
//    val fruitBox2 = FruitBox<String>("")
}
//箱子对象
open class Box<T>(thing:T)
//水果箱子
//希望箱子智能装水果
//指定FruitBox泛型必须是Fruit或者它的子类
class FruitBox<FRUIT:Fruit>(thing:FRUIT):Box<FRUIT>(thing)

//实物
abstract class Thing
//水果
abstract class Fruit:Thing()
//梨
class Pear:Fruit()
