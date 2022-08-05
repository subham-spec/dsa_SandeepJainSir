import java.util.*;
class MaxHeap {
    static int arr[];
    static int size;
    static int cap;
    MaxHeap(int c){
        arr = new int[c];
        cap = c;
        size = 0;
    }
    // function to insert into the heap...
    void insert(int x){
        arr[size++] = x;
        int i = size-1;
        while(i >= 1){
            int p = (i-1)/2;
            if(arr[p] < arr[i]){
                int temp = arr[p];
                arr[p] = arr[i];
                arr[i] = temp;
                i = p;
            }
            else
                return;
        }
    }
    // printing the max heap
    void print(int arr[]){
        for(int i : arr)
            System.out.print(i+" "); 
    }
    public static void main(String... args){
        MaxHeap h = new MaxHeap(10);
        h.insert(5);
        h.insert(4);
        h.insert(6);
        h.insert(8);
        h.insert(18);
        h.insert(10);
        h.insert(16);
        h.insert(1);
        h.insert(12);
        h.insert(13);

        h.print(arr);
    }
}
