package 复习.泛型上限与泛型投射

/**
 * @ 文件名:   泛型上限与泛型投射
 * @ 创建者:   Eason
 * @ 时间:    2018/8/9 15:10
 * @ 描述:
 *      泛型上限用在定义一个类的时候
 *      泛型投射用在使用泛型类的时候
 */
fun main(args: Array<String>) {
    val pearBox = FruitBox<Pear>(Pear())//创建了一个pearBox 用来装Pear类Pear()对象
//    val stringBox = FruitBox<String>("一个String箱子")//这是不对的，泛型类型需要有个范围，不应该有String类的箱子
}

//abstract class Thing
open class Thing

open class Fruit : Thing()
class Pear : Fruit()
class Apple : Fruit()

open class Box<T>(thing: T)//不确定是装什么的箱子
//class FruitBox<FRUIT>(thing: FRUIT) : Box<FRUIT>(thing)//不确定是装什么的水果箱子，FRUIT为泛型：不是上面的Fruit类
class FruitBox<FRUIT : Fruit>(thing: FRUIT) : Box<FRUIT>(thing)//Fruit为Fruit类，即给FRUIT泛型定了个具体类型（泛型上限）


fun ziList(list: ArrayList<out Fruit>) {
//list集合的类型只能为 Fruit及其子类
}

fun fuList(list: ArrayList<out Fruit>) {
//list集合的类型只能为 Fruit及其父类
}
