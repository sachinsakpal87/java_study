package com.interview_question;

public class DemoFibonaciSeries {
    static int n1 = 0, n2 = 1, res = 0;

    public static int printFib(int cnt){
                if(cnt==0)
                    return 0;
                if(cnt==1)
                    return 1;
            return printFib(cnt-2)+printFib(cnt-1);
    }

    public static void main(String[] args) {
        int count = 10;
        for (int i=0; i<count; i++){
            System.out.print(printFib(i)+" ");
        }
        System.out.println();
        DemoFibonaciSeries demoFibonaciSeries = new DemoFibonaciSeries();
        System.out.print(n1 + " " + n2);
        demoFibonaciSeries.printFibonacci(count - 2);

//        System.out.println();
//
//        int n1 = 0, n2 = 1, n3, i, cnt = 10;
//        System.out.print(n1 + " " + n2);//printing 0 and 1
//
//        for (i = 2; i < cnt; ++i)//loop starts from 2 because 0 and 1 are already printed
//        {
//            n3 = n1 + n2;
//            System.out.print(" " + n3);
//            n1 = n2;
//            n2 = n3;
//        }



    }

    void printFibonacci(int value) {
        if (value > 0) {
            res = n1 + n2;
            n1 = n2;
            n2 = res;
            System.out.print(" " + res);
            printFibonacci(value - 1);
        }
    }
}
