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











Python Casting
============

1) Dynamic in nature
2) We assign float and assign number , the type will be <int>
3) Implicit casting lower -->upper
4) Using arthimetic calculation , the result type would be always higher.
5) string can be converted to float if it contains the decimal values.

Hands on : Accept a single character (string only from user ) and print the ascii value of that.



Hands on : Create a array with 10 elements values, Randomly assign some positive and negative numbers.

Expected output : 

Sum of all the positive numbers are : 90

Total negatve numbers encountered : 7

marks = 10;


if marks >= 80:
    print("You passed the test")
elif marks >= 70:
    print("You need not appear for the re test")
else:
    print("You need at least appear for re test once")





<h2>Python Handson</h2>




1) Write a Python program to print all even numbers from a given list of numbers in the same order and stop printing any after 237 in the sequence.
Sample numbers list :

numbers = [    
    386, 462, 47, 418, 907, 344, 236, 375, 823, 566, 597, 978, 328, 615, 953, 345, 
    399, 162, 758, 219, 918, 237, 412, 566, 826, 248, 866, 950, 626, 949, 687, 217, 
    815, 67, 104, 58, 512, 24, 892, 894, 767, 553, 81, 379, 843, 831, 445, 742, 717, 
    958,743, 527
    ]

2) Write a Python program to print a matrix like below

Expected output : 

Enter the number of matrices you want :
6

1
2 2
3 3 3 
4 4 4 4
5 5 5 5 5
6 6 6 6 6 6



3) Write a Python program that accepts a sequence of comma-separated numbers from the user and generates a list and a tuple of those numbers.
Sample data : 3, 5, 7, 23
Output :
List : ['3', ' 5', ' 7', ' 23']
Tuple : ('3', ' 5', ' 7', ' 23')



https://www.enterprisedb.com/downloads/postgres-postgresql-downloads



if ( num >0)
	
	
class  A {
}





Functions
Modules
	built in
	custom

OOPS
	


Hands on : Find the years of experience of an employee
joiningDate = 2019 , 1 , 9

Hands on :

