import pack.Operation;
import java.util.Scanner;

public class main {
    public static void main (String args[]){
        float x=0;
        float y=0;
        int ch=0;
        float answer =0;

    Scanner Scan = new Scanner(System.in);

    System.out.println("Введите первое число:");
               x=Scan.nextFloat();
    System.out.println("Введите второе число:");
               y=Scan.nextFloat();
    System.out.println("Выберите операцию: 1(+),2(-),3(*),4(/):");
               ch=Scan.nextInt();

        Operation Object = new Operation();
        answer = Object.Calc(x,y,ch);
        System.out.println("Результат: " + answer);
    }
}
