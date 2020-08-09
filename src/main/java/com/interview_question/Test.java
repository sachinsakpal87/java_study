package com.interview_question;

//1 1 2 3 5 8 13
public class Test {

//    public static int findMaxSum(int[] arr) {
//        int maxSum = 0, maxtillNow = Integer.MIN_VALUE;
//        for (int i = 0; i < arr.length; i++) {
//            maxSum += arr[i];
//            if(maxSum<0){
//                maxSum = 0;
//            }
//            if(maxSum>maxtillNow){
//                maxtillNow = maxSum;
//            }
//
//        }
//        return maxtillNow;
//    }
//
//    public static void main(String[] args) {
//
//        String main = "GeeksforGeeks";
//        String sub = "Gks";
//        System.out.println(numberofsubString(main,sub,main.length(),sub.length()));
//
//    }
//
//    private static int numberofsubString(String main, String sub, int mainLen, int subLen) {
//        if(subLen==0)
//            return 1;
//        if(mainLen==0)
//            return 0;
//        if(main.charAt(mainLen-1)==sub.charAt(subLen-1)) {
//            return numberofsubString(main,sub,mainLen-1,subLen-1)+ numberofsubString(main,sub,mainLen-1,subLen);
//        }else {
//            return numberofsubString(main,sub,mainLen-1,subLen);
//        }
//    }

    public static void main(String[] args) {

//        System.out.println(jumps(3,2));

        System.out.println(getTotalCandle(10,2,5));
    }

//    public static int jumps(int flagHeight, int bigJump){
//        int count = 0;
//        while(flagHeight >=0){
//            if(flagHeight==bigJump){
//                count++;
//                break;
//            }
//            else if((flagHeight<bigJump) &&(flagHeight !=0)){
//                count++;
//                flagHeight --;
//
//            }else {
//                count++;
//                flagHeight =flagHeight -bigJump;
//            }
//        }
//        return count;
//    }

    public static int getTotalCandle(int amount, int costOfCandle, int noOfResidue){
        if((amount+noOfResidue)/noOfResidue <= 1 )
            return 1;
        int purchased = amount/costOfCandle;
        int ressultant = purchased - noOfResidue;
        return purchased += getTotalCandle((purchased/noOfResidue)+ressultant,costOfCandle,noOfResidue);
    }
}
