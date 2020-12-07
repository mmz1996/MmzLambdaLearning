/**
 * @Classname TestLambda3
 * @Description TODO
 * @Date 2020/12/7 18:17
 * @Created by mmz
 */
public class TestLambda3 {
    public static void main(String[] args) {
        Play play = a -> System.out.println("let us play "+ a);
        play.play(123);
    }
}
interface Play{
    void play(int a);
}
