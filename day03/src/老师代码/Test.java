package 老师代码;

/**
 * ClassName:Test
 * Description:
 */
class Test {
    public static void main(String[] args){
        Girl girl1 = new Girl();
        Girl girl2 = new Girl();
        //java里面运算符只能用到数字  或者字符串  普通对象是不能运用的
//        girl1+girl2;

        int a = 10;
        int b =20;
        int c = a + b;
    }
    static class Girl{
        private String name;
        private int age;

        @Override
        public String toString() {
            return "Girl{" +
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


