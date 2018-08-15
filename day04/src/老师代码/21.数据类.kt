package day04.数据类


/**
 * ClassName:`21.数据类`
 * Description:
 */
fun main(args: Array<String>) {
    val news = News("d:/path/a.jpg","标题","简介")
    news.component1()//对应的就是imgPath
    news.component2()//对应title
    news.component3()
}
//多了 copy  component1
//数据类
data class News(var imgPath:String,var title:String,var desc:String)