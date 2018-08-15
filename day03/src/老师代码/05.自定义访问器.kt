package day03.自定义访问器


/**
 * ClassName:`04.类成员的get和set方法`
 * Description:
 * 每一个字段可以通过field表示
 */
fun main(args: Array<String>) {
    //创建Person对象
    val person = Person()
    println(person.name)

    println(person.age)//get
    person.age = 25//set
    println(person.age)

}

class Person{
    var name = "张三"
//    set(value) {
//        field = "李四"
//    }
    //setAge不是我们写的 是自动生成的
    var age = 20
    set(value) {//value就是传递的值
        if(value>18&&value<30){
            //赋值
//            age = value//set
            //可以通过field表示这个字段
            field = value
        }
    }

}