EncryptPassword
	password

	changePassword(newpassword


create cons 



---SQL

drop table employees;
drop table departments;


create table departments
(
	department_id int not null primary key,
	department_name varchar(30) not null,
	manager_id int not null, 
	location_id int not null
)
create table employees
(
	employeeId integer not null primary key,
	first_name char(30) null,
	last_name char(30) not null,
	EMAIL char(30) null unique,
	PHONE_NUMBER char(10),
	HIRE_DATE date,
	JOB_ID char(10),
	SALARY integer check (salary > 0),
	COMMISSION_PCT integer null,
	MANAGER_ID integer null,
	DEPARTMENT_ID integer,
	constraint fkdeptid foreign key(department_id) references departments(department_id)
)

create table demo 
(
productId integer,
ssnCode integer,
productName char(30) constraint pnamequnie unique,
price integer,
qoh integer check ( qoh > 0),
constraint pkpIdSsnCode primary key(productId,ssnCode),
constraint chkPrice check (price > 0)
)


drop table demo;
insert into demo values(1,3,null,9,9);














insert into employees values
(100,'Tufail','Ahmed','tufail@gmail.com','8867205331',CURRENT_DATE,'IT_PROG',29000,null,null,null);

insert into employees (employeeId,last_name) values (101,'Tarun') 

insert into employees values
(102,'Harish','Salve','harish@gmail.com','8867205332',CURRENT_DATE,'IT_PROG',39000,5,100,10);


insert into employees (employeeId,last_name) values (101,'Yamini') 

select * from employees ;

--Hands on -- create departments table with 5 departments 




insert into departments values
(10, 'administration', 200, 1700),
(20, 'marketing', 201, 1800),
(30, 'purchasing', 114, 1700),
(40, 'human resources', 203, 2400),
(50, 'shipping', 121, 1500);


select * from departments;

DEPARTMENT_ID	DEPARTMENT_NAME	MANAGER_ID	LOCATION_ID
10	Administration	200	1700
20	Marketing	201	1800
30	Purchasing	114	1700
40	Human Resources	203	2400
50	Shipping	121	1500


insert into employees values
(103,'Isha','Salve','isha@gmail.com','8867205331',CURRENT_DATE,'IT_PROG',49000,null,100,900);


--Hands on 

--create a table jobs as below

JOB_ID	JOB_TITLE		MIN_SALARY		MAX_SALARY
AD_PRES	President		20080			40000
AD_VP	Vice President	15000			30000
IT_PROG	Programmer		4000			10000

--JOB_ID should be primary key
--MIN_SALARY and MAX_SALARY should not be negative
-- JOB_TITLE should not be null ( please create this as table level)

SELECT constraint_name, table_name, column_name, ordinal_position 
FROM information_schema.key_column_usage WHERE table_name = 'employees';



create table jobs
(
	JOB_ID char(30) primary key,
	JOB_TITLE char(30),
	MIN_SALARY integer check(MIN_SALARY > 0),
	MAX_SALARY integer check(MAX_SALARY > 0),
	constraint fkjobId check(JOB_TITLE is not null)
)


insert into jobs(job_id, job_title, min_salary, max_salary)
values ('AD_PRES', 'President', 20080, 40000),
('AD_VP', 'Vice President', 15000, 30000),
('IT_PROG', 'Programmer', 4000, 10000);


select * from jobs;
select * from employees;
select * from departments d ;

----------alter table
select * from employees e 
select * from departments e 


insert into employees (employeeId,last_name) values (3450,'devansh') 


employees(employeeId) 	--> departments (managerId)

alter table departments  add constraint fkdeptempid foreign key(manager_id)
references employees(employeeId)


insert into departments values (60, 'administration', 3450, 1700);

select * from jobs;

alter table jobs drop incrementSalary

alter table jobs add incrementSalary integer

alter table jobs add constraint increntConstr check (incrementSalary > 10);

-------------DML

select * from employees;
select * from departments d ;

update employees set salary = salary + salary * .10
where employeeid =100;

update employees set salary = salary + salary * .10, department_id =10
where employeeid =100;

----- delete

delete from employees where last_name = 'prajwal';


truncate table employees

----------TCL 
----commit, rollback , savepoint

----Tufail - india

select * from employees;
select first_name,phone_number,salary from employees
where employeeid =100


insert into employees (employeeId,last_name) values (1202,'prashanth') 

commit;

create table a ( marks integer )

select * from a;

commit;


rollback;

select first_name,phone_number,salary from employees
where employeeid =100

update employees set salary = salary + salary * .10, department_id =10
where employeeid =100;

commit;



alter table demo alter productName type char(40)




select * from demo where false







SELECT constraint_name, table_name, column_name, ordinal_position 
FROM information_schema.key_column_usage WHERE table_name = 'employees';

select * from information_schema.columns where table_name = 'employees'



---aggregate functions 
sum,min,max,avg,count

select count(*) from employees e ;

select count(manager_id) from employees e ;
select count(salary) from employees e ;
select count(department_id) from employees e ;

select sum(salary) from employees e ;

------------group by

select * from employees

-- find out all the employees reporting to manager = 100

select * from employees e where manager_id = 100;

update employees set salary = 900,manager_id = 114,department_id =20 where employeeid  = 121

update employees set salary = 900 where employeeid  = 100


---- find out in department wise employee count

select department_id, count(employeeid) from employees e 
group by department_id 

--- find out manager wise employee count
select manager_id, count(employeeid) from employees e 
group by manager_id 
----find out department wise sum of salary
select department_id , sum(salary) from employees e 
group by department_id 


-----find out sum of salary department wise and manager _ id wise
select department_id , manager_id, sum(salary) from employees e 
group by department_id ,manager_id



-----order by

select * from employees e order by salary 
select * from employees e order by salary desc, last_name asc

select * from departments d 
-------------joins
----natural join
select last_name ,salary , department_name from employees e 
natural join departments d 

---- Inner join - showing matched data
----using ( if the two table has common column )

select last_name ,salary , department_name from employees e 
join departments d 
using (department_id)

select last_name ,salary , department_name from employees e 
join departments d 
using (manager_id)

----on

select last_name ,salary , department_name from employees e 
join departments d 
on d.department_id = e.department_id  

select last_name ,salary , department_name from employees e 
join departments d 
on d.manager_id  = e.manager_id

----aliases
select e.last_name ,e.salary , d.department_name, e.manager_id  from employees e 
join departments d 
on d.manager_id  = e.manager_id


--------outer join
--
select last_name ,salary , department_name from employees e 
join departments d 
on d.department_id  = e.department_id 	-- inner join (matched data)

select last_name ,salary , department_name from employees e  -- outer (unmatched side left)
left outer join departments d 
on d.department_id  = e.department_id 


select last_name ,salary , department_name from employees e  -- outer (unmatched side left)
right outer join departments d 
on d.department_id  = e.department_id 

select last_name ,salary , department_name from employees e  -- outer (unmatched side left)
full outer join departments d 
on d.department_id  = e.department_id 












===============================================================




Day 10

Mongo DB - ins
Dbeaver lite




JDBC
=======

Java 	- 		Postgres
Step 1: Load an appropriate driver 
Step 2 : Create the connection	java.sql package
	


===============Product Application=============



1. Add Product 
2. Update Product
3. Delete Product
5. Find Product by Id
6. Find Product By product name
7. Find all products

0. E X I T 


8. Find By Price range 	Enter lower price : 10 
			Enter higher price : 20



Design patterns=====DAO

interface 	- ProductDAO
	

class	- ProductDAOImpl


RS	-	executeQuery("select");
int	-	executeUpdate("DML");
boolean	-	execute("DDL");



Statement		- sql statement is complete
PreparedStatement		- placeholder , pre compiled



Assessment - week2

1. Create a Table named RakutenEmployees of all the fields and implement all the constraints and perform all the below tasks :

AssociateID
AssociateName
Gender
DOB
DOJ
Address
City
BasicSalary
HRA
PF

Solution : <create table code>

a) City Can only be Chennai, Banglore and Mysore (Apply constraints so that it should not accept any other city)

Solution : 

b) Insert five records ( Different types of data)

Solution : 

c) If the Salary is greater than 30000 then A grade, if it is between 25000 and 29999 then B grade otherwise C grade

Solution : 
d) Print the Sum of Salary According to City

Solution : 

e) Calculate the Total Salary of the Employee and Print
  AssociateID	AssociateName	BasicSalary	HRA	PF 	TotalSalary

Solution : 

f) Calculate the Age of the Associates
  AssociateID	AssociateName  Age


Solution : 

g) Calculate the sum of salary of all the employee considering the lowest at 20000.


Solution : 

h)  Calculate Current Age and at which age Employee has joined the organisation.

   AssociateID	 CurrentAge	AgeOnJoining

Solution : 



========================================================


How you can create collection in mongodb by importing json documents.


1) https://www.mongodb.com/try/download/database-tools

2) unzip 

3) open cmd in bin folder

4) mongoimport --db productdb --collection restaurants --file E:/NewTrainingMaterial/mongodb/Exercise/restaurants/restaurants.json


