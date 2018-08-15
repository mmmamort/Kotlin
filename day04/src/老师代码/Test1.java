package 老师代码;

/**
 * ClassName:Test1
 * Description:
 */
class Test1 {

    private static NetUtil netUtil;

    public static void main(String[] args){
//        netUtil = new NetUtil();
//        netUtil.sendRequest();
        NetUtil.getInstance().sendRequest();
    }
    //字符串为空  null  长度为0
    public static void haha(String str){

        System.out.println("字符串是否为空:"+StringUtil.isEmpty(str));
    }

    static class Person{
        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }
}
