package 复习.智能类型转换.day03

/**
 * @ 文件名:   `15.智能类型转换`
 * @ 创建者:   Eason
 * @ 时间:    2018/8/8 16:03
 * @ 描述:
 */
fun main(args: Array<String>) {
    val cat: Animal = Cat()
    val dog: Animal = Dog()
    if (cat is Cat) cat.eat()//animal类cat通过if判断语句，自动转换成Cat类
    if (dog is Dog) dog.eat()//animal类dog通过if判断语句，自动转换成Dog类

}

interface Animal {
}

class Cat : Animal {
    fun eat() {
        println("猫吃鱼")
    }
}

class Dog : Animal {
    fun eat() {
        println("狗吃肉")
    }
}