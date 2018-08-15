package day06.DSL生成HTML


/**
 * ClassName:`03.标准生成HTML标签`
 * Description:
 */
fun main(args: Array<String>) {
    /**
     * html{
    head{

    }
    body{
    div{

    }
    }
    }
     */
    val result: Html =
            html{
                head{//head是函数

                }
                body{
                    div{

                    }
                }
            }
    println(result.toString())
}

fun Body.div(block:()->Unit){
    //创建Div标签对象
    val div = Div()
    //添加到body标签对象里面
    addTag(div)
}

fun Html.body(block:Body.()->Unit){
    //创建Head标签
    val body = Body()
    //执行block函数
    block(body)
    // 并且添加到Html标签里面
    addTag(body)
}

fun Html.head(block:()->Unit){
    //创建Head标签
    val head = Head()
    // 并且添加到Html标签里面
    addTag(head)
}

fun html(block:Html.()->Unit):Html{
    val html = Html()
//    html.block()
    block(html)

    return html
}


class Div:Tag("div"){

}

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