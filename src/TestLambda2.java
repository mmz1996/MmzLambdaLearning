/**
 * @Classname TestLambda2
 * @Description TODO
 * @Date 2020/12/7 18:09
 * @Created by mmz
 */
public class TestLambda2 {
    static class Love2 implements ILove{
        @Override
        public void love(int a) {
            System.out.println("i love u " + a);
        }
    }
    public static void main(String[] args) {
        ILove iLove = new Love();
        iLove.love(1);

        iLove = new Love2();
        iLove.love(2);

        class Love3 implements ILove {
            @Override
            public void love(int a) {
                System.out.println("i love u " + a);
            }
        }
        iLove = new Love3();
        iLove.love(3);

        iLove = new ILove() {
            @Override
            public void love(int a) {
                System.out.println("i love u "+ a);
            }
        };
        iLove.love(4);

        iLove = (a -> {
            System.out.println("i love u " + a);
        });
        iLove.love(5);
    }
}

interface ILove{
    void love(int a);
}


class Love implements ILove{
    @Override
    public void love(int a) {
        System.out.println("i love u " + a);
    }
}