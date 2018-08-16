package com.itcast.dsl.网络请求

import java.util.*


fun main(args: Array<String>) {
    val httpUtil = HttpUtil()
    httpUtil.sendRequest("http:www.baidu.com", "GET",
            onsuccess = {
                println("成功了")
            },
            onError = {
                println("失败了")

            })
//    http {
//        path = "http://www.baidu.com"
//        method = "GET"
//        onsuccess{
//            println("成功了")
//        }
//        onError {
//            println("失败了")
//        }
//    }
}


//http{}执行执行的是HttpUtils里面的sendRequest
//http{}调用的时候参数是不确定的  需要后面传递
//需要通过构建器模式实现

//构建器
class MyRequest(var path: String? = null, var method: String? = null, var onsuccess: ((String) -> Unit)? = null, var onError: ((String) -> Unit)? = null) {
    //发送请求方法 调用HttpUtil的sendRequest进行请求
    fun send() {
        val httpUtil = HttpUtil()
        httpUtil.sendRequest(path, method, onsuccess, onError)
    }
}

/*fun sendRequest(block: HttpUtil.() -> Unit): HttpUtil {
    return HttpUtil().apply(block)
}*/

//负责网络请求
class HttpUtil {
    fun sendRequest(path: String?, method: String?, onsuccess: ((String) -> Unit)?, onError: ((String) -> Unit)?) {
        println("path=$path method=$method")
        Thread {
            //创建URL
//            val url = URL(path)
            println("创建URL")

            //打开网络连接
//            val conn = url.openConnection() as HttpURLConnection
            println("打开网络连接")

            //获取响应码
//            val resCode = conn.responseCode

            val code = Random().nextInt(100)
            println("获取响应码")

            if (code % 2 == 0) {
                onsuccess?.invoke("结果正确了")
            } else {
                onError?.invoke("响应码不正确")
            }
        }.start()
    }
}