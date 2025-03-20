/**
 * A dynamic array implementation that automatically resizes when elements are added or removed.
 * 
 * @author Patcharee Cahterina Jirakittiyakhon
 */
public class DynamicArray {
    private int[] array;
    private int size;

    /**
     * Constructs a DynamicArray with a specified initial capacity.
     * 
     * @param capacity the initial capacity of the array
     * @throws IllegalArgumentException if the capacity is negative
     */
    public DynamicArray(int capacity) {
        if (capacity < 0) {
            throw new IllegalArgumentException("Capacity cannot be negative");
        }
        this.array = new int[capacity];
        this.size = 0;
    }

    /**
     * Constructs a DynamicArray with a default initial capacity of 3.
     */
    public DynamicArray() {
        this(3);
    }

    /**
     * Constructs a copy of another DynamicArray.
     * 
     * @param other the DynamicArray to copy
     * @throws IllegalArgumentException if the source array is null
     */
    public DynamicArray(DynamicArray other) {
        if (other == null) {
            throw new IllegalArgumentException("Source array cannot be null");
        }
        this.array = new int[other.getCapacity()];
        this.size = other.getSize();
        for (int i = 0; i < this.size; i++) {
            this.array[i] = other.get(i);
        }
    }

    /**
     * Returns the number of occupied elements in the array.
     * 
     * @return the current size of the array
     */
    public int getSize() {
        return size;
    }

    /**
     * Returns the capacity of the array.
     * 
     * @return the total capacity of the array
     */
    public int getCapacity() {
        return array.length;
    }

    /**
     * Returns a copy of the entire array.
     * 
     * @return a new array containing all elements, including unoccupied spaces
     */
    public int[] getArray() {
        int[] copy = new int[array.length];
        System.arraycopy(array, 0, copy, 0, array.length);
        return copy;
    }

    /**
     * Returns a copy of the occupied portion of the array.
     * 
     * @return a new array containing only the used elements
     */
    public int[] toArray() {
        int[] copy = new int[size];
        System.arraycopy(array, 0, copy, 0, size);
        return copy;
    }

    /**
     * Adds an element to the end of the array, resizing if necessary.
     * 
     * @param num the element to add
     */
    public void push(int num) {
        if (size == array.length) {
            resize(array.length * 2);
        }
        array[size++] = num;
    }

    /**
     * Removes and returns the last element of the array.
     * 
     * @return the last element
     * @throws RuntimeException if the array is empty
     */
    public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("Array is empty");
        }
        int lastElement = array[--size];
        if (size > 0 && size == array.length / 4) {
            resize(array.length / 2);
        }
        return lastElement;
    }

    /**
     * Returns the element at a specific index.
     * 
     * @param index the index of the element
     * @return the element at the specified index
     * @throws IndexOutOfBoundsException if the index is out of bounds
     */
    public int get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Illegal index");
        }
        return array[index];
    }

    /**
     * Returns the index of the first occurrence of a key.
     * 
     * @param key the element to search for
     * @return the index of the element, or -1 if not found
     */
    public int indexOf(int key) {
        for (int i = 0; i < size; i++) {
            if (array[i] == key) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Inserts an element at a specified index, shifting elements if necessary.
     * 
     * @param index the index to insert at
     * @param num the element to insert
     * @throws IndexOutOfBoundsException if the index is out of bounds
     */
    public void add(int index, int num) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Illegal index");
        }
        if (size == array.length) {
            resize(array.length * 2);
        }
        for (int i = size; i > index; i--) {
            array[i] = array[i - 1];
        }
        array[index] = num;
        size++;
    }

    /**
     * Removes and returns an element at a specific index.
     * 
     * @param index the index to remove
     * @return the removed element
     * @throws IndexOutOfBoundsException if the index is out of bounds
     */
    public int remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Illegal index");
        }
        int removedElement = array[index];
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        size--;
        if (size > 0 && size == array.length / 4) {
            resize(array.length / 2);
        }
        return removedElement;
    }

    /**
     * Checks if the array is empty.
     * 
     * @return true if the array is empty, false otherwise
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * Returns a string representation of the array.
     * 
     * @return a string containing the occupied elements
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < size; i++) {
            sb.append(array[i]);
            if (i < size - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /**
     * Checks if two DynamicArray objects are equal.
     * 
     * @param obj the object to compare
     * @return true if they are equal, false otherwise
     */
    public boolean equals(DynamicArray obj) {
        if (obj == null || this.size != obj.getSize()) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (this.array[i] != obj.get(i)) {
                return false;
            }
        }
        return true;
    }

    /**
     * Resizes the array to a new capacity.
     * 
     * @param newCapacity the new size of the array
     */
    private void resize(int newCapacity) {
        int[] newArray = new int[newCapacity];
        System.arraycopy(array, 0, newArray, 0, size);
        array = newArray;
    }
}
