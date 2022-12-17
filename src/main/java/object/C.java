package object;

public class C extends  B{
    @Override
    void m3() {
        System.out.println("c's m3 " + (ivar + 6));
    }
}
