package day03.次构函数参数使用


/**
 * ClassName:`06.主构函数`
 * Description:
 * 加上var和val之后相当于帮我们定义了字段  可以直接使用
 * 构造函数加var和val只能在主构函数里面加  次构函数不能加
 * 主构函数参数可以直接加上var和val使用  次构函数只能够自己定义变量进行保存
 */
fun main(args: Array<String>) {
    val person1 = Person("张三",20,"134567890","1234567")

    person1.name
    person1.name = "李四"
    println(person1.name)

    person1.phone
    person1.phone = "1234"
}
//
class Person(var name:String,val age:Int){
    var phone = ""
    var qq = ""
    //次构函数
    //次构函数必须要调用主构函数  必须要把参数传递给主构函数
    constructor(name:String,age:Int,phone:String):this(name, age)//调用主构函数将参数传递给主构函数
    //次构函数  次构函数可以直接调用主构   也可以调用次构  间接调用主构函数
//    constructor(name:String,age:Int,phone:String,qq:String):this(name, age)
    constructor(name:String,age:Int,phone:String,qq:String):this(name, age,phone){
        this.phone = phone
        this.qq = qq
    }
}
