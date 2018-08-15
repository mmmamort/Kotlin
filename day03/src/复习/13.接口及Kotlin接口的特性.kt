package 复习.接口及Kotlin接口的特性.day03

/**
 * @ 文件名:   `13.接口及Kotlin接口的特性`
 * @ 创建者:   Eason
 * @ 时间:    2018/8/8 16:02
 * @ 描述:
 */
fun main(args: Array<String>) {
    val cat = Cat()
    val dog = Dog()
    cat.eat()
    dog.eat()
}

interface Animal {
    //Kotlin接口特性：接口中的方法可以有方法体
    fun eat() {
        println("猫吃鱼，狗吃肉，动物吃万物")
    }
}

class Cat : Animal {
    override fun eat() {
        println("猫吃鱼")
    }
}

class Dog : Animal {
    override fun eat() {
        println("狗吃肉")
    }
}