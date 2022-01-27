package pl.bohdanlukaszewicz;

import java.util.Locale;
import java.util.Scanner;

public class Enumeracje {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = sc.next().toUpperCase();
        Size size = Enum.valueOf(Size.class, input);
        System.out.println(size.getAb());
    }



}

enum Size{
    SMALL("S"), MEDIUM("M");
    private Size(String ab){
        this.ab = ab;
    }
    public String getAb(){
        return ab;
    }

    private String ab;
}
