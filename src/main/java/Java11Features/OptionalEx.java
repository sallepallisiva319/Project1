package Java11Features;

import java.util.Optional;

public class OptionalEx {
    public static void main(String[] args) {
        Optional<String> empty = Optional.of("abc");
        if(empty.isPresent()) System.out.println("Optional is not Empty");
        if(empty.isEmpty()) System.out.println("Optional is Empty");
    }
}
