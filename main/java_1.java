import java.util.Arrays;
import java.util.Scanner;

class arr {
    int capacity;
    int size;
    int arr[];

    arr(int cap, int sz) {
        this.capacity = cap;
        this.size = sz;
        this.arr = new int[this.capacity];
        // this.arr = {96, 33, 89, 15, 48, 77, 3, 24, 4, 50, 16, 89, 54, 74, 65, 6, 59,
        // 62, 45, 92, 34, 55, 39, 48, 69, 93, 3, 98, 3, 92, 82, 72, 36, 93, 44, 4, 1,
        // 53, 89, 40, 60, 26, 48, 35, 29, 0, 89, 63};
    }

    void intialise() {
        /// INItialising the array;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < size; i++) {
            // System.out.print("Enter the " + i + " element: ");
            // arr[i] = sc.nextInt();
            arr[i] = i * 10;
        }
        sc.close();
    }

    /// INSERTING THE ELEMENT AT A PARTICULAR INDEX
    void insert(int elem, int index) {
        if (index == capacity) {
            System.out.println("Array full");
            return;
        }
        for (int i = size; i >= index; i--) {
            arr[i + 1] = arr[i];
        }
        arr[index] = elem;
        size++;

    }

    /// Displaying all the elements of array;
    void display() {
        for (int i = 0; i < size; i++) {
            System.out.println(i + " : " + arr[i]);
        }
        System.out.println("\n" + ("--").repeat(100));
    }

    /// DELETION IN ARRAY
    int del(int index) {
        int elem = arr[index];
        for (int i = index; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        return elem;

    }

    // LINEAR SEARCH
    int linear(int elem) {
        for (int i = 0; i < size; i++) {
            if (elem == arr[i]) {
                return i;
            }
        }
        return -9999;
    }

    // Binary SEARCH
    int binary(int elem) {
        int l = 0, h = size - 1, m = (h + l) / 2;
        // Arrays.sort(arr);
        if (arr[0] == elem) {
            return 0;
        }
        while (arr[m] != elem) {
            if (elem > arr[m]) {
                l = m;
                m = (h + l) / 2;
            }
            if (elem < arr[m]) {
                h = m;
                m = (h + l) / 2;
            }
        }
        return m;
    }
}

/**
 * java_1
 */
public class java_1 {

    public static void main(String[] args) {
        arr a = new arr(100, 5);
        a.intialise();
        a.display();
        // a.linear(12);
        // a.binary(1);
        // a.del(0);
        // a.insert(1, 12);
        // System.out.println(a.lienar(11));
    }
}