findAndDelete
findAndUpdate
findAndModify

----------MongoDB===========

db.product.find()

db.product.insertOne({"productId": 1011, "productName" : "Lakme", "quantityOnHand": 2200, "price" : 450})

db.product.insert(
{"productId": 1013, 
"productName" : "Pendrive",
"quantityOnHand": 1, 
"price" : 12})


db.product.insert(
{"productId" : 1014, 
"productName" : "Projector"
})


db.product.insert(
{"productId" : 1015, 
"productName" : "Bottle",
"reviews" : "Excellent"
})

db.product.insert({ 
"productId" : 1016 , "productName": "Trousers", "price" : 98000, "category" : "Luxury" })

db.createCollection("newproduct")

db.newproduct.find()

db.newproduct.insert({ 
"productId" : 1016 , "productName": "Trousers", "price" : 98000, "category" : "Luxury" })

db.oldproduct.insert({ 
"productId" : 1016 , "productName": "Trousers", "price" : 98000, "category" : "Luxury" })


db.oldproduct.find()

--------Hands on 

Create a collection named employees to store employeeId, employeeName , salary of employees
Store 3 employees data
1  Ahmed   98000
2  Neha    
3  Tarun   -- tarun has no salary but stipend of INR 1500 

db.createCollection("employees")
db.employees.insert( { "employeeId" : 1 , "employeeName" : "Ahmed", "salary" : 98000 })
db.employees.insert( { "employeeId" : 2 , "employeeName" : "Neha", })
db.employees.insert( { "employeeId" : 3 , "employeeName" : "Tarun", "stipend" : 1500 })


db.employees.find();


db.info.find();




---Hands on --
create a new collection named newemployees with employeeId, employeeName , 
salary (basic,hra,pf,insurance)

use : javascript way of creating the collection


db.info.find();
db.empinfo.find();

db.employees.find();


db.employees.drop();


db.customers.find();

db.customers.find({ 'customerName' : 'Lalit'})


db.customers.find({ 'customerName' : 'Lalit'} )

db.customers.find({$or : [{ 'customerName' : 'Lalit'} , { 'customerName' : 'Mohit'}] } )

db.customers.find({$and : [{ 'customerName' : 'Lalit'} , { 'bilAmount' : 1200 }] } )


db.customers.find()
db.customers.find({})
db.customers.find({ 'bilAmount' : {$gt:2000}})

db.customers.find({'address.city' : 'Mumbai' })

---Get all the customers

-- Get all the customers who are from Agra 

-- Get all the customers who have balancees more than 5000

-- Get all the customers who are from UttarPradesh but should not be from Agra

db.customers.find({ "address.state" : "UttarPradesh", "address.city" : {$ne : "Agra"}})


db.customers.find({ "address.state" : { $in : ["Uttar Pradesh", "UttarPradesh"] } }) 
db.customers.find({ "address.state" : { $nin : ["Uttar Pradesh", "UttarPradesh"] } }) 

db.customers.find({ "address.state" : { $in : ["Uttar Pradesh", "UttarPradesh"] } }) 


db.customers.find({ 
	"address.state" : { $in : ["Uttar Pradesh", "UttarPradesh"] },
	"address.city" : { $nin : ["Agra"] }
	}) 


db.customers.find({ 
	"address.city" : { $nin : ["Agra"] }
	}) 
	

db.customers.find().sort({ 'customerName' : 1}); 
db.customers.find().sort({bilAmount:1}); 
db.customers.find().sort({bilAmount:-1}); 


db.customers.find().sort({'address.city' : 1}).limit(2);

db.customers.find().limit(3);

---------------Aggregate functions

--- Get me sum of balance of customers who are from agra


--

db.newcustomers.find();


db.newcustomers.aggregate([
	{ 
		$project : { customerName : 0} 
	}
])


db.newcustomers.aggregate([
	{ 
		$project : { '_id' : 0 , 'customerName' : 1} 
	}
])


db.newcustomers.aggregate([
	{ 
		$project : { '_id' : 0 , 'customerName' : 0} 
	}
])


db.newcustomers.aggregate([
	{ 
		$project : { '_id' : 0 , 'customerName' : 0, 'gender': 0} 
	}
])



db.newcustomers.aggregate([
	{ 
		$project : { '_id' : 0 , 'gender': 1} 
	}
])


db.newcustomers.aggregate([
	{ $match : { gender : 'male' }},
	{ $project : { _id : 0, customerName: 1, gender : 1, balance : 1, "address:city": 1}}
])


db.newcustomers.aggregate([
	{ $match : { gender : 'male'  , 'address.city' : 'Mumbai'  }},
	{ $project : { _id : 0, customerName: 1, gender : 1, balance : 1, "address.city": 1}}
])


--- Get all the customers (customername, gender,emailid, balance) who are female 
and also balance > 2000

db.newcustomers.aggregate([
	{ $match : { gender : 'female' , balance : { $gt : 2000 } } },
	{ $project : { _id : 0, customerName : 1, gender : 1,  emailId : 1, balance : 1 }}
])


db.newcustomers.aggregate([
	{ $match : { gender : 'male' , balance : { $gt : 2000 } } },
	{ $project : { _id : 0, customerName : 1, gender : 1,  emailId : 1, balance : 1 }}
])

db.newcustomers.aggregate([
	{ $match : { gender : 'female' , balance : { $gt : 2000 } } },
	{ $project : { _id : 0, customerName : 1, gender : 1,  emailId : 1, balance : 1 , "address.city" : 1}}
])

