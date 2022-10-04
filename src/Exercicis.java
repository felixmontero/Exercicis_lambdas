import java.math.BigDecimal;
import java.util.Map;
import java.util.function.*;

public class Exercicis {

    /**
     * Torna un supplier que sempre torna "Hello"
     */
    public static Supplier<String> helloSupplier() {

        Supplier <String> helloSupplier= () -> "Hello";



        return helloSupplier;
    }

    /**
     * Torna un Predicate que mira si l'string és buit
     */
    public static Predicate<String> isEmptyPredicate() {
        Predicate<String> isEmptyPredicate = (s) -> s.isEmpty();


        return isEmptyPredicate;
    }

    /**
     * Torna un Function que accepta un String que retorna aquest string repetit
     * n vegades, on n es passa com a argument de la funció.
     */
    public static BiFunction<String, Integer, String> stringMultiplier() {

        BiFunction<String, Integer, String> stringMultiplier = (s,n) -> s.repeat(n);

        return stringMultiplier;
    }

    /**
     * Torna un Function que converteix un BigDecimal a String que comença pel símbol "$"
     */
    public static Function<BigDecimal, String> toDollarStringFunction() {

        Function<BigDecimal, String> toDollarStringFunction = (n) -> "$"+n  ;

        return toDollarStringFunction;
    }

    /**
     * Es reben dos paràmetres que representen un rang (min,max) i retorna
     * un Predicate<String> que verifica si la longitud de l'string està
     * dins aquest rang.
     */
    public static Predicate<String> lengthInRangePredicate(int min, int max) {
        return null;
    }

    /**
     * Retorna un Supplier de números enters aleatoris
     */
    public static IntSupplier randomIntSupplier() {
        return null;
    }


    /**
     * Retorna un IntUnaryOperator que reb un int com un límit que a la vegada
     * retorna un número aleatori dins aquest límit
     */
    public static IntUnaryOperator boundedRandomIntSupplier() {
        return null;
    }

    /**
     * Retorna un IntUnaryOperator que calcula un quadrat d'un número
     */
    public static IntUnaryOperator intSquareOperation() {
        return null;
    }

    /**
     * Retorna un LongBinaryOperator que realitza l'operació de suma
     */
    public static LongBinaryOperator longSumOperation() {
        return null;
    }

    /**
     * Retorna un ToIntFunction<String> que converteix un String a un Integer
     */
    public static ToIntFunction<String> stringToIntConverter() {
        return null;
    }

    /**
     * Reb un paràmetre n (int), i retorna un Supplier que proporciona un IntUnaryOperator
     * que realitza la funció f(x) = n * x
     */
    public static Supplier<IntUnaryOperator> nMultiplyFunctionSupplier(int n) {
        return null;
    }

    /**
     * Retorna una funció que composa funcions amb la funció trim() de String
     */
    public static UnaryOperator<Function<String, String>> composeWithTrimFunction() {
        return null;
    }

    /**
     * Reb un Runnable com a paràmetre i retorna un Supplier<Thread>
     * Aquest thread s'iniciarà quan es cridi al mètode "get()" del supplier.
     */
    public static Supplier<Thread> runningThreadSupplier(Runnable runnable) {
        return null;
    }

    /**
     * Retorna un Consumer que accepta un Runnable com a paràmetre i l'executa
     * dins un nou fil (thread)
     */
    public static Consumer<Runnable> newThreadRunnableConsumer() {
        return null;
    }

    /**
     * Retorna una Function que accepta una instància d'un Runnable i retorna
     * un Supplier d'un Thread que s'ha creat per aquest Runnable.
     */
    public static Function<Runnable, Supplier<Thread>> runnableToThreadSupplierFunction() {
        return null;
    }

    /**
     * Retorna una BiFunction que té 2 paràmetres.
     *
     * El primer serà un IntUnaryOperator, que és una funció "integer".
     *
     * El segon serà un IntPredicate, que és una condició sobre un integer.
     *
     * Aquesta BiFunction tornarà una funció composada, que farà el següent:
     *
     * - Si el IntPredicate verifica la seva condició, aplicarà la funció
     * - Si el IntPredicate no es compleix, retorna el mateix element que s'ha rebut
     */
    public static BiFunction<IntUnaryOperator, IntPredicate, IntUnaryOperator> functionToConditionalFunction() {
        return null;
    }

    /**
     * Torna una BiFunction, on el primer paràmetre és un un Map (la clau és una nom d'una funció
     * i el valor és una funció tipus IntUnaryOperator), el segon paràmetre és un String, que és
     * també el nom d'una funció.
     *
     * Si el Map conté una funció amb el nom del segon paràmetre, aleshores es torna la funció
     * emmagatzemada al map. Si no hi és, tornem la funció "identity()", que no és més que una
     * funció que retorna el mateix paràmetre que li passem.
     */
    public static BiFunction<Map<String, IntUnaryOperator>, String, IntUnaryOperator> functionLoader() {
        return null;
    }

    /**
     * Retorna un Supplier d'un Supplier d'un Supplier de l'string "BEN FET!"
     */
    public static Supplier<Supplier<Supplier<String>>> trickyWellDoneSupplier() {
        return null;
    }
}
