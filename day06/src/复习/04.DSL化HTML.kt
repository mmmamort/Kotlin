package 复习.DSL化HTML

/**
 * @ 文件名:   `04.DSL化HTML`
 * @ 创建者:   Eason
 * @ 时间:    2018/8/13 23:11
 * @ 描述:
 */
fun main(args: Array<String>) {
//    val head = Head()
//    val body = Body()
//    val div = Div()
//    html.add(head)
//    html.add(body)
//    body.add(div)
    val html =
            html {
                head {

                }
                body {
                    div {

                    }
                }
            }
    println(html)
}

class Html : Tag("html")

class Head : Tag("head")

class Body : Tag("body")

class Div : Tag("div")

fun html(block: Html.() -> Unit): Html {
//一定要在Html()内，需要将别的Tag()对象添加至Html()内，就要使用Html内的add()
    return Html().apply(block)
}

fun Html.head(block: Head.() -> Unit) {
    add(Head().apply(block))
}

fun Html.body(block: Body.() -> Unit) {
    add(Body().apply(block))
}

fun Body.div(block: Div.() -> Unit) {
    add(Div().apply(block))
}

open class Tag(var name: String) {
    //需要有一个方法，每一个标签都有，在自己内部添加别的标签
    val list = ArrayList<Tag>()

    fun add(tag: Tag) {
        list.add(tag)
    }

    //复写打印方法，输出头标签与尾标签
    override fun toString(): String {
        var sb = StringBuilder()
        sb.append("<$name>")
//        list.forEach { sb.append(it) }可以不加toString()  append拼接的是任意类的值转String类，这里默认会去调用toString()方法，直到迭代终止然后一层层返回
        list.forEach { sb.append(it.toString()) }
        sb.append("</$name>")
        return sb.toString()
    }
}