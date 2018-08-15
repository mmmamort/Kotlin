package day04


/**
 * ClassName:`12.扩展磺酸钠胡`
 * Description:
 * 父类定义扩展函数  子类也可以使用
 */
fun main(args: Array<String>) {
    //可空类型
    val str:String? = null
    //判断str是否为空
//    println(StringUtil.isEmpty(str))
//    val result = str?.myIsEmpty()?:true
    val result = str.myIsEmpty()
    println(result)

}
//扩展函数
//给String类型扩展了一个myIsEmpty函数
//fun String.myIsEmpty():Boolean{
//    return this==null||this.length==0
//}

//扩展
//给可空的String类型扩展了一个myIsEmpty函数
fun String?.myIsEmpty():Boolean{
    return this==null||this.length==0
}

//View 所有的控件父类
//ImageView   imageview.anima
//TextView    textview.ani

