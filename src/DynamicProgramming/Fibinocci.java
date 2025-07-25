package DynamicProgramming;

public class Fibinocci {

    public static int count =0;

    public static int fib(int n){
        int[]fibList = new int[n+1];
        fibList[0]=0;
        fibList[1]=1;
        for(int i=2;i<=n;i++){
            count++;
            fibList[i]=fibList[i-1]+fibList[i-2];
        }
        for(int i:fibList){
            System.out.println(i);
        }
        return fibList[n];
    }

    public static void main(String[] args) {
        int n = 7;
        System.out.println(fib(7));
        System.out.println("method calls = "+ count);
    }
}