db.newcustomers.aggregate([
	{ $match : { gender : 'female' , balance : { $gt : 2000 } , "address.city" : 'Agra' } },
	{ $project : { _id : 0, customerName : 1, gender : 1,  emailId : 1, balance : 1 , "address.city" : 1}}
])

--------
db.newcustomers.find();

-- Get all males who are between 25 and 30
-- Print only customername, age and city


db.newcustomers.aggregate([
	{ $match : {'gender' : 'male', age :{$gte:25, $lte:30}}},
	{ $project : {_id : 0  ,customerName : 1, age : 1,  "address.city" : 1}}

])


db.restaurants.find()


db.newcustomers.aggregate([
	{ $group : { _id : "$gender" , CountOfGender : { $sum : '$billAmount' }}}
])


db.newcustomers.aggregate([
	{ $group : { _id : "$gender" , CountOfGender : { $sum : 1 }}}
])


db.newcustomers.aggregate
([{$group : { _id : "$address.city" , "OurCustomResult" : { $sum : "$balance"} } }]);


db.newcustomers.aggregate
([
	{ $group : {_id : '$gender' , SumOfBillAmount : {$sum: "$billAmount" } }}
])


db.newcustomers.aggregate([
{ $match : { billAmount : 99 } },
{ $addFields : { gst : 120 } }
])


db.newcustomers.find()

db.neworders.find()


db.newcustomers.aggregate([
  { $match : { customerName : 'Mohit' } },
  { $project : { _id : 0, customerName : 1, billAmount : 1 } },
  { $lookup : {
      from : 'neworders',
      localField : 'customerName',
      foreignField : 'customerName',
      as : 'TotalOrderDetails'
  } }
])



 db.customers.update({customerName:"Tufail"}, {$set: {email : "tufail@gmail.com"}, upsert: true });

db.customers.find()

db.customers.update({"customerName": "Mohan" }, { $inc:{billAmount : 100}})

db.customers.update({customerName:"Mohan"},{$unset:{bilAmount:1}});

db.customers.updateMany({},{$unset:{billAmount:1}});

-----delete

db.customers.delete({'address.city':'Mumbai'})


db.customers.updateMany({customerName : "Jay"}, {$set : {customerName : "Jaya",email : "demo@gmail.com"}}, {upsert:true} );


db.products.find()

db.products.updateMany(
    {_id: 6 },
    { $set: {price: 999} }
)


=======================================


Linux


home / tufail
             tech
	java
	   javanotes.txt
	database
		mongo
		oracle
		>
		   create a file here with the sql.txt
		 
		  oracleppt.txt
	python
	   notespython.txt
	   sql.txt
	

rwx


ugo

chmod rwx-ugo record.txt

ls -l record.txt


4 read
2 write
1 execute

chmod 431

chmod 000 record.txt	

chmod 563 record.txt

-r-xrw--wx

-rw--w-r-x


chmod


===================Day 13


Spring , Spring Boot and Microservices

spring is open source framework
spring is used for big projects
Inversion Of Control and Depdendency Injection design pattern


Bean in spring - object managed by spring will be known as beans.


Spring - Difficult to configure

Spring Boot- spring without tears, zero configuration.


Use case : 
Employee 
	getDetails()
	{
		
	}


Employee employee;

empoyee.getDetails();






Sterotyopes annotation

Spring container





<!-- https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-data-jpa -->
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-data-jpa</artifactId>
    <version>2.6.7</version>
</dependency>

<!-- https://mvnrepository.com/artifact/org.postgresql/postgresql -->
<dependency>
    <groupId>org.postgresql</groupId>
    <artifactId>postgresql</artifactId>
    <version>42.3.5</version>
</dependency>


spring.datasource.driver-class-name=org.postgresql.Driver
spring.datasource.url=jdbc:postgresql://localhost:5432/postgres
spring.datasource.username=postgres
spring.datasource.password=root

spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect
spring.jpa.generate-ddl=true
spring.jpa.properties.hibernate.format_sql=true


Step 4: List some JPA annotation

@Entity
@Table
@Id
@Column











Annotation 

@ - Meta data - JDK 1.5



localhost:9090		- Good morning
localhost:9090/welcome
localhost:9090/welcome/rakuten
localhost:9090/product



localhost:9090/product/getAllProduct
localhost:9090/product/deleteProduct/191
localhost:9090/product/searchProduct/19/and/200

localhost:9090/product/deleteProductByName/Lakme/status/outofstock

Expected output : Lakme outofstock product is successfully deleted

localhost:9090/product/deleteProductByName/Aroma/status/oldproduct
Expected output : Aroma oldproduct product is successfully deleted

localhost:9090/product/saveProduct/


localhost:9090/product



localhost:9090/product	- GET ALL PRODUCTS
localhost:9090/product/191	- GET A SINGLE PRODUCT
localhost:9090/product/191	- DELETE A SINGLE PRODUCT	-- DELETE
localhost:9090/product	- SAVE				-- POST
localhost:9090/product		- UPDATE				-- PUT	
localhost:9090/product/search/Lakme 		- FETCH PRODUCT BY NAME	-- GET	
localhost:9090/product/search/200/500 		- FETCH PRODUCT BY PRICE RANGE	-- GET


HTTP METHODS 

GET		- fetching
POST		- insert/save
PUT		- update
DELETE		- delete




Spring Data JPA ( ORM)
====================


Use case : We want to save the product information in DB.


Step 1: Add spring data jpa , postgres driver  in your application 


Step 2:  update application.properties file 

spring.datasource.driver-class-name=org.postgresql.Driver
spring.datasource.url=jdbc:postgresql://localhost:5432/postgres
spring.datasource.username=
spring.datasource.password=

spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect
spring.jpa.generate-ddl=true
spring.jpa.properties.hibernate.format_sql=true

Step 3: 

Create an interface ProductDAO 
package com.training.pms.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.training.pms.model.Product;

@Repository
public interface ProductDAO extends CrudRepository<Product, Integer>{

}

Step 4 : We have to configure Product model class to map with newproducts table in db

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "newproducts")
public class Product {

	@Id
	private int productId = 10;


Step 5 : Open controller 

public class ProductController {
	
	@Autowired
	ProductDAO productDAO;

	@PostMapping	//localhost:9090/product
	public String saveProduct(@RequestBody Product product) {
		//code for saving product
		productDAO.save(product);
		return "Your product saved  : "+product.toString(); 
	}





@CrossOrigin(origins = "http://localhost:4200")











http://localhost:9090/product
























4200  - angular - localhost:4200

9090 - spring boot app



-----------Next week

Docker	 - Install Docker dektop	-https://www.docker.com/products/docker-desktop/
github.com	-




Microservices
=============

Load balancing
Zuul
Eureka Server
Eureka Client




package com.training.pms.services;

import java.util.List;

import com.training.pms.model.Product;

public interface ProductService {
	public boolean addProduct(Product product);
	public boolean updateProduct(int productId, Product product);
	public boolean deleteProduct(int productId);
	public Product findByProduct(int productId);
	public List<Product> findByProduct(String productName);
	public List<Product> findByProduct();
}


package com.training.pms.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.pms.dao.ProductDAO;
import com.training.pms.model.Product;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductDAO productDAO;

	@Override
	public boolean addProduct(Product product) {
		if (product.getPrice() < 0)
			return false;
		else {
			productDAO.save(product);
			return true;
		}
	}

	@Override
	public boolean updateProduct(int productId, Product product) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteProduct(int productId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Product findByProduct(int productId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> findByProduct(String productName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> findByProduct() {
		// TODO Auto-generated method stub
		return null;
	}

}



--------------------
What is micro services ?

@Autowired
	private RestTemplate restTemplate;


URI endPoint = URI.create("http://localhost:7090/hi");
			return restTemplate.getForEntity(endPoint, String.class);







product 	- 9090
orders	- 7070

http://localhost:7070/orders


Step 1: create orders app - web,devtools
Step 2: change application.properties to application.yml

server:
 port: 7070

Step 3: Create OrderController








Eureka Server : 8761


Hands On :

Create Reviews App Service to call product service and get all the product information .

localhost:6060/reviews
localhost:9090/product	-GETforEnt
6060
Register this on eureka server.



localhost:



Load Balancing
===========

Ribbon 1  Server : Eureka Server  : 8761	 - 1	
Client Ribbon - Eureka Client : productserver : 9090 - 2	localhost:9090//productBackend


localhost:8888/client/frontend/



Week3 Assessment
===============


Create a movie REST endpoint with the following URI's

http://localhost:9090/movies

With the above URI, we should be able to perform all the CRUD operation on movies

Movies 

	movieId
	movieName
	directorName
	budget

MoviesController

Test it via postman

http://localhost:9090/movies - should return all the movies
http://localhost:9090/movies/1911 - should return movie with movie id 1911
http://localhost:9090/movies/1911 -DELETE  should delete movie with movie id 1911
http://localhost:9090/movies - POST - should be able to save a movie
http://localhost:9090/movies - PUT - should be able to update a movie
http://localhost:9090/movies/findMovie/Ironman - GET - should be able to search and return a movie
http://localhost:9090/movies/findMovie/29000/988000 - GET - should be able to search and return a movie based on budget range


You already have this project with you, if not please create it Movie.java and MovieController.java

Requirements 
1) Make sure that the movies data should be persisted in postgres sql -> newmovies table
2) All the above URL's should be tested using postman. 
Expected output  for example  this uri "http://localhost:9090/movies/findMovie/29000/988000" should fetch all the movies range between 29000 and 988000 from the database.


You need to create MovieDAO to persist the data in the DB.






Day 16
=========

1) Please install  Docker

Please open command line and type docker and check.

2) Please send your week3 assessment to my email id : tufailahmedkhan@gmail.com



docker run nginx


open new command prompt


docker ps

docket images



docker run --name mywebsite -p 8080:80 nginx

Browser : localhost:8080


download postgres image as well



1) Stop nginx container
2) Check the running container
3) Check all the containers
4) Delete the container
5) Delete the nginx image
6) donwload postgres image
7) run the postgres image on port : 5433



step 1: create index.html

<font color=red><h1>Hello rakuten NGINX</h1></a>

navigate to where index.html is there .


docker run --name tufailwebsite -v %cd%:/usr/share/nginx/html:ro -d -p 8080:80 nginx









docker run --name ahmedpostgres1 -e POSTGRES_USER=tufail -e POSTGRES_PASSWORD=ahmed -p 5433:5432 -d postgres


Use case : we want to execute 2 postgres containers in port 7851 and 7852 
volume in postgres /var/lib/postgresql/data

docker run --name sanskar1 -v f:/var/lib/postgresql/data:/var/lib/postgresql/data -e POSTGRES_USER=sanskar -e POSTGRES_PASSWORD=sanskar -d -p 7851:5432 postgres



docker run --name sanskar2 -v f:/var/lib/postgresql/data:/var/lib/postgresql/data -e POSTGRES_USER=sanskar -e POSTGRES_PASSWORD=sanskar -d -p 7852:5432 postgres



docker run --name sanskar3 -v f:/var/lib/postgresql/data:/var/lib/postgresql/data -e POSTGRES_USER=sanskar -e POSTGRES_PASSWORD=sanskar -d -p 7853:5432 postgres





