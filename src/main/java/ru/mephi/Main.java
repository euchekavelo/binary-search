package ru.mephi;

import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        byte[] bytes = new byte[] {1, 2, 3, 4 ,5};
        System.out.println("index number: " + Arrays.binarySearch(bytes, (byte) 2));
        System.out.println("index number: " + Arrays.binarySearch(bytes, 1, 4, (byte) 2));

        char[] chars = new char[] {'a', 'b', 'c', 'd', 'e'};
        System.out.println("index number: " + Arrays.binarySearch(chars, 'd'));
        System.out.println("index number: " + Arrays.binarySearch(chars, 1, 4, 'd'));

        double[] doubles = new double[] {1.0d, 2.2d, 3.7d, 4.1d, 5.5d};
        System.out.println("index number: " + Arrays.binarySearch(doubles, 3.7d));
        System.out.println("index number: " + Arrays.binarySearch(doubles, 1, 4, 3.7d));

        float[] floats = new float[] {1.0f, 2.2f, 3.7f, 4.1f, 5.5f};
        System.out.println("index number: " + Arrays.binarySearch(floats, 2.2f));
        System.out.println("index number: " + Arrays.binarySearch(floats, 1, 4, 3.7f));

        int[] intArray = new int[] {1, 2, 3, 4, 5};
        System.out.println("index number: " + Arrays.binarySearch(intArray, 1));
        System.out.println("index number: " + Arrays.binarySearch(intArray, 1, 4, 1));

        long[] longArray = new long[] {2L, 4L, 6L, 8L, 10L};
        System.out.println("index number: " + Arrays.binarySearch(longArray, 8L));
        System.out.println("index number: " + Arrays.binarySearch(longArray, 1, 3, 1L));

        short[] shortArray = new short[] {2, 4, 6, 12, 16};
        System.out.println("index number: " + Arrays.binarySearch(shortArray, (byte) 12));
        System.out.println("index number: " + Arrays.binarySearch(shortArray, 1, 4, (byte) 12));

        Person john = new Person("John", 29);
        Person sue = new Person("Sue", 30);
        Person david = new Person("David", 32);
        Person lesli = new Person("Lesli", 34);
        Comparator<Person> comparator = new PersonFullNameComparator();
        Person[] persons = new Person[] {john, sue, david, lesli};
        System.out.println("index number: " + Arrays.binarySearch(persons, sue, comparator));
        System.out.println("index number: " + Arrays.binarySearch(persons, 1, 2, sue, comparator));

        List<Person> personList = List.of(persons);
        System.out.println("index number: " + Collections.binarySearch(personList, sue, comparator));
        System.out.println("index number: " + Collections.binarySearch(personList, sue));
    }
}