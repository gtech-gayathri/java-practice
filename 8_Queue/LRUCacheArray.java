// Simple LRU Cache using Arrays in Java

import java.util.Scanner;

class LRUCacheArray {
    int[] keys;    // store keys
    int[] values;  // store values
    int capacity;
    int size;

    public LRUCacheArray(int capacity) {
        this.capacity = capacity;
        keys = new int[capacity];
        values = new int[capacity];
        size = 0;
    }

    // Get value for a key
    int get(int key) {
        for (int i = 0; i < size; i++) {
            if (keys[i] == key) {
                // Move this key-value to front (most recently used)
                int k = keys[i], v = values[i];
                for (int j = i; j > 0; j--) {
                    keys[j] = keys[j - 1];
                    values[j] = values[j - 1];
                }
                keys[0] = k;
                values[0] = v;
                return v;
            }
        }
        return -1; // not found
    }

    // Put key-value in cache
    void put(int key, int value) {
        // Check if key exists
        for (int i = 0; i < size; i++) {
            if (keys[i] == key) {
                // Update value and move to front
                for (int j = i; j > 0; j--) {
                    keys[j] = keys[j - 1];
                    values[j] = values[j - 1];
                }
                keys[0] = key;
                values[0] = value;
                return;
            }
        }

        // If cache is full, remove last (LRU)
        if (size == capacity) size--;
        // Shift all elements to right
        for (int i = size; i > 0; i--) {
            keys[i] = keys[i - 1];
            values[i] = values[i - 1];
        }
        keys[0] = key;
        values[0] = value;
        if (size < capacity) size++;
    }

    // Display cache
    void display() {
        System.out.print("Cache: ");
        for (int i = 0; i < size; i++) System.out.print("[" + keys[i] + ":" + values[i] + "] ");
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {
        LRUCacheArray cache = new LRUCacheArray(3);
        cache.put(1, 100);
        cache.put(2, 200);
        cache.put(3, 300);
        cache.display(); // [3:300] [2:200] [1:100]

        cache.get(2);
        cache.display(); // [2:200] [3:300] [1:100]

        cache.put(4, 400);
        cache.display(); // [4:400] [2:200] [3:300], 1 removed
    }
}

/*
Sample Output:
Cache: [3:300] [2:200] [1:100] 
Cache: [2:200] [3:300] [1:100] 
Cache: [4:400] [2:200] [3:300] 
*/
