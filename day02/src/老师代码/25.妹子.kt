package 老师代码


/**
 * ClassName:`25.妹子`
 * Description:
 */
fun main(args: Array<String>) {
    val girl = Girl()
    println(girl.name)
    println(girl.age)
    girl.greeting()
}

class Girl{
    //静态属性
    var name = "小红"
    var age = 20
    //动态行为
    fun greeting(){
        println("hello  你好")
    }
}