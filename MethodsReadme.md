# Methods in Java
---
Method is a set of codes which perform a particular task.

Syntax

```java
    access-modifier  return-type   methodName(list of parameters) {
    //method body
    }
```
* modifier − It defines the access type of the method and it is optional to use.

* returnType − Method may return a value.

* methodName − This is the method name. The method signature consists of the method name and the parameter list. It can be anything, first letter of first word is lowercase, and the first letter of other words is uppercase without spaces between words.

* Parameter List − The list of parameters, it is the type, order, and number of parameters of a method. These are optional, method may contain zero parameters.

* method body − The method body defines what the method does with the statements.

example: 
```java
    public static int calculateSum( int num1, int num2)
    {
        int sum;
        sum = num1 + num2;
        return sum;
    }
```
