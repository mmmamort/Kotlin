package day04.延迟加载


/**
 * ClassName:`11.延迟加载`
 * Description:
 * 没有赋值直接访问会报错:UninitializedPropertyAccessException
 *
 * by lazy     知道具体值      val不可变    独立于类单独存在
 * lateinit    不确定具体值    var可变      独立于类单独存在
 */

lateinit var name:String

fun main(args: Array<String>) {
    val  person = Person()
    person.sayHello()
}
class Person{
    //name姓名
    //现在不知道name对应的数据  后面初始化的时候才能确定
    //延迟初始化
    lateinit var name:String
    fun sayHello(){

        println(name)
    }
}