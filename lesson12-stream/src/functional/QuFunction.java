package functional;

@FunctionalInterface
public interface QuFunction<T, X, K, U, R> {
	R apply(T t, X x, K k, U u);
}
