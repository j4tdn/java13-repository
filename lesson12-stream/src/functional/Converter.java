package functional;

@FunctionalInterface
public interface Converter<R> {
	R execute(R conveter);
}
