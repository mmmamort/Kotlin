package day06


/**
 * ClassName:`03.标准生成HTML标签`
 * Description:
 */
fun main(args: Array<String>) {
    val html = Html()
    val head = Head()
    val body = Body()
    val div = Div()

    html.addTag(head)
    body.addTag(body)
    html.addTag(body)

    println(html)

}
class Div:Tag("div")

class Body:Tag("body")

class Head:Tag("head")

class Html:Tag("html")

/**
 * 标签 <html></html>
 */
open class Tag(val name:String){
    //存标签
    val list = ArrayList<Tag>()
    //添加子标签
    fun addTag(tag:Tag){
        list.add(tag)
    }
    /**
     * 将当前标签以及子标签变成字符串 html
     */
    override fun toString(): String {
        val sb = StringBuilder()
        sb.append("<${name}>")
        //放子标签
        list.forEach {//head
            sb.append(it.toString())//head
        }
        sb.append("</${name}>")
        return sb.toString()
    }
}