How you can dockerize your application :
===================================

Maven - dependencies	-pom.xml

Generate the jar file

Maven Lifecycle
Validate, 
Compile,
 Test,
 Package, 		- jar file / target folder
Integration test, 
Verify, 
Install
Deploy






Use case : To dockerize our spring boot app 







FROM openjdk:8
EXPOSE 8080
ADD target/demo-0.0.1-SNAPSHOT.jar demo.jar
ENTRYPOINT [ "java", "-jar" , "/demo.jar"]







Create Dockerfile in project root

Step 1: 
FROM openjdk:8
EXPOSE 8080
ADD target/revatureapp.jar demo.jar
ENTRYPOINT [ "java", "-jar" , "/demo.jar"]


Step2 :build the image
 docker build -t springboot-demo-1.0 .

Step3: Verify
docker images


Step 3: Run the image
 docker run -p 8080:8080 springboot-demo-1.0 

Browser : http://localhost:8080/demo/message












Docker
Docker Compose






Dockerfile


FROM openjdk:8
EXPOSE 8080
ADD target/mohammadapp.jar app.jar
ENTRYPOINT [ "java" , "-jar" , "/app.jar"]

docker build -t springboot-mohammad-demo-1.0 .

 docker run -p 8080:8080 springboot-mohammad-demo-1.0





Docker Compose
=================




spring.data.jpa.user=root
spring.data.jpa.password=root

yml

spring:
data:
		jpa:
			user:root
			password:root



























version: '2'

services:
  product-app:
    image: 'spring-boot-revature-product-app:latest'
    build:
      context: ./
    container_name: product-app
    ports:
      - 8080:8080
    depends_on:
      - db
    environment:
      - SPRING_DATASOURCE_URL=jdbc:postgresql://db:5432/compose-postgres
      - SPRING_DATASOURCE_USERNAME=compose-postgres
      - SPRING_DATASOURCE_PASSWORD=compose-postgres
      - SPRING_JPA_HIBERNATE_DDL_AUTO=update

  db:
    image: 'postgres:13.1-alpine'
    container_name: db
    environment:
      - POSTGRES_USER=compose-postgres
      - POSTGRES_PASSWORD=compose-postgres



















docker run nginx


docker images
docker container list

docker container stop <id>
docker ps
docker ps -a
docker rmi nginx --force



=========================



Hands On :

remove all the containers from your system

remove all the images from your system

verify images and containers list

start ngnix on port 6060 , give it a name as yeshasnginx

verify if it is running or not

stop the container with the name - yeshasnginx


Docker
===========
docker login
docker tag rakuten-hello-app 8867205331/rakuten-hello-app:v1

docker push 8867205331/rakuten-hello-app:v1

Delete all the images and containers using your local rakuten-hello-app image

--

To pull and run

docker run 8867205331/rakuten-hello-app:v1


docker images with parameters
=========================

	public static void main(String[] args) {
		System.out.println("### Rakuten Japan Welcomes you Mr./Ms.- "+System.getenv("name") +" - External ##");
	}

Dockerfile
FROM openjdk:8
COPY . /src/java
WORKDIR /src/java
ARG name="Prajwal"
ENV env_name $name
RUN ["javac","Welcome.java"]
ENTRYPOINT [ "java" , "Welcome" ]


build the images
=============
E:\Trainings\2024\1.Rakuten\rakuten\my-demo\src>docker build -t my-app .

run the images
============
E:\Trainings\2024\1.Rakuten\rakuten\my-demo\src>docker run -e name=Neha my-app




========================
Use case : Dockerizeing spring boot application

Step 1: Create a spring boot application with devtools and spring web

@SpringBootApplication
@RestController
public class RakutenAppSpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(RakutenAppSpringbootApplication.class, args);
	}

	@GetMapping("/rakuten")
	public String getMessage() {
		return "Today is tuesday 12th March 2024";
	}
}

application.properties 
server.port = 7070

Step 2 : open pom.xml file and update final name
</plugins>
		<finalName>demo</finalName>

	</build>

Save and close pom.xml

Step 3: Right click on your project --> Run as --> Maven install

Verify target/ demo.jar

Step 4: Create Dockerfile inside project root folder

FROM openjdk:17

ADD /target/demo.jar app.jar

ENTRYPOINT ["java" , "-jar" , "app.jar" ]

EXPOSE 7070


Step 5: Open cmd and navigate to project root folder
E:\Trainings\2024\1.Rakuten\rakuten\rakuten-app-springboot>docker build -t rakuten-springboot-app .

Step 6: Run 

E:\Trainings\2024\1.Rakuten\rakuten\rakuten-app-springboot>docker run -p 9070:7070 rakuten-springboot-app

Step 7 : open browser and type : http://localhost:9070/rakuten


===============================================
Hands on

Create a spring boot app to expose following endpoints :

/holiday	- Happy Holiday to All rakuten employees

7560


================


Create one images and run on port 7788 and 8877. use detached mode


Push this images in docker hub as well.





===========

Docker Compose

Step 1: comment application.properties

#spring.datasource.driver-class-name=org.postgresql.Driver
#spring.datasource.url=jdbc:postgresql://localhost:5432/postgres
#spring.datasource.username=postgres
#spring.datasource.password=root

Step 2: open pom.xml and add final name
		</plugins>
		<finalName>productapp</finalName>
	</build>

Step 3: Run as --> maven build --> goal --> install --> skip tests

Verify target folder for jar file

Step 4 :  Create Dockerfile 
FROM openjdk:17

ADD /target/productapp.jar app.jar

