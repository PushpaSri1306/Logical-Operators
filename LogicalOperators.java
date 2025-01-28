import java.util.*;
public class LogicalOperators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 1st number");
        int a= sc.nextInt();
        System.out.println("enter 2nd number");
        int b = sc.nextInt();
        if(a%2==0 && b%2==0){
            System.out.println("a and b are even");
        }else if(a%2!=0 && b%2!=0){
            System.out.println("odd numbers");
        }else if(a%2!=0 || b%2!=0){
            System.out.println("a or b is not even");
        }
        sc.close();
    }
}
