package main.java.com.basics.common;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public final class App implements SealedInterface {
    public static void main(String[] args) throws Exception {
        System.out.println("Java Executable Path: " + System.getProperty("java.home"));
        System.out.println("Output from commonly used Java features from versions 8-17:");

        /*
         * Lambda Expressions (Java 8):
         * Allow you to treat functionality as a method argument.
         */
        Interface lambda = (a, b) -> {
            return a + b;
        };
        System.out.println("Lambda Expressions (Java 8): " + lambda.sum(1, 2));
        lambda.defaultMethod(1, 2);

        /*
         * Stream API (Java 8):
         * Enables functional-style operations on streams of elements, such
         * as filtering and mapping.
         */
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int sum = numbers.stream().mapToInt(n -> n).sum();
        System.out.println("Stream API (Java 8): " + sum);

        /*
         * Optional (Java 8):
         * Represents a value that may or may not be present.
         */
        Optional<String> optional = Optional.of("Hello World!");
        optional.ifPresent(s -> System.out.println("Optional (Java 8): " + s));

        /*
         * Local Variable Type Inference (var) (Java 10):
         * Allows the type of local variables to be
         * inferred by the compiler.
         */
        var list = new ArrayList<String>();
        list.add("Hello");
        list.add("World");
        list.add("!");
        System.out.println(
                "Local Variable Type Inference (var) (Java 10): " + list.get(0) + " " + list.get(1) + list.get(2));

        /*
         * String Class Methods (Java 11):
         * Introduces useful methods to the String class, such as
         * isBlank() and strip().
         */
        String string = "  Hello World!  ";
        boolean blank = string.isBlank();
        String stripped = string.strip();
        System.out.println("String Methods (Java 11): " + blank + " " + stripped);

        /*
         * Switch Expressions (Java 12):
         * Extends the switch statement to be used as an expression.
         */
        int dayNum = 7;
        String dayType = switch (dayNum) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> "Sunday";
        };
        System.out.println("Switch Expressions (Java 12): " + dayType);

        /*
         * Switch Expressions (Enhanced) (Java 14):
         * Further enhances switch expressions with additional features.
         */
        String day = "SATURDAY";
        String result = switch (day) {
            case "SUNDAY" -> "Holiday";
            case "WEDNESDAY" -> "Midweek";
            default -> {
                if (day == "SATURDAY") {
                    yield "Weekend";
                } else {
                    yield "Weekday";
                }
            }
        };
        System.out.println("Switch Expressions (Enhanced) (Java 14): " + result);

        /*
         * Text Blocks (Java 15):
         * Provides a cleaner way to write multiline strings.
         */
        String html = """
                <html>
                    <body>
                        <p>Hello, World!</p>
                    </body>
                </html>
                """;
        System.out.println("Text Blocks (Java 15):\n" + html);

        /*
         * Records (Java 16):
         * Introduces a compact syntax for declaring data classes (DTOs or POJOs).
         */
        record Point(int x, int y) {
        }
        Point point = new Point(10, 20);
        System.out.println("Records (Java 16): " + point.x + " " + point.y);
    }
}
