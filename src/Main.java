//import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Scanner input=new Scanner(System.in);
        //int num=input.nextInt();
        int num=788;
        int salary=40000;
        System.out.println(checkStatusOfNumber(num));
        printBonus(salary);
        printIncome(salary,calcBonus(salary));
        //double n=3;
        //double m=5;
        calcExponent(3,5);
        printExponent(3,5);
        //System.out.println(calcExponent(n,m));
        //input.close();
    }
    //Подтверждение чётного числа
    public static boolean checkStatusOfNumber(int num){
        for(int i=0;i<num;i++)
            if (num % 2 == 0 && num >= 0)
                return true;
            else
                return false;


        return false;
    }
    //Расчёт премии
    public static double calcBonus(int salary){
        double bonus=0;
        if(salary<40000 && salary>0)
            return salary*0.5;
        if (salary>=40000 && salary<80000) {
            return salary*0.7;
        } else
            return salary*1.1;

    }
    public static void printBonus(int salary){
        System.out.println(calcBonus(salary));
    }
    public static void printIncome(int salary,double bonus){
        double sum=salary+bonus;
        System.out.println(sum);
        //System.out.printf("%d+%d=%d",salary,calcBonus(salary),salary+calcBonus(salary));
    }
    //Перегрузка разных типов данных - не решено
    public static double calcExponent(double n, double m){
        double n1=1;
        for (int i=1;i<=m;i++){
            double nm=n1*n;
            n1=nm;
            System.out.print(nm+" ");
        }
        return n1;
    }

    //public static double calcExponentRecursion(double n, double m){
        //return calcExponentRecursion(n,m)*calcExponentRecursion(n+1,m);
    //}
    public static void printExponent(double n,double m){
        System.out.println();
        System.out.println(calcExponent(n,m));
        //System.out.println(calcExponentRecursion(n,m));
    }

}