import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n;
        while(s.hasNext()){
            n=s.nextInt();
            System.out.println(drink(n));
        }
    }
    public static int drink(int n){
        int count=0;
        for(;n>0;){
            int a=n/3;
            int b=n%3;
            count+=a;
            n=a+b;
            if(n==2){
                return ++count;
            }
            if(n==1){
                return count;
            }
        }
        return -1;
    }
}
