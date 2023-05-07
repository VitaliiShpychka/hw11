package home5;

import java.util.stream.Stream;

public class MainStreamZip {
    public static void main(String[] args) {

        Stream<Integer> stream1 = Stream.of(1, 2, 3);
        Stream<Integer> stream2 = Stream.of(4, 5, 6, 7);

        Stream<Integer> zippedStream = StreamZip.zip(stream1, stream2);
        zippedStream.forEach(System.out::println);
    }
}
