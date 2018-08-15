package 复习

/**
 * @ 文件名:   `08.数组定义`
 * @ 创建者:   Eason
 * @ 时间:    2018/8/6 16:33
 * @ 描述:
 */
fun main(args: Array<String>) {
/*========================== 定义数组 保存多种数据类型==========================*/
    val arr = arrayOf("张三", "男", 20)//Any等同于Java的Object

/*========================== 创建一个长度为10的数组 内容为0==========================*/
    val arr1 = IntArray(10) {
        0
    }

/*========================== 八种基本类型数组及String数组==========================*/
    val byteArr = ByteArray(10)
    val shortArr = ShortArray(10)
    val intArr = IntArray(10)
    val longArr = LongArray(10)
    val floatArr = FloatArray(10)
    val doubleArr = DoubleArray(10)
    val charArr = CharArray(10)
    val booleanArr = BooleanArray(10)
}
