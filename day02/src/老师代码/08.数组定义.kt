package 老师代码


/**
 * ClassName:`08.数组定义`
 * Description:
 */
fun main(args: Array<String>) {
    /*---------------------------- 定义数组:保存  张三  李四 王五 ----------------------------*/
    //知道数组里面对应的元素  通过arrayof
    //Any 类比 Object
//    String[] arr = {"张三","李四","王五"}
//    val arr = arrayOf("张三","李四","王五")//快速创建数组
//    val arr2 = arrayOf(10,20,30)//快速创建数组
//    val arr3 = arrayOf("张三",20,'c')//快速创建数组

    //如果不知道数组里面元素  创建一个Int数组  长度为10  每一个元素都初始化为0
    val arr4 = Array<Int>(10){
        0
    }

    /*---------------------------- 8中基本数据类型都有自己的数组类型 ----------------------------*/
    //创建IntArray数组  指定长度
    val arr5 = IntArray(10)
    //创建IntArray数组  指定元素
    val arr6 = intArrayOf(1,2,3,4)

//    BooleanArray
//     ByteArray

//    ShortArray
//    CharArray

//    FloatArray

//    DoubleArray
//    LongArray

//    StringArray  不是创建String数组
    //想创建String类型的数组 可以通过Array<String>实现
}