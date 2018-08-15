package day05

import java.util.*


/**
 * ClassName:`02.List集合`
 * Description:
 */
fun main(args: Array<String>) {
    /*---------------------------- List ----------------------------*/
    //1.快速创建List集合  listof创建的List集合  不可变集合(不能扩容  不能修改元素)
    //林青霞  张曼玉  关之琳
    val list1 = listOf("林青霞","张曼玉","关之琳")
    //不能扩容
    //访问第二个元素
    val ele = list1.get(1)
//    println(ele)
    //元素不能修改
//    list[0] = "王祖蓝"
    //2.可以扩容  以及修改元素
    val list2 = mutableListOf("林青霞","张曼玉","关之琳")
//    MutableList()
    //扩容
    list2.add("王祖贤")
    //修改元素
//    list2[1] = "李若彤"
    list2.set(1,"李若彤")
    println(list2)
    val list3 = MutableList<String>(10){
        "张三"
    }

    //3.使用java的集合体系
    val list4 = ArrayList<String>()
    //快速的创建ArrayList
    val list5 = arrayListOf("张三","李四","王五")
    val vector = Vector<String>()
    val linkedList = LinkedList<String>()

}