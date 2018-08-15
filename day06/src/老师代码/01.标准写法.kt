package day06


/**
 * ClassName:`01.标准写法`
 * Description:
 */
fun main(args: Array<String>) {
    val address = Address("深圳市","新安街道",30)
    val person = Person("林青霞",50,address)

    println(person)
}

data class Address(var city:String,var street:String,var number:Int)

data class Person(var name:String,var age:Int,var address: Address)