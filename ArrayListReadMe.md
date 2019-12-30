# ArrayList

## Introduction
---
The ArrayList class is a resizable array, which can be found in the java.util package.

The difference between a built-in array and an ArrayList in Java, is that the size of an array cannot be modified (if you want to add or remove elements to/from an array, you have to create a new one). While elements can be added and removed from an ArrayList whenever you want.

Following are few key points to note about ArrayList in Java -

* An ArrayList is a re-sizable array, also called a dynamic array. It grows its size to accommodate new elements and shrinks the size when the elements are removed.

* ArrayList internally uses an array to store the elements. Just like arrays, It allows you to retrieve the elements by their index.

* Java ArrayList allows duplicate and null values.

* Java ArrayList is an ordered collection. It maintains the insertion order of the elements.

* You cannot create an ArrayList of primitive types like int, char etc. You need to use boxed types like Integer, Character, Boolean etc.

* Java ArrayList is not synchronized. If multiple threads try to modify an ArrayList at the same time, then the final outcome will be non-deterministic. You must explicitly synchronize access to an ArrayList if multiple threads are gonna modify it.

### Declaration

```java

      import java.util.ArrayList; // import the ArrayList class
      
      ArrayList<Type> arrName = new ArrayList<Type>();
      //Here Type is the type of elements in ArrayList to be created
      // arrName is the name
      
        // Creating an ArrayList of String
        List<String> animals = new ArrayList<String>();
        
        // Create an arrayList with initial capacity 2 
        ArrayList<Integer> arrL = new ArrayList<Integer>(2);
        
        
        
```
