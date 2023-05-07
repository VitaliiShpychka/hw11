package home5;

import java.util.Iterator;
import java.util.stream.Stream;

public class StreamZip {

    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {

        Iterator<T> iterator1 = first.iterator();
        Iterator<T> iterator2 = second.iterator();

        Stream.Builder<T> builder = Stream.builder();
        while (iterator1.hasNext() && iterator2.hasNext()) {
            builder.add(iterator1.next());
            builder.add(iterator2.next());
        }

        return builder.build();
    }
}
