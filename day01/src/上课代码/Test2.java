package 上课代码;

/**
 * ClassName:Test2
 * Description:
 */
class Test2 {
    public static void main(String[] args){
        //创建Data对象
//        sayHello();
        int a=10;
        int b = 0;
        int c = a>b?a:b;



    }
    //编译阶段  编译器没有查找到任何错误
    //运行时异常:NullPointException
    //编译时异常
    public static void sayHello(){
        Data data = null;
        data.setName("李四");
    }
     class Data{
        private String name;
        private int age;

        @Override
        public String toString() {
            return "Data{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
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
