package day04.中缀表达式


/**
 * ClassName:`07.中缀表达式`
 * Description:
 * 中缀表达式
 * 1.函数前面加上infix
 * 中缀调用条件
 * 1.必须是成员函数和扩展函数
 * 2.必须只有一个参数
 * 3.不能是可变参数
 *
 * 注意:
 * 中缀表达式调用this不能省略
 */
fun main(args: Array<String>) {
    //创建张三这个对象
    val zhangsan = Person("张三", 20)
    //张三给李四打招呼
    zhangsan.sayHelloTo("李四")
    //复习.DSL
    zhangsan sayHelloTo "李四"
}

class Person(var name: String, var age: Int) {
    infix fun sayHelloTo(person: String) {
        println("$name 给$person 打招呼")
    }

    fun hehe() {

    }

    fun haha() {
        this.hehe()
        hehe()
        this.sayHelloTo("王五")
        //中缀调用
        this sayHelloTo "王五"

//        sayHelloTo "王五"
    }
}

fun sayHello() {

}

