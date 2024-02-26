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




15 minutes




Getters and Setters
==============

Hands on 
=====================
Product 

	productId
	productName
	quantityOnHand
	price



	create default and for paramterzied constructor ( all possible constructor)
	create method to print product details
	create getter and setter for all the properties
	productId once set cannot be changed

	

	use contructor chaining to pre populate the missing information

	Create main method in separate class to store 3 product information in 3 objects and print.


================================

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





static :
package com.pms;
// static key
public class Product {
		static int gst=99;		//class variabe
		int price=100;		// instance variable
		
		public Product() {
			int price=200;		//local variable
			price++;
			System.out.println("Product default cons called : "+(price+gst));
		}
		public Product(int price) {
			this.price = price;
		}
		public void changeGstRate() {
			gst = 999;
		}
		public void orderProduct() {
			price = price + 10;
			System.out.println("Your total price is :"+ (price+gst));
		}
		public static void main(String[] args) {
			new Product(1200).orderProduct();
			Product p1 = new Product(500);
			p1.changeGstRate();
			p1.orderProduct();
			Product p2= new Product();
			p2.orderProduct();
			
			System.out.println(gst);
			
		}
}




this keyword

this is a keyword used only inside a constructor or instance method and is used to refer to the current object.
this is like a hidden reference that compiler provides to refer to current object.
From the programmer’s point of view this comes handy in two places
To distinguish between local and class variables when they are the same.


public class Student{
String name;
…
Student(String name){
this.name=name;
…
}}

===================================================================
Initializers

Initializers are blocks of code used to initialize member variables. 
Non-Static Initializers
	Used to initialize instance variables
	Invoked every time object is created
	Syntax 
	{ 
	<<statements>>
	}

	Static Initializers
	Used to initialize static variables 
	Invoked once when the class is loaded
	Syntax
	static { <<statements>>}








class W{
public W(){System.out.println("W constructor");}
}

public class Z{
W w= new W();
{
	System.out.println("instance block");	
}
static{
	System.out.println("static block");
	}
public Z(){System.out.println("Z constructor");
}
public static void main(String st[]){
System.out.println("In main");
new Z(); new Z();
}}




============================================

Method Overloading  and var args
=========================


same name but different paramters (signature )




DB ?


Day 3
========

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

Object class and its methods




Account extends Object
SavingsAccount extends Account


Parent class constructor will also get invoked when you create an object of child class.


super keyword 
==========

an object used to access parent class resources


Overriding
==========

Rules regarding overriding :
=======================

The method name should be common and the same as it is in the parent class.

The method signature (parameter list, return type) in the method must be the same as in the parent class.
Access specifier must be same or upper .

There must be an inheritance connection between classes.
If it declared the methods as static or final, then those methods cannot be overridden.


final keyword
============
class - cannot be extended
method - cannot be overridden
variable - constant and value has be supplied




Abstract class  and Interface
====================

Hands On :

Animal	 - abstract
abstract method - 		eat and roam
non abstract method -	sleep

Dog 	- concrete 
implement all the abstract methods


Men 	- concrete
implement all the abstract methods


Create two interfaces named Tea , Coffee with prepareTea and prepareCoffee methods respectively


implement the above two interfaces in Men class


String class in java
===============

- immutable means it cannot be changed
- it have lot of useful methods
- java.lang
- final class



StringBuffer
---------------
-- similar string but mutable
-- append method



Object class and its methods
=====================

super class of all the classes in java
java.lang
useful methods
	toString	- object class methods , we can ovverride to print the instance variable values.
	finalize
	equals
	hashcode
	

Wrapper classes 
==============
	java.lang
int	Integer
float	Float
long	Long
char	Character




String marks = "nine";
System.out.println(marks+5);	//985

int temp = Integer.parseInt(marks)

temp+5;		//103;


=============================================


Any model class will have 
	- private fields
	- default cons
	- parametrized cons
	- getters and setters
	- toString
	- equals and hashcode method









Lab Exercise No: 1

Exercise Objective(s): String class, String immutability  

Exercise: Write class that declares the following String.
		“The quick brown fox jumps over the lazy dog”.
Perform the following modifications to the above string using appropriate methods.

1.	Print the character at the 12th index. 
2.	Check whether the String contains the word “is”. 
3.	Add the string “and killed it” to the existing string. 
4.	Check whether the String ends with the word “dogs”. 
5.	Check whether the String is equal to “The quick brown Fox jumps over the lazy Dog”.
6.	Check whether the String is equal to “THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG”.                                
7.	Find the length of the String. 
8.	Check whether the String matches to “The quick brown Fox jumps over the lazy Dog”. 
9.	Replace the word “The” with the word “A”. 
10.	Split the above string into two such that two animal names do not come together. 
11.	Print the animal names alone separately from the above string. 
12.	Print the above string in completely lower case. 
13.	Print the above string in completely upper case.
14.	Find the index position of the character “a”. 
15.	Find the last index position of the character “e”. 

Recommended duration: 30 Mins

Solution Guidance (if applicable): NA


Solution Guidance (if applicable): Hint: Efficient use of memory is the focus here



Exceptional Handling in java
=====================



Runtime error	- Exception


Why exceptional handling is necessary ?

1) For printing appropriate error messages
2) We dont want to absuptly the program.
3) close the resources

try
catch
finally


