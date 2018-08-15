package 复习.多态.day03

/**
 * @ 文件名:   `14.多态`
 * @ 创建者:   Eason
 * @ 时间:    2018/8/8 16:03
 * @ 描述:
 */
fun main(args: Array<String>) {
    val cat: Animal = Cat()
    val dog: Animal = Dog()
    val arr = arrayOf(cat, dog)
    for (animal in arr) {
        animal.eat()
    }

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