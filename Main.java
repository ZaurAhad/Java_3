package Java.three.lesson.a.hw;

import Java.three.lesson.a.hw.friuts.Apple;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        String[] arr = {"qwe", "wer", "ert"};
        ArrayList<String> al = arrayToList(arr);

        Box<Apple> box1 = new Box<>();
        box1.add(new Apple());
    }

    public static <T> ArrayList<T> arrayToList(T[] arr) {
        return new ArrayList<>(Arrays.asList(arr));
    }

    public static <T> void swap(T[] arr, int index1, int index2) {
        T obj = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = obj;
    }

}
