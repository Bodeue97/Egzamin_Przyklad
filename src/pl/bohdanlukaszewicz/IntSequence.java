package pl.bohdanlukaszewicz;


import java.math.BigInteger;
import java.util.stream.Stream;

public interface IntSequence {


    static Stream<BigInteger> squares(Long a){
        Stream<BigInteger> stream3 = Stream.iterate(BigInteger.valueOf(a), i -> i.add(BigInteger.ONE) ).map(i->i.multiply(i)).limit(100);
        return stream3;
    }


    static Stream<Integer> of(Integer... a) {

        Stream<Integer> stream1 = Stream.of(a);
        Stream<Integer> stream2 = Stream.iterate(1, i  -> 1).limit(100);

        return  Stream.concat(stream1, stream2);






    }


}
