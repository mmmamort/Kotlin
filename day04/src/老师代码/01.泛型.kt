package day04


/**
 * ClassName:`01.反省`
 * Description:
 */
fun main(args: Array<String>) {
    //1.使用的时候确定泛型
    val box1 = Box<Apple>(Apple())
    val box2 = Box<Apple>(Apple())
    val box3 = Box<Apple>(Apple())

    val box4 = AppleBox(Apple())

}
//Box
//用的时候才知道  现在创建Box不知道
//泛型类
open class Box<T>(var thing:T)


//2.定义专门的类继承泛型类  确定泛型类型
//专门定义AppleBox
//主构函数
//父类有泛型
class AppleBox(thing:Apple):Box<Apple>(thing)

//3.父类定义有泛型  子类不知道具体类型 还可以再传递一个泛型给它
class FruitBox<FRUIT>(thing:FRUIT):Box<FRUIT>(thing)

//苹果
class Apple