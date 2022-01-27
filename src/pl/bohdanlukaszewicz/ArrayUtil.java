package pl.bohdanlukaszewicz;


import java.math.BigInteger;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ArrayUtil {


    public static void main(String[] args) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String d1 = "1900-10-21";
        String d2 = "1900-09-21";
        String d3 = "1910-08-12";



        LocalDate date1 = LocalDate.parse(d1, formatter);
        LocalDate date2 = LocalDate.parse(d2, formatter);
        LocalDate date3 = LocalDate.parse(d3,formatter);






        LocalDate[] arr1 = {date1, date2, date3};
        LocalDate[] arr2 = {date2, date1, date3};



        System.out.println(isSorted(arr1));
        System.out.println(isSorted(arr2));


        BigInteger bigInteger1 = new BigInteger("100000000");
        BigInteger bigInteger2 = new BigInteger("10000000");
        BigInteger bigInteger3 = new BigInteger("1000000000");

        BigInteger[] intArr1 = {bigInteger1, bigInteger2, bigInteger3};

        BigInteger[] intArr2 = {bigInteger2, bigInteger1, bigInteger3};

        System.out.println(isSorted(intArr1));
        System.out.println(isSorted(intArr2));


        String s1 = "haha";
        String s2 = "ha";
        String s3 = "hahaha";

        String[] sArr1 = {s1, s2, s3};
        String[] sArr2 = {s2, s1, s3};

        System.out.println(ArrayUtil.isSorted(sArr1)
        );
        System.out.println(isSorted(sArr2));








    }


    public static <T extends Comparable> boolean isSorted(T[] arr){

        for(int i = 0; i < arr.length-1; i++){
            if(arr[i+1].compareTo(arr[i]) < 0){
                return false;
            }
        }

        return true;
    }


}
