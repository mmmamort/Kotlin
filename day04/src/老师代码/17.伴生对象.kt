package day04.伴生对象


/**
 * ClassName:`17.伴生对象`
 * Description:
 */
fun main(args: Array<String>) {
}

//name字段和phone字段
//伴生对象的字段都是静态的
class Person {
    var name = "张三"

    companion object {
        var phone = "123444"
        fun say() {
            println("你好")
        }
    }
}