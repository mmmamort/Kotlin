package day04.泛型类型投射


/**
 * ClassName:`05.泛型类型投射`
 * Description:
 * out 相当于java的 ? extends
 * in 相当于java的 ? super
 */
fun main(args: Array<String>) {
    val list = arrayListOf(Thing())
    parse(list)
}
////需要Arraylist里面只能传递Fruit或者子类
//fun parse(list:ArrayList<out Fruit>){
//
//}

//需要Arraylist里面只能传递Fruit或者父类
fun parse(list:ArrayList<in Fruit>){

}

//实物
open class Thing
//水果
open class Fruit: Thing()
//梨
class Pear: Fruit()