ENTRYPOINT ["java" , "-jar" , "app.jar" ]

EXPOSE 9090

Step 5: Create docker-compose.yml

version: '2'

services:
  product-app:
    image: 'spring-boot-rakuten-product-app:latest'
    build:
      context: ./
    container_name: product-app
    ports: 
      - 9090:9090
    depends_on:
      - db
    environment:
      - SPRING_DATASOURCE_URL=jdbc:postgresql://db:5432/compose-postgres
      - SPRING_DATASOURCE_USERNAME=compose-postgres
      - SPRING_DATASOURCE_PASSWORD=compose-postgres
      - SPRING_JPA_HIBERNATE_DDL_AUTO=update
          
  db:
    image: 'postgres:13.1-alpine'
    container_name: db
    environment:
      - POSTGRES_USER=compose-postgres
      - POSTGRES_PASSWORD=compose-postgres


Step 6 : Open cmd and navigate to your project root folder ( where is your docker compose file)

E:\Trainings\2024\1.Rakuten\rakuten\product-app-spring-2>docker-compose up

Verify in browser : http://localhost:9090/product


QA Testing
============



Junit - unit testing

expected = 

actual




Hands on : Create a method as below to check palindrome or not

package com.training.rakuten;

public class Palindrome {
	public boolean checkpalindrome(String word) {
		 String reverseStr = "";
		    
		    int strLength = word.length();

		    for (int i = (strLength - 1); i >=0; --i) {
		      reverseStr = reverseStr + word.charAt(i);
		    }

		    if (word.toLowerCase().equals(reverseStr.toLowerCase())) {
		     return true;
		    }
		    else {
		      return false;
		    }
	}
}

Create four test cases to check the following words :

malayalam
kota
mom
madam

I want all the test to pass and the order should be madam , mom, malayalam, amd kota


---Parametrized testing


<dependency> 
    <groupId>org.junit.jupiter</groupId> 
    <artifactId>junit-jupiter-params</artifactId> 
    <version>5.9.0</version> 
    <scope>test</scope> 
</dependency>


------------------Selenium




Step 1: open pom.xml

<!-- https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager -->
<dependency>
    <groupId>io.github.bonigarcia</groupId>
    <artifactId>webdrivermanager</artifactId>
    <version>5.7.0</version>
</dependency>


Step 2: 



//*[@id="user-name"]


Hands on : Create a selenium test to check google search functionality.




Hands On : 
package com.training.rakuten;

import java.util.Calendar;
/*
 * We have been asked to create Helpdesk to assist employees
 * But this should be operational only FROM Monday to Friday ( 9-5)
 * Write test case to check this
 */
public class HelpDesk {

	public final static int EOB_HOUR = 17;

	public boolean willHandleIssue() {
		Calendar cal = Calendar.getInstance();
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
		if (Calendar.SUNDAY == dayOfWeek || Calendar.SATURDAY == dayOfWeek) {
			return false;
		}
		if (Calendar.FRIDAY == dayOfWeek) {
			int hour = cal.get(Calendar.HOUR_OF_DAY);
			if (hour > EOB_HOUR) {
				return false;
			}
		}
		return true;
	}
}





=============
why Cucumber 

feature files


Gherkin language - like simple english language with some keywords


Feature
Scenario
When
Then
And
Given

Feature: feature to test google search functionality

  Scenario: Search feature is working
    Given user is on google home page
    When user enters oneplus 
    And clicks on search button
    Then user is navigated to the results page



Step 1: 	

		<!-- https://mvnrepository.com/artifact/io.cucumber/cucumber-java -->
		<dependency>
			<groupId>io.cucumber</groupId>
			<artifactId>cucumber-java</artifactId>
			<version>7.15.0</version>
		</dependency>
Step 2: Run your feature file 

you will get error

package com.training.rakuten;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {

	WebDriver driver;
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://www.saucedemo.com/");
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
		driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
	}

	@When("clicks on login button")
	public void clicks_on_login_button() {
		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();

	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {
		String expected = "https://www.saucedemo.com/inventory.html";
		String actual = driver.getCurrentUrl();
		assertEquals(expected, actual);
		driver.quit();

	}



}



Use case : We are trying to run all cucumber test from one TestRunner class.


Step 1 : Update pom.xml

		<dependency>
			<groupId>junit</groupId>
			<artifactId>junit</artifactId>
			<version>4.13.2</version>
			<scope>test</scope>
		</dependency>

		<dependency>
			<groupId>io.cucumber</groupId>
			<artifactId>cucumber-junit</artifactId>
			<version>7.15.0</version>
			<scope>test</scope>
		</dependency>

Step 2: Create a source folder src/test/resources

Right click on your project --> create new source folder --> src/test/resources

Step 3: Create a new normal folder Features inside src/test/resources folder

Step 4: Move all yoour feature files in src/test/resources/Features folder

Step 5 : Create a runner class  as you see in screen



====================

Jenkins
CI/CD


Jenkins	: https://get.jenkins.io/war-stable/2.440.1/jenkins.war		
Git	: https://git-scm.com/downloads		- install	
Maven	: https://dlcdn.apache.org/maven/maven-3/3.9.6/binaries/apache-maven-3.9.6-bin.zip - unzip

github.com	- create account and login


1) Create a spring boot project named "rakuten-devops-jenkins" devtools and web


package com.training.pms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class RakutenDevopsJenkinsApplication {

	public static void main(String[] args) {
		SpringApplication.run(RakutenDevopsJenkinsApplication.class, args);
	}

	@GetMapping
	public String getMessage() {
		return "Rakuten India welcomes you";
	}
}



2)
java -jar jenkins.war



