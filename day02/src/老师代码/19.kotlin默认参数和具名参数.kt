package 老师代码


/**
 * ClassName:`19.kotlin默认参数和具名参数`
 * Description:主要解决的问题就是java的方法重载
 */
fun main(args: Array<String>) {
//    sendRequest("GET","www.baidu.com")
    //GET请求
//    sendRequest(path = "www.baidu.com")//具名参数
//    sendRequest("GET", "www.baidu.com")//具名参数
    sendRequest(path = "www.baidu.com",method = "POST")//具名参数 顺序变化不影响结果
}
//项目里面大部分是GET请求  只有少部分是POST

fun sendRequest(method:String="GET",path:String){//默认参数
    println("请求方式是:$method 请求路径是:$path")
}