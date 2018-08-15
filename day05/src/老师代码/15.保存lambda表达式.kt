package day05


/**
 * ClassName:`15.保存lambda表达式`
 * Description:
 */
val block2 = {m:Int,n:Int->
    m+n
}
fun main(args: Array<String>) {
    //通过变量保存lambda表达式
    val block = {

    }
    //调用
    block()
    block.invoke()

    block2(10,20)
    block2.invoke(10,20)

}