Object
	Throwable
		Exception
			RuntimeException	(unchecked exception)
				Arithmetic
				Negative
				ArrayIndex
				NumberFormat

			FileNotFoundException (checked Exception)


throw keyword	- raise an exception



Checked Exception	- compile time
Unchecked Exception - runtime 



User Defined Exception
=================
Hands  on : 

Create a class named AgeValidator to check whether the person is eligible to vote or not.

Prompt the user to enter his/her age and check the eligibility.

Expected outcome :

Enter your age : 15

Error !!! You are not allowed to vote as you are under aged


---
Enter your age : 21

You are a valid voter. Thank You.

NB : Use exception to print "Error !!! You are not allowed to vote" message.

a) Create InvalidAgeException to raise the exception.


15 minutes

=================
Day 4

Array


int []marks = new int[10];

int []marks2;
marks2 = new int[10];

int grades [] = { 122,22,23,88};

index starts at 0


Collections framework
===============

use case : Suppose you have to store five names and sort and print in ascending order


5 lines of code


Benefits :

1) Reinvent the wheel
2) Lots of classes and interfaces to choose from
3) Less learning curve
4) Already tested
5) best algorithms


java.util


Collection <I>

List<I>(duplicates)				Set<I>(not duplicates)		Map<I> (K,V)


ArrayList<C> (iteration) - not thread safe	HashSet<C> - no order is guranteed		HashMap
LinkedList<C>(frequent add/remove)		LinkedHashSet - as it is			TreeMap
Vector<C> - thread safe			TreeSet	- sorted				LinkedHashMap




List names = new ArrayList();



Collections	- class


Use case : We have an array with five names . Can we use Collections.sort method to sort the names.


Hands On : WAP to accept five numbers from user and print the minimum number in that.

NB : use collections.min to find the minimum number

package com.bms.rakuten.client;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class DemoArrayToCollection {

	public DemoArrayToCollection() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		
		String names[]= {"Neha","Kalpana","Shubham","Tarun","Jay"};
		
		List<String> namesList = new ArrayList<String>();
		
		namesList = Arrays.asList(names);
		
		Collections.sort(namesList);
		
		System.out.println(namesList);
	
	}
}






Comparable -->

java.lang
compareTo()

strcmp



----------------------------------------------
Comparator
java.util package

compare(o1,o2);



==================================================

Inner classes
-----------------

class A
{
	private class B
	{
	}
}

Normal inner class
static inner classes
local inner class
anonymous inner classes


Use case : I want to sort by reviews 

Option 1 : use comparable
Option 2 : create separate class using comparator interface
Option3 : use anomymous inner classes to use comparator


<b>Handson-- Collection</b>

Use LinkedList to store list of Score objects (name, score) that will be entered by the user. 
Make sure they are arranged in the descending order of the scores. 
Display the linked list in the order of the rank of the student.

Expected output :

Enter how many students you want to store : 3

Enter 1 name : Tarun
Enter 1 score : 12

Enter 2 name : Anu
Enter 2 score : 38

Enter 3 name : Neha
Enter 3 score : 34


The list of the students (Ranked based on score)
Anu 38
Neha 34
Tarun 12


Threading
==========




extends Thread
implementing Runnable interface - run()



Thread methods


start
run
sleep
interrupt method
suspend
yeild
join
....
...

<h2>Handson - Threading</h2>

A prompt asking a question appears for which user is given 1 minute. 
If user answers the question before 1 minute then "Congratulations!" is displayed. Otherwise "Better Luck Next Time" is displayed.
Write a program to implement the above scenario.


(30 mins)


<form name=“f1”>
<input type="text" name="name" id=“n1“> 
</form>

Getting the value using elements array:
document.forms[0].elements["name"].value;
document.forms[0].elements[0].value;
document.forms[0].elements[“n1”].value;
Using form name and element name/id combination:
document.[forms[0]/f1].[login/n1].value









Assessment - Week 1 (Core Java)

Consider user has N eggs. Then display the no of eggs in gross (144 eggs make one gross) and no of eggs in dozen (12 eggs make one dozen) and the no of eggs that is left out remaining. The total no of eggs can be got as input through console. The program should display how many gross, how many dozen, and how many left over eggs the user has. 
For example, if the input is 1342 eggs, then the program should respond with 
	  Your number of eggs is 9 gross, 3 dozen, and 10 

Coding standard must be maintained.



-------------------

https://dbeaver.com/download/lite/



tufailahmedkhan@gmail.com

===============================


Hide - elements
show - on some event

=================================


myDiv1
	Button1



div	- innerDiv	- newDiv
span	- mySpan	-  UserName
[	]	username


<input type="text" id="username">


Hands : Add n number of textboxes dynamically :

UserName :	[	]
[	]
[	]
[	]

No Of products to be ordered  :  [	4 ]

Submit


=======================
Case 1: When cookie is not there

User Name 	:	[  	]

Login


Case 2: We wrote Tarun and clicked Login

User Name 	:	[  Tarun	]

Login
-----------

Close the browser and revist the page

User Name 	:	[  Maya	]

Login

--------Setting the cookie


Close the browser and revist the page

User Name 	:	[  Maya	]

Login


--------When loading of the page - get all the cookies , search for a specific cookie named username , 
-------if not found , textbox will be empty
-------if found , fetch the cookie value and prepopulate the text box






Oracle : https://www.oracle.com/in/database/technologies/oracle19c-windows-downloads.html











