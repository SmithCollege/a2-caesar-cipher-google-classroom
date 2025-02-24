// Do not change the line below. It lets Gradle find your 
// Classes to build the project
package a1template;

public class DynamicArray<T> implements IndexAccess<T>{
    
    // What instance variables do you need?
    private T [] arr;
    private int size;

    // Write a constructor to make a new DynamicArray Object from an array test
    public DynamicArray(T[] arr){
        this.arr = arr;
        this.size = arr.length; 
    }
    public T get(int i){
       if (i < 0 || i >= size) throw new IndexOutOfBoundsException("Index out of bounds");
        return arr[i];
    }
    public T get(int i, int offset){
        if (i < 0 || i >= size) throw new IndexOutOfBoundsException("Index out of bounds");
        int newIndex = i + offset;
        if (newIndex < 0 || newIndex >= size) throw new IndexOutOfBoundsException("Index out of bounds");   
        if(newIndex < 0){
            newIndex += size;
        }
        return arr[newIndex]; 
    }
    public void set(int i, T val){
        if (i < 0 || i >= size) throw new IndexOutOfBoundsException("Index out of bounds");
        arr[i] = val;
    }

    // Now implement the methods from IndexAccess?


}