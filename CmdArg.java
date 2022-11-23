package day1;

public class CmdArg {
    public static void main(String[] args) {
        int sum =0;
        System.out.println("Csalculate sum of value");

        int a[]={1,2,3,4,5};
        for(int i=0;i<a.length;i++) {

            System.out.println(a[i]);

            sum = sum + (a[i]);

        }
        System.out.println("sum is:" +sum);

    }

}
//
//        int sum=0
//        for(int i=0;i<=args.length;i++){
//        sum= sum + integer.parseInt(args[i]);
//        }
//        System.out.println("sum is:" +sum)

