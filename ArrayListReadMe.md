# ArrayList

## Introduction

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
        ArrayList<String> arrL = new ArrayList<String>(2);
        
        
        
```
#### Add an Item:

To add an element.
```java
arrL.add("thing to insert");
arrL.add("This too");
```

#### Access an Item :

To access an element in the ArrayList, use the get() method and refer to the index number:
```java
arrL.get(0);
```

#### Change an Item

To modify an element, use the set() method and refer to the index number:
```java
arrL.set(0,"thing to insert");
```

#### Remove an Item

To remove an element, use the remove() method and refer to the index number:

```java
arrL.remove(0);
```
**Note: when the element at 0 index is removed, other elements shift to fill the void. 1 becomes 0 and so on.**
**To remove all the elements in the ArrayList, use the clear() method:**
```java
arrL.clear();
```

#### ArrayList Size
To find out how many elements an ArrayList has, use the size method:

```java
arrL.size();
```

#### Loop Through an ArrayList
Loop through the elements of an ArrayList with a for loop, and use the size() method to specify how many times the loop should run:

```java
for (int i = 0; i < arrL.size(); i++) {
      System.out.println(cars.get(i));
    }
```
**For each loop:**
```java
for (String i : cars) {
      System.out.println(i);
    }
```




