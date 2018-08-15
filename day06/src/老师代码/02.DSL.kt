package day06.DSL


/**
 * ClassName:`02.复习.DSL`
 * Description:
 */

fun main(args: Array<String>) {
    /**
     * person{
    name="林青霞"
    age = 50
    address{
    city="广东省"
    street="新安街道"
    number=30
    }
    }
     */
    val person:Person =
            person{
                name = "林青霞"
                age = 50
                address{//创建Address对象  并且address对象添加到Person对象里面
                    //{}里面持有Address对象的引用
                    city = "深圳市"
                    street = "新安街道"
                    number = 30
                }
            }

    println(person)
}
//1.最外层的person函数
//2.把函数参数定义成带接受者的函数字面值
fun person(block:Person.()->Unit):Person{
    //创建Person对象
//    val person = Person()
//    person.block()
    //执行block函数  需要传递person对象引用
//    block(person)
    //返回person对象
//    return person
    return Person().apply(block)
}

//3.定义address函数
fun Person.address(block:Address.()->Unit){
    //创建Address对象  并且address对象添加到Person对象里面
//    val address = Address()
    //执行block函数
//    block(address)
    //添加到Person对象里面
//    this.address = address
    this.address = Address().apply(block)
}

data class Address(var city: String?=null, var street: String?=null, var number: Int?=null)

data class Person(var name: String?=null, var age: Int?=null, var address: Address?=null)

