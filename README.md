<br/>
JDK11	-	Installing Java 11 JDK  11.0.8 only

<br/>
Eclipse IDE - 	Eclipse IDE for Enterprise Java and Web Developers (includes Incubating components)

Version: 2023-12 (4.30.0)
Build id: 20231201-2043


Dbeaver



java -version



What is java ?

OOPS
Platform independent
strongly typed
multithreaded




JVM
JDK	- java development kit	- jvm is platform dependent,jre, libraries (jdk)
JRE	- java runtime environment	- jvm, jre - only able to run java programs


First program


IDE - Intergrate Development Environment

Eclipse IDE

https://www.eclipse.org/downloads/packages/release/2023-03/r/eclipse-ide-enterprise-java-and-web-developers

DB ?


Agenda for Day 2 :

•	Class, Object, Attribute, method
•	Access Modifiers – Private, Public 
•	Constructors
•	Default and Args Constructor
•	Getters and Setters
•	Data types and Operators
•	Arrays 
•	Control Flow statements 
•	Enums
Class Design
•	Class and Objects
•	Instance Variables and Static Variables
•	Methods and Constructors
Polymorphism
•	Method Overloading 
•	Constructor Overloading
•	Use of “this” keyword
•	Variable Argument Method (Varargs) in Java
•	Varargs versus Overloading
Inheritance
•	Inheritance Basics
•	Use of super keyword
•	Overriding
•	Rules regarding overriding
•	Runtime Polymorphism

Abstraction
•	Abstract classes and methods
•	Final classes and methods
•	Interfaces



/src	- java 
/bin	- class


Class, Object, Attribute, method

Primitive variables 

numbers : 	int, long, byte, short
decimal	:	float, double
single	:	char
yes/no	:	boolean



byte	- 1 byte
short 	- 2 byte
int	- 4 bytes		by default
long	- 8 byte


float	- 4 byte
double	- 8 byte		by default

boolean	- 2 byte
char	- 1 byte



float marks = 98.8;

System.out.println(marks+1);



byte b1 = 12;
byte b2 = 15;
byte result = b1 + b2;
System.out.println(result);




b++;
b+=19;

============================================================
# Java

Java is an Object Oriented Programming language. It was picked up by Oracle, that develops 1 common implementation of the JRE and JDK, and through their (and others) efforts, Java has become very widely used.

## Features/Characteristics

- Object Oriented
- Strongly and Statically Typed
- Leverages Java ByteCode (.class files) to accomplish distribution of Java programs
    - Makes it easier to share/collaborate
- Garbage Collector handles Memory Management for the developer
- The JVM is small, and so can be run on many different platforms
    - Particularly useful for embedded systems (Raspberry Pis)
- Many standard libraries are provided
- Relatively performant
    - Not as fast as C or C++, but faster than most other languages
- As of Java 8, introduced some APIs for Functional Programming

## JVM / JRE / JDK

JDK stands for Java Devlopment Kit

JRE stands for Java Runtime Environment

JVM stands for Java Virtual Machine

JDK contains the JRE, as well as many different developer tools, such as the compiler or the archiver.

JRE contains the JVM as well as supporting libraries that the JVM needs to function.

The Java Compiler is the executable that produces Java ByteCode from Java Source Code (From .java to .class)

The JVM (along with the libraries from the JRE) executes the Java ByteCode.


## Garbage Collection

The Java Garbage Collector is a separate thread that runs alongside your Java program. This is a Deamon Thread, which means it is a long running thread, that will often be "asleep".
 It will occasionally "wake up" and perform some garbage collection. This means it will find any objects in memory that are no longer being used, and freeing that memory so that other processes can use it again.

## Memory Structure

Memory is separated into 2 regions: The Stack and The Heap.

The Stack is a organized structure that stores information about method/function calls as well as local variables.

The Heap is an unstructured area of memory that stores Objects.

Java has 8 primitive datatypes that are NOT objects. These primitive datatypes are generally stored on the stack (if they are local variables).
- int
    - 4 bytes = 32 bits
- double
    - 8 bytes = 64 bits
- byte
    - 1 byte = 8 bits
- boolean
    - 1 byte = 8 bits (sort of)
    - JVM dependent
    - They can potentially be stored in only 1 bit, if many booleans are created
    - Among other optimizations
- char
    - 2 bytes = 16 bits
- long
    - 8 bytes = 64 bits
- float
    - 4 bytes = 32 bits
- short
    - 2 bytes = 16 bits




Code Structure in java 
=================


Put your class in files
Put your methods inside the class
put your statements inside the methods





Packages
=========

Hands on - Please create two packages

pack1	: 
		A	amethod
		B	bmethod
		C	cmethod

pack2	
		D	dmethod
		E	emethod


Call all these methods on Client.java


10 minutes



================================================

# Object Oriented Programming

