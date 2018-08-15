package 复习

/**
 * @ 文件名:   标准生成HTML
 * @ 创建者:   Eason
 * @ 时间:    2018/8/13 22:51
 * @ 描述:
 */
fun main(args: Array<String>) {
    val html = Html()
    val head = Head()
    val body = Body()
    val div = Div()
    html.add(head)
    html.add(body)
    body.add(div)
    println(html)
}

/*
class Html {
    override fun toString(): String {
        var sb = StringBuilder()
        sb.append("<html>")
        sb.append("</html>")
        return sb.toString()
    }
}

class Head {
    override fun toString(): String {
        var sb = StringBuilder()
        sb.append("<head>")
        sb.append("</head>")
        return sb.toString()
    }
}*/

class Html : Tag("html")

class Head : Tag("head")

class Body : Tag("body")

class Div : Tag("div")

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