package data_structure;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;
import java.util.function.Predicate;

public class CustomList<E> implements IList<E> {
    private int size;
    private int initialSize = 4;
    private Object[] elements;

    public CustomList() {
        elements = createGenericArray(initialSize);
    }

    public CustomList(int sizeOfArray) {
        if (sizeOfArray < 0) {
            throw new ArithmeticException("Size of array can't be negative!");
        }
        if (sizeOfArray > initialSize) {
            initialSize = sizeOfArray;
        }
        elements = createGenericArray(initialSize);
    }

    @Override
    public E[] get(Predicate<E> predicate) {
        return (E[]) Arrays.stream((E[]) elements)
                .filter(Objects::nonNull)
                .filter(predicate)
                .toArray(Object[]::new);
    }

    //OK
    @Override
    public void sort(Comparator<E> comparator) {
        elements = Arrays.stream((E[]) elements)
                .filter(Objects::nonNull)
                .sorted(comparator)
                .toArray(this::createGenericArray);
    }

    //OK
    @Override
    public Object[] toArray() {
        return elements;
    }

    //OK
    private E[] createGenericArray(int size) {
        return (E[]) Array.newInstance(Object.class, size);
    }

    //OK
    @Override
    public boolean contains(E element) {
        return Arrays.asList(elements).contains(element);
    }

    //OK
    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    //OK
    @Override
    public int size() {
        return size;
    }

    //OK
    @Override
    public boolean add(E element) {
        if (size < initialSize) {
            elements[size++] = element;
            return true;
        }
        elements = grow(size + initialSize);
        elements[size++] = element;
        return true;
    }

    //OK
    @Override
    public boolean addAll(E[] elements) {
        try {
            Arrays.stream(elements).forEach(this::add);
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
        return true;
    }

    //OK
    private Object[] grow(int newSize) {
        Object[] newArray = createGenericArray(newSize);
        if (size >= 0) System.arraycopy(elements, 0, newArray, 0, size);
        return newArray;
    }

    //OK
    @Override
    public void delete(int index) {
        if (index < 0) {
            throw new ArrayIndexOutOfBoundsException("Index cant be negative!");
        }
        if (index > size) {
            throw new ArrayIndexOutOfBoundsException("Index out of bounds!");
        }
        for (int i = 0; i < size; i++) {
            if (i == index) {
                for (int j = i; j < size - 1; j++) {
                    Object temp = elements[j];
                    elements[j] = elements[j + 1];
                    elements[j + 1] = temp;
                }
            }
        }
        size = size - 1;
        elements = Arrays.copyOfRange(elements, 0, size);
    }

    //OK
    @Override
    public void delete(E element) {
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(element)) {
                delete(i);
            }
        }
    }

    //OK
    @Override
    public void delete(E[] delete_elements) {
        for (E del_e : delete_elements) {
            delete(del_e);
        }
    }

    //OK
    @Override
    public int indexOf(E element) {
        return Arrays.asList(elements).indexOf(element);
    }

    //OK
    @Override
    public int lastIndexOf(E element) {
        return Arrays.asList(elements).lastIndexOf(element);
    }

    //OK
    @Override
    public void clear() {
        elements = createGenericArray(0);
        size = 0;
    }

    //OK
    @Override
    public E get(int index) {
        return (E) elements[index];
    }

    //OK
    @Override
    public void set(int index, E element) {
        if (index < 0) {
            throw new ArrayIndexOutOfBoundsException("Index can't be negative!");
        }
        if (index > size) {
            throw new ArrayIndexOutOfBoundsException("Index out of bounds!");
        }
        elements[index] = element;
    }

    //OK
    @Override
    public void print() {
        Arrays.stream(elements)
                .filter(Objects::nonNull)
                .forEach(System.out::println);
    }
}
