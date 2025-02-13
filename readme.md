# Data Types
* Primitive
* Non primitive

## Primitive 
These are built-in data types, that are already supported by the compiler.

* Integer (int)  ->  byte ( range from -128 - 127 ), short, long  
* Float (float)  ->  size = 4 bytes
* Double (double) -> size = 8 bytes
* Boolean (bool)  -> true or false    
* Character (char) -> size = 2 bytes

Note: By default 8.6 will be considered as **double**, but if you want to use float you should explicitly specify data types by "8.6f"

Note: In char you are able to take only one character that must be in single quotes '' 

## Literals
Any constant value which can be assigned to the variable is called literal/constant. 

## typecasting
* Converting the data type from one type to another
* expliciting doing the conversion called casting.
* implicit conversion of data type called conversion
* type promotion : when the result of two similar datatype goes out of bond then it automatically promoted to higher datatype

## Arthimetic Operators
Used to do mathematical operations like 
* Addition (+)
* Subtraction (-)
* Multiply(*)
* Quotient(/) 
* Reminder(%) 
* Increment (a++ or ++a)
* Decrement (a-- or --a)

## Realtional Operator
This operator always give result in boolean 
* Greater than or equal to ( > or >= )
* Smaller than or equal to ( < or <= )
* Exactly equal to ( == )
* Not equal to ( != )

## Logical Operators
* OR (||)   // Any of the condition needed to be true
* AND (&&)  // Both condition needed to be true
* NOT (!)   // If condition is true then the output will be false vice versa

## Conditional Operators
These operators are used to execute a code only if condition is true
* if 
* else if
* else

## Ternary Operators
````bash
   test-expression ? expression1:expression2;
````
In the above code, if the condition is true then expression1 will print otherwise expression 2 print will print.

## Switch 
````bash
switch(expression)
{
case value1: statement_1;
             break;
case value2: statement_2;
             break;
case value_n: statement_n;
              break;
default: default_statement;
}
````
* break statement is used to come out of the switch case whenever the condition matches

# Loops
When you want to execute a particular statement multiple times, then you used loops.

## while loop
````bash
while(expression){
   //code
}  
```` 

## do while
Is is used when you want to execute a statement once even if the condition id is not true
````bash
do{
   //code
}while(expression);
````

## for loop
````bash
for(initialization; condition; increment/decrement) {
   //code
}
````
## for each loop
It is only used in case of array and array like objects.
````bash
for( int i : array){
   //code
}
````

# OOPs : Object Oriented Programming
* class => a blueprint for creating objects.
* objects => a member (also called an instance) of a Java class. Each object has an identity, a behavior and a state.

# JDK => Java Development Code
It is used to compile your java code. It convert the java code into byte code.

# JVM => Java Virtual Machine
It runs the code after the compilation by JDK

# JRE => Java Runtime Environment
It is software that Java programs require to run correctly

# Methods Overloading
In Java, Method Overloading allows different methods to have the same name, but different signatures where the signature can differ by the number of input parameters or type of input parameters, or a mixture of both.
Method overloading in Java is also known as **Compile-time Polymorphism, Static Polymorphism, or Early binding.**

**Note** => Every method has its own stack memory. 

# Array 
Collection of same type of data under a single variable name.
````bash 
int arr[] = {1, 2, 3, 4}
```` 
## Types

**Multi-dimensional array**
It means an array has more than one rows and columns. 

* **1D** => only one row
````bash
int arr[] = new int[size]
````

* **2D** => more than one rows and columns
````bash
int arr[][] = new int[rows][columns]
````
* **jagged array** => those arrays in which the number of columns each row have is not specified
````bash
int arr[][] = new int[4][]
````

**Note** =>  By default the value of integer array are (0)

**NOTE** => Any variable starting with a capital letter is basically a **class**

--------------------------------------------------------------------------------------------------------------------------------------------------

# String
An array of characters, is simply called string. Strings are generally are immutable.

**Note** => Ever string in java is constant i.e you can't change it, it genrally stores in **String constant Pool**, a special allocated sapce in heap. [click to know more..](https://www.youtube.com/watch?v=JjIewPuyexA&list=PLsyeobzWxl7pe_IiTfNyr55kwJPWbgxB5&index=37)

