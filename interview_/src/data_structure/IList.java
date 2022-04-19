package data_structure;

import java.util.Comparator;
import java.util.function.Predicate;

public interface IList<E> {
    boolean isEmpty();

    boolean contains(E element);

    int size();

    Object[] toArray();

    boolean add(E element);

    boolean addAll(E[] elements);

    void delete(int index);

    void delete(E element);

    void delete(E[] elements);

    void sort(Comparator<E> comparator);

    int indexOf(E element);

    int lastIndexOf(E element);

    void clear();

    E get(int index);

    void set(int index, E element);

    Object[] get(Predicate<E> predicate);

    void print();
}
