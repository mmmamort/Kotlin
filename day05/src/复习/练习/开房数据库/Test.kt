package 第六天.作业

import getPersonRepository
import 复习.集合过滤.list2
import java.text.SimpleDateFormat
import java.util.*

fun main(args: Array<String>) {
    val list = getPersonRepository()
    /*---------------------------- 计算广东省人数 ----------------------------*/
    val list1 = list.filter { it.province == "广东省" }
    println("广东省人数${list1.size}人")
    /*---------------------------- 统计广东省男性人数 ----------------------------*/
    val list2 = list.filter { it.province == "广东省" && it.sex == "男" }
    println("广东省男性人数${list2.size}人")

    /*---------------------------- 获取年纪在20到35岁的 女性人数 ----------------------------*/
    val format = SimpleDateFormat("yyyy")
    val nowYear = format.format(Date(System.currentTimeMillis())).toInt()
    val list3 = list.filter {

        var year = it.idNum.substring(6, 10).toInt()

        year <= nowYear - 20 && year >= nowYear - 35 && it.sex == "女"

    }

    println("年纪在20到35岁的女性人数${list3.size}人")

    /*---------------------------- 2016年2yue13到15开房人信息 ----------------------------*/

    val format1 = SimpleDateFormat("yyyy-MM-dd")
    val startData = format1.parse("2016-02-13").time
    val endData = format1.parse("2016-02-15").time
    val list4 = list.filter { it.endTime < endData && it.startTime >= startData }
    println("2016年2月13到15开房人信息${list4.size}人")

    /*---------------------------- 范冰冰在2016年2yue13到15开放人信息 ----------------------------*/
    val list5 = list4.filter { it.name == "范冰冰" }
    println("范冰冰在2016年2月13到15开房人信息${list5.size}人")

    /*---------------------------- 范冰冰在2016年2yue13到15开放人信息 按照酒店分类 ----------------------------*/
    val list6 = list5.groupBy { it.hotel }
    println(list6)

    /*---------------------------- 范冰冰在2016年2yue13到15开放人信息按时间排序 ----------------------------*/
    val list7 = list5.sortedBy { it.startTime }
    println(list7)
}