Object Oriented Programming focuses on the concepts of Classes and Objects. Where objects are representations of real world objects, in code. Classes are blueprints for these objects.

We define Objects as having state and behavior: properties/characteristics/fields as well as methods/functions.

Object Oriented Design has 4 pillars: Abstraction, Polymorphism, Inheritance, and Encapsulation (A-PIE)

## Abstraction

You do not show the underlying details, you only show what is needed.
This is accomplished occasionally with private methods, that contain complex logic that isn't important. As well as through the use of interfaces and abstract classes. In general, we combine this pillar with the pillar of Polymorphism to hide away the underlying details, and only show the contract to interact in a particular way (such as with the List interface).

## Polymorphism

Polymorphism as an English word means to take on many forms. More specifically, it means an Object can take on different forms/characteristics. An Object can take on the form of any Class within its inheritance heirarchy. An Example would be that a Rabbit can take on the form of the Animal Class.

There are additionally 2 techniques we can use to accomplish Polymorphism: Method Overloading and Method Overriding.

Method Overriding is when a subclass replaces the implementation of a parent class's method, generally with a more specific implementation. The subclass must have the exact same method name and parameters (together are called the "method signature"). The return type can be changed on a limited scope. If the parent class's method had an Object as the return type, the subclass may change the return type to be a subclass of the original return type. For example, if the parent class returned an `Object`, the suclass could change the return type to `Animal`. However, if the parent class's return type was `void` or a primitive, the subclass cannot change it.

Method Overloading is when you define multiple methods with the same name, but with a different method signature (in particular, this means there will be a different list of parameter types). You cannot overload a method by simply having a different return type. However, overloaded methods may have different return types. Under the hood in Java, overloaded methods are simply independent and unrelated methods. They may have different types because of this.

When we declare multiple Constructors, this _is_ Method Overloading, or Constructor Overloading.

Method Overriding is referred to as "Runtime Polymorphism". Method Oveerloading is referred to as "Compile-time Polymorphism".

Another technique that ties into Polymorphism is called "Covariance" or "Covariant Return Types".
This where the reference variable is of a different type from the Object it points to. This ties into the pillar of Abstraction as well, since we can effectively hide the details of the specific subclass if it is not important.

## Inheritance

The pillar of Inheritance stipulates that Classes are able to inherit properties and behaviors from a Parent class. In particular, subclasses are "more specific" versions of a parent class. Examples might be inheriting from a `Animal` class to define a `Dog` class. Or inheriting from a `Person` class to define a `Employee` class.

In Object Oriented Design, there are different types of Inheritance, such as "Multiple Inheritance" or "Multi-Level Inheritance". Multiple Inheritance is that a single class can inherit from multiple parent classes. Multi-Level Inheritance is that inheritance can chain across multiple generations. For Example, `Animal` - `Person` - `Student` - `MathStudent`

Java supports Multi-Level Inheritance, but does not support multiple Inheritance for classes. However, interfaces do support multiple inheritance. This is allowed through the various restrictions placed on interfaces. For example, interfaces can only have `public` and `abstract` methods (or must use the `default` or `static` keywords).

## Encapsulation

The idea of Encapsulation is that Objects should restrict access to the data (state/properties) to be used in proper ways. For example, if an object has an `age` property, it should restrict access so that this property cannot be set to a negative value.

We accomplish Encapsulation through the use of the 4 access modifiers (`public`, `protected`, `private`, and `default`) along with public getter/setter methods to control the manipulation/access to the data.















Hands on - 30 minutes


Client.java	- should contain main method


Employee.java	- should contain following properties and methods

allocateProject
	"Employee is working on project"


Product.java	- should contain following properties and methods

productId = 10
productName = Aroma
quantityOnHand = 1500
price = 98

create a method named printProductDetails to print the above information

































==================================================

Access Specifiers

default
public
private
protected


















Constructor in java
===============

- special method which is called automatically when object is created.
- used to initialize the instance variables.
- same name as the class name
- does not have any return type not even void **
- can be overloaded 


package finance;

public class ThisKeywordDemo {

	int num=100;
	int sum;
	public void display() {
		int num=300;	//local variable
		int temp;
		if(this.num > 90)
			temp = 0;
		System.out.println(num);		//300
		System.out.println(this.num);	//100
		System.out.println(temp);   //temp	//
		System.out.println(sum);   //sum
	}
	
	public static void main(String[] args) {
		ThisKeywordDemo d = new ThisKeywordDemo();
		d.display();
	}
}




Hands On : 

Income tax slabs 2023-2024 for Women
0 to 190000               No tax
190001 to 500000   10%
500001 to 800000   20%
Above 800000          30%

Write if statements to achieve this.
Make sure that you indent the code well so that it is readable. 


Expected Output :

Welcome to tax calculator

Enter your salary : 1000000

Your salary slab is 30% 




























