package day1;

public class DemonstrateStatics {
    static int a = 10;
    static {

    }
    static void play(){
        System.out.println("this is static");
    }
    public static void main(String[] args) {
        play();
        //DemonstrateStatics ds = new DemonstrateStatics();
        //int a=ds.a;
        System.out.println(a);

    }
}
