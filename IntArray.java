import java.util.Arrays;
import java.util.Random;

public class IntArray {
    // Private data fields
    private int length;
    private int[] myArray;

    // Constructor: initializes the array with the given size
    public IntArray(int size) {
        length = size;
        myArray = new int[size];
    }

    // Returns the size of the array
    public int size() {
        return length;
    }

    // Fills the array with random numbers between 1 and 6
    public void fillRand() {
        Random rand = new Random();
        for (int i = 0; i < length; i++) {
            myArray[i] = rand.nextInt(6) + 1; // Random number between 1 and 6
        }
    }

    // Sets the value at a specific index
    public void set(int index, int value) {
        if (index >= 0 && index < length) {
            myArray[index] = value;
        } else {
            throw new IndexOutOfBoundsException("Index out of range");
        }
    }

    // Gets the value at a specific index
    public int get(int index) {
        if (index >= 0 && index < length) {
            return myArray[index];
        } else {
            throw new IndexOutOfBoundsException("Index out of range");
        }
    }

    // Clears the array (resets all elements to 0)
    public void clear() {
        Arrays.fill(myArray, 0);
    }

    // Checks if the array is empty (all values are 0)
    public boolean isEmpty() {
        for (int value : myArray) {
            if (value != 0) {
                return false;
            }
        }
        return true;
    }

    // Sorts the array in ascending order
    public void sort() {
        Arrays.sort(myArray);
    }

    // Returns a string representation of the array
    @Override
    public String toString() {
        return Arrays.toString(myArray);
    }
}
