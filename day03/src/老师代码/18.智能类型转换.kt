package day03.智能类型转换


/**
 * ClassName:`18.智能类型转换`
 * Description:
 */
fun main(args: Array<String>) {
    val shepHerdDog:Dog = ShepHerdDog()//智能类型推断
    val ruralDog = RuralDog()//

//    shepHerdDog.shepHerd()
//    ruralDog.watchDoor()


    if(!(shepHerdDog is ShepHerdDog))return

    shepHerdDog.shepHerd()

//    shepHerdDog.s
    //如果想调用子类的方法  就需要将shepHerdDog强转成 ShepHerdDog
    //转换之前还需要判断是否是当前子类类型
//    if(shepHerdDog is ShepHerdDog){//一旦判断出是这个类型之后  编译器就把类型转换过去了  不需要手动转换
////        val newDog = shepHerdDog as ShepHerdDog//强转
////        newDog.shepHerd()
//        shepHerdDog.shepHerd()
//    }
}
//狗的父类
abstract class Dog
//ShepHerdDog
class ShepHerdDog:Dog(){
    fun shepHerd(){
        println("牧羊犬开始放羊了...")
    }
}
//Rural Dog
class RuralDog:Dog(){
    fun watchDoor(){
        println("土狗开始看门了...")
    }
}