tufail
root


Cucumber Hands on 

Scenario: Valid Palindrome     
Given I entered string "Refer"    
When I test it for Palindrome     
Then the result should be "true"  
 
Scenario: Invalid Palindrome     
Given I entered string "Coin"    
When I test it for Palin
drome     
Then the result should be "false"


https://github.com/tufailahm/rakuten-devops-jenkins
https://github.com/tufailahm/rakuten-devops-jenkins.git




===================

localhost:7070
localhost:7070/rakuten
localhost:7070/rakutennew


===================================================================


React JS
===========

HTML 
JS
CSS
JSX - Javascript embedded with XML




nodejs.org

visual studio code 



---
open cmd and type 
npm install -g create-react-app

navigate to your folder (where you want to create project )

E:\Trainings\2024\1.Rakuten\rakuten>create-react-app product-app-rakuten

npm start

===========

Hands on - Docker - Jenkins
==================

Create spring boot project named rakuten-spring-docker-jenkins project

Create a rest controller to handle /sayHello to print welcome message

Change the final name of the project as "rakuten-spring-docker-jenkins"

Change the port to 8656

Save the changes and push in the git repo named "rakuten-spring-docker-jenkins" repository

Create a jenkins job to automate the build process and push image in docker hub

Pull the image and run the image of port 6543 and verify the output

localhost:6543/sayHello - should display the output







import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
import App from './App';
import reportWebVitals from './reportWebVitals';

function Welcome(){
    return <h1>Welcome , ujjwal</h1>
}


const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
  <React.StrictMode>
    <App />
    <Welcome/>
  </React.StrictMode>
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();



Week 4 assessment

a) Start 3 containers from image that does not automatically exit, such as nginx, detached.
Command : 
Stop 2 of the containers leaving 1 up.
Command : 
We’ve left containers and a image that won’t be used anymore and are taking space, as docker ps -a and docker images will reveal. 
Clean the docker daemon from all images and containers.
Command : 

b) Create a Dockerfile to create image of our spring boot application which runs on port 9876

c) Command to build and push the image to docker hub



Day 21
=====


54.174.204.3	

Putty


54.209.41.130	ubuntu



==========================

204.236.220.75	- windows


Administrator
COSq(w;(3O$@9V5oVeBRNSY3r15grU&E

========================

52.91.244.106
Administrator
L;fHw@A?kkfRCSJ-ug*-9vVqwppGTZlc

=========================


S3 - Bucket


wget https://buckettufail.s3.ap-south-1.amazonaws.com/spring-boot-aws-demo.jar
sudo apt-get update
 sudo apt install openjdk-17-jre-headless
java -jar spring-boot-aws-demo.jar


http://54.209.41.130:8080/rakuten



Hands on
===========


Create one EC2 instance with ubuntu machine <yourname>rakuten and note the ip address
Connect to this machine using SSH
Create a bucket named <yourname>files
Upload some images.
Create a spring boot  application : port : 9876 with the following mappings
/hello
Hi and welcome to <yourname> spring app deployed on aws ububntu machine <yourname>rakuten
Deploy your spring boot app in aws and provide the link.


 java -Dserver.port=9876 -jar spring-boot-aws-demo.jar


========================

Use case : We have to host spring boot product app 

Requires a DB. postgres


postgres
username : postgres


================Deploying react app

Step 1: npm run build
Step 2: login in aws and create bucket -- make it public
Step 3: Upload all the files from build folder to your bucket
Step 4: Bucket --> Properties --> scroll down to the last --> Static website hosting  --> Enable it 

{
    "Version": "2012-10-17",
    "Id": "Policy1568691946888",
    "Statement": [
        {
            "Sid": "Stmt1568691936002",
            "Effect": "Allow",
            "Principal": "*",
            "Action": "s3:*",
            "Resource": "arn:aws:s3:::buckettufail/*"
        }
    ]
}

==============================================================


React JS
Java Networking
AWS




Create a react app to display a button and change its text 

Click Me

Clicked


================================================================

Lifecycle



Forms


Boostrap

<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">


Delete functionality

===============

Service

    deleteProduct(productId) {
        return axios.delete(`${PRODUCT_API_URL}/${productId}`);
    }


ProductComponent

    deleteProductClicked(productId) {
        ProductService.deleteProduct(productId)
            .then(
                response => {
                    this.setState({ message: `Delete of product ${productId} Successful` })
                    this.refreshProducts()
                }
            )
    }


....
....

 <td>{product.price}</td>
 <td><button className="btn btn-warning"
                                                onClick={() => this.deleteProductClicked(product.productId)}>
                                                Delete</button>
                                            </td>

......
 		 <div className="container">
              {this.state.message && <div className="alert alert-success">{this.state.message}</div>}
                   		 <h3>All Products</h3>



==================
Routing Steps


App.js

import logo from './logo.svg';
import './App.css';
import { Routes, Route } from 'react-router-dom';
import { BrowserRouter as Router } from 'react-router-dom';
import ProductComponent from './components/ProductComponent'
import  Customer  from './customer'
function App() {
  return (
    <Router>
    <>	
      <h1>Product Application</h1>
      <Routes>
        <Route path="/" element={<ProductComponent />}></Route>
        <Route path="/products" element={<ProductComponent />}/>
        <Route path="/customers" element={< Customer />}/>
        <Route path="/products/:productId" element={<ProductComponent />}/>

      </Routes>
    </>
  </Router>

  );
}

export default App;


index.js
import ReactDOM from 'react-dom';
import React from 'react'
import App from './App';
ReactDOM.render(<App></App>,document.getElementById("root"))




==============================================================





