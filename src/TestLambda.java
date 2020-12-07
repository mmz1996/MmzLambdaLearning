/**
 * @Classname TestLambda
 * @Description TODO
 * @Date 2020/12/7 17:51
 * @Created by mmz
 */
public class TestLambda {
    // 静态内部类
    // 实现类
    static class Like2 implements ILike{
        @Override
        public void lamdbaFunc() {
            System.out.println("i like lamdba2");
        }
    }

    public static void main(String[] args) {
        ILike iLike = new Like();
        iLike.lamdbaFunc();

        iLike = new Like2();
        iLike.lamdbaFunc();

        // 局部内部类
        class Like3 implements ILike{
            @Override
            public void lamdbaFunc() {
                System.out.println("i like lamdba3");
            }
        }
        iLike = new Like3();
        iLike.lamdbaFunc();

        // 匿名内部类
        iLike = new ILike() {
            @Override
            public void lamdbaFunc() {
                System.out.println("i like lamdba4");
            }
        };
        iLike.lamdbaFunc();

        // 用lambda表达式
        iLike = () -> {
            System.out.println("i like lamdba5");
        };

        iLike.lamdbaFunc();
    }
}
// 定义一个函数式接口
interface ILike{
    void lamdbaFunc();
}


// 实现类
class Like implements ILike{
    @Override
    public void lamdbaFunc() {
        System.out.println("i like lamdba");
    }
}