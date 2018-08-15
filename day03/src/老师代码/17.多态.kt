package day03


/**
 * ClassName:`17.多台`
 * Description:
 */
fun main(args: Array<String>) {
    val dog:Animal = Dog()//智能类型推断
    val cat = Cat()

    dog.bark()
}
abstract class Animal{
    abstract var name:String

    open fun bark(){
        println("动物叫")
    }
}

class Dog:Animal(){
    override var name: String = "旺财"

    override fun bark() {
        println("旺财  汪汪叫")
    }
}

class Cat:Animal(){
    override var name: String = "汤姆"

    override fun bark() {
        println("汤姆  汪汪叫")
    }
}