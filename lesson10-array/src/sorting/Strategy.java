package sorting;

public interface Strategy {
	/**
	 * If a>b return true and false if vice versa
	 * 
	 * a first element
	 * b second element
	 * positive if a>b,negative a<b,zero if a = b
	 * 
	 */
    int compare(int a,int b);
}
