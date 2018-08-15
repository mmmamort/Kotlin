package day03.封装_洗衣机实战


/**
 * ClassName:WashMachine
 * Description:洗衣机
 */
class WashMachine(val brand:String,val cap:Int) {
    var isClose = false
    var washMode = 0//默认模式  1  轻柔  2  狂锤
    var speed = 0
    //开门
    fun openDoor(){
        println("洗衣机开门了...")
        isClose = false
    }
    //关门
    fun closeDoor(){
        println("洗衣机关门了...")
        isClose = true
    }

    /**
     * 设置模式  外部接口
     */
    fun setMode(mode:Int){
        washMode = mode
        //设置发送机转速
        when(mode){
            1->setMotorSpeed(1000)
            2->setMotorSpeed(2000)
        }
    }

    /**
     * 设置发动机转速
     */
    private fun setMotorSpeed(speed:Int){
        this.speed = speed
    }

    //洗衣服
    fun start(){
        //判断门是否关了
        if(isClose) {
            when(washMode){
                0-> println("请选择模式")
                1->{
                    println("开始放水...")
                    println("水放满了...")
                    println("轻柔模式...")
                    println("speed=$speed")
                    println("开始洗衣服...")
                }
                2->{
                    println("开始放水...")
                    println("水放满了...")
                    println("狂揉模式...")
                    println("speed=$speed")
                    println("开始洗衣服...")
                }
            }
        }else{
            println("请先关门...")
        }
    }
}