**Mutable Strings** : can be changale 
**Immutable Strings** : can't be change 

* To make a string mutable you use following methods:
**StringBuffer** : It initially had 16 bit of memory even though it is empty.
**StringBuilder**

--------------------------------------------------------------------------------------------------------------------------------------------------

# static keyword 

* **static variable** : are used when you want to make a variable common for all the objects. If you change the variable with keyword in any of the objects, it will also changes for the other object too. All the objects reffer to the same static variable. Static variable can be called directly by their class name not by object name.

* **static method** : when the methods are used with a static keyword with them, they become static method. For calling a static method you can simply call them by their class name, their is no need to create a object.

**Note**: You can't call a non-static variable in a static method beacuse value of non-static varible is different for different object, by which their is confusion to which object it is referring, that's why it show error.

* **static block** : It is called only once irrespective of how many times you create an object.

**Note** : The static block execute even before the constructor.

* While creating an object, there are two steps:
<p> <b>Class loads</b> and <b>Object initialized</b>
In JVM we have **Class loader**, in which class loads only once, that's why the static block is executed only once. </p>

--------------------------------------------------------------------------------------------------------------------------------------------------

# Encapsulation :
Java Encapsulation is a way of hiding the implementation details of a class from outside access and only exposing a public interface that can be used to interact with the class.

## getter & setter

* Generally when you need to get the data, you use getter method

````bash
public returnType getVariable-name() {
   return ;
} 
````

* Generally when you need to set the data, you use setter method

````bash
public void setVariable-name() {
   //code
} 
````

**Note** : you can automatically create getter and setter within the class
* Right click on any IDE
* Click Source Action
* Click Generate getter and setter

# this keyword
It represent the current object in a method. It is generally used when the instance variable and local variable has same name, just to prevent the local object assigning value to it self, we use **this** keyword

--------------------------------------------------------------------------------------------------------------------------------------------------

# Constructor:
* It is generally used to assign the default values to a class.
* A constructor is a special kind of method that doesn't return anything.
* It's name should be as the name of the class.

# Anonymous Object:
 Objects which don't have any reference variable. It doesn't allow  to reuse the same object.
 ````bash
 new Class();
 ````

--------------------------------------------------------------------------------------------------------------------------------------------------

# Inheritance:
Inheritance means creating new classes based on existing ones. A class that inherits from another class can reuse the methods and fields of that class. In addition, you can add new fields and methods to your current class as well. 
* Inheritance is mainly used to remove the retundancy.

````bash
class name extend class-name { }
````

* The class which inherit the property of another class is called **Sub class** and the class that gave its property to another class called **Super class** and the inheritance is done by using keyword **extend** between sub class nad super class.

**Note** : Multiple inheritance is not allowed in JAVA. i.e. th below code will not work and it throw errror.
````bash
class A {
 //code
}

class B {
 //code
}

class C extends A , B {
 //code
}
````

* The above code cause **ambiguity** i.e it create a confusion when both the parent class has same method.

**Note** : Whenever you create an object  of class, it call the constructor of both sub-class and super-class.

* By default every constructor has a **super() method**, that run even berfore the constructor, which means call the constructor of a super class. 

* By default every class extends to the **Object class**, a predefined class in java.

* **this() method** is simply used when you want to call the constructor of the same class.

# Method Overriding :
It is a property in JAVA by which you can override the methods of parents class having same name. 

In the bwlow code, we are overriding the add method of the parent class in the child class. So, when you create a obj of AdvCalc, and call the add method it will call the add method that is in the child class.

````bash
class Calc {
 public int add(int n1, int n2) {
  return n1+n2;
 }
}

class AdvCalc extends Calc{
 public int add(int n1, int n2) {
  return n1+n2+1;
 }
}
````

--------------------------------------------------------------------------------------------------------------------------------------------------

# Access Modifiers :

**Public** : by making the method or variable public, you can use it outside the class or outside the package, that's why all the methods are public.

**Private** : by making the method or variable private, you constrain its ability to use outside the class i.e. the method or variable with private access modifier, they can only be used inside the same class, but you can also  access the private variable by the help of getter and setter methods, that were discussed above. 

**default** : by making the method or variable default, you can used that method or variable only inside the same package.

**protected** : by making the method or variable protected, you can use that method or variable only in the same package. But you can access the protected variable outside the package but in the sub class.


--------------------------------------------------------------------------------------------------------------------------------------------------

# Polymorphism :
consist of two words **poly** means **many** and **morphism** means **form/behaviour**

**Types :**
* Run-time polymorphism / late binding
* Compile-time polymorphism / early binding


# final keyword :

**final variable** : a variable whose value you don't want to change, in that case you simply use final keyword along the variable. It's same as making constant varibles in other languages.

**final method** : by using a final keyword with a method you prevents others from overriding the methods.

**final class** : by using a final keyword with a method you prevents others from inheriting the class.


# Wrapper Class 
Wrapper classes provide a way to use primitive data types (int, boolean, etc..) as objects.

Primitive Data Type	   Wrapper Class
----------------------------------------------------------------
      byte	               Byte
      short	               Short
      int	               Integer
      long	               Long
      float	               Float
      double	            Double
      boolean	            Boolean
      char	               Character

# Boxing : 
 Boxing in Java is the process of converting a primitive data type into its corresponding wrapper class object.
 ````bash
Integer num1 = new Integer(num);
````

**AutoBoxing** : when boxing take place implicitly.
````bash
Integer num2 = num;
````

**unBoxing** : getting a value of object type to primitive type.
````bash
int num3 = num2.intValue();
````

**AutoUnboxing** : when unboxing take place implicitly.    
````bash
int num4 = num2;
````

# Abstract :
* abstract keyword is used to define the method and that abstract method can be define in a abstract  class.
* Abstract class, it's not compulsary to use a abstract method, you can either create a abstract or non abstract or both methods.
* if you create more than one abstract method, then all those method should be inherited by the other class.


**You can't create a object of an abstract class**

# inner class :
 A class inside a class.

````bash
class A {
 public void show() {
  //code
 }

  class B {
   //code
  }
} 
````

## Anonymous Class
````bash 
className obj = new className() {
 // code
};
````

# Interface : 
An Interface in Java programming language is defined as an abstract type used to specify the behavior of a class. An interface in Java is a blueprint of a behavior

* It is similar to class in which every method of an interface is by default public abstract.

* If a class that implements from an interface must have to use all the interface methods otherwise it will become abstract class instead of concrete class.

**Note** :  All the variables inside the interface is by default **static** or **final**

* Interface don't have their memory in the heap, that's wht they have final and static variable by default.

* A class can implement multiple interfaces.

* inheritance is valid in the interface i.e.
````bash
interface X extends Y {
  //code
}
````

# enums : 
 In java, enum is also treated as the class and each member of the enum is treated as object. By default enum extends the enum class.


# Annotations : 
 A suppliment to the compiler to interact with the compiler.

 - @override : that shows that the methods override the methods of super class.

 - @Deprecated : it means you can use it but don't use it.

 ## Types of Interface:

 - Normal interface : A interface with two or more interfaces.

 ````bash
 interface abc {
   //methods
 }
 ````

 - functional interface/ SAM : When you have a single methods in an interface it is called **Single Abstract Method**
 ````bash
 interface ab {
  void show();
 }
````

 - Marker interface : A interface that have no methods in it. i.e. a blank interface.
 ````bash
 interface ab {

 }
````

# Types of Errors :
- Compile time error
- Run time error
- logical error 

# Exceptions : 
They are also known as **Runtime Errors**

 ### Handling the exception :
  We can handle the exceptions by using **try & catch** method. It is implemented when you encountered a **critical statement**, it will let your complier execute the whole code even though it ecnountered some run time errors.

**Note** : the catch block will only execute when their is exception.

**Note** : **Exception** is parent class which it self extends from **throwables** and all the other exceptions class are extend from this class. It is generally used at the bottom of the other exceptions class, when you don't know what type of error it throw.

# throw keyword:
 it is mainly used to throw custom exception. i.e. when you want to handle a exception with a catch method but during execution doesn't show that specific execution so you manually create that exception with the help of the throw..

# throws keyword:
 It is used when you have a critical statement in the method and you don't want to handle the exception there, So you just simplt throw the exception , so whenever you call the method you had to handle the exception..It is also helpful to debug the aplication...
 ````bash
  public void show() throws Exception {
   //code
   }
  ````

# Taking INput from the user :
  
 
   