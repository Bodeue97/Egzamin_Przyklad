package pl.bohdanlukaszewicz;


import sun.security.util.ArrayUtil;

import java.util.Arrays;
import java.io.File;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {

        Arrays.stream(IntSequence.of(1,2,3,4).toArray()).forEach(System.out::print);
        System.out.println();
        Arrays.stream(IntSequence.squares((long)4).toArray()).forEach(obj -> System.out.print("["+obj+ "]"));
        System.out.println();
        File file = new File("src/pl/bohdanlukaszewicz");
        String[] st = file.list();

        Arrays.stream(st).map(i->{if (!i.contains(".xd"))return i;return null;}).filter(Objects::nonNull).forEach(System.out::println);

    }








}
