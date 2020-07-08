import java.util.function.Consumer;

public class Coin {

    static void throwCoin() {

        Consumer<Integer> consumer = x -> {
            if ((x % 2) == 0 )
                System.out.println("Орел");
            else
                System.out.println("Решка");
        };
        consumer.accept((int) (Math.random()* 2));

    }
}
