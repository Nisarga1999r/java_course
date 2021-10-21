Interview questions

1. Why is Java a platform independent language?
Java language was developed in such a way that it does not depend on any hardware or software due to the fact that the compiler compiles the code and then converts it to platform-independent byte code which can be run on multiple systems.

The only condition to run that byte code is for the machine to have a runtime environment (JRE) installed in it.
2. Why is Java not a pure object oriented language?
Java supports primitive data types - byte, boolean, char, short, int, float, long, and double and hence it is not a pure object-oriented language.

3. Pointers are used in C/ C++. Why does Java not make use of pointers?
Pointers are quite complicated and unsafe to use by beginner programmers. Java focuses on code simplicity, and the usage of pointers can make it challenging. Pointer utilization can also cause potential errors. Moreover, security is also compromised if pointers are used because the users can directly access memory with the help of pointers.

Thus, a certain level of abstraction is furnished by not including pointers in Java. Moreover, the usage of pointers can make the procedure of garbage collection quite slow and erroneous. Java makes use of references as these cannot be manipulated, unlike pointers.
. What do you understand by an instance variable and a local variable?
Instance variables are those variables that are accessible by all the methods in the class. They are declared outside the methods and inside the class. These variables describe the properties of an object and remain bound to it at any cost.

All the objects of the class will have their copy of the variables for utilization. If any modification is done on these variables, then only that instance will be impacted by it, and all other class instances continue to remain unaffected.
class Athlete {
public String athleteName;
public double athleteSpeed;
public int athleteAge;
}

Local variables are those variables present within a block, function, or constructor and can be accessed only inside them. The utilization of the variable is restricted to the block scope. Whenever a local variable is declared inside a method, the other class methods don’t have any knowledge about the local variable.

public void athlete() {
String athleteName;
double athleteSpeed;
int athleteAge;
}

1. What is method overloading?
Answer:
If two or more methods have same name, but different argument then it is called method overloading.
For example:
Array’s sort method have many overloaded versions. You can sort array of double, int, String etc.
...................................................................................................
2. What are rules of method overloading?
Rules of Method overloading:

Number of Arguments	Overloaded method can have different number of arguments
Date type	Overload method can have different data type for argument
Return type	Return type can be changed but either number of argument or data type of argument should also be changed.
Order of arguments	If you change sequence of arguments then it is also valid method overloading provided you have different data types arguments.
Constructor	Can be overloaded
....................................................................................................
3. Can we overload static methods in java?
Answer:
Yes, we can overload static methods in java but we can not override them.
....................................................................................................
4. Can you overload main method?
Answer:
Yes, you can overload main method in java but only method with signature public static void main(String[] args) will be used when your class is invoked by JVM.
.....................................................................................................
5. Can we change only return type while method overloading?
Answer:
You can not.If we change only return type, it will become ambiguous for compiler to figure out which method to call.That is why you can not change only return type.
.......................................................................................................
6. What is method overriding?
Answer:
If subclass is having same method as base class then it is known as method overriding Or in another words, If subclass provides specific implementation to any method which is present in its one of parents classes then it is known as method overriding.
.........................................................................................................
7. What are rules of method overriding?
Rules for method overriding:

Arguments	Must not change
Return type	Can’t change except for covariant (subtype) returns
Access Modifier	Must not be more restrictive. Can be less restrictive.
Exceptions	Can reduce or eliminate but must not throw new/broader checked exceptions
Contructor	Can not be overridden
Static method	Can not be overridden
final method	Can not be overridden
...........................................................................................................
8.  Can you override static methods in java?
Answer:
No, you can not override static methods in java. Static methods belongs to class level not at object level.You can create static method with same name in child class and it won’t give you compilation error but it is called method hiding. You won’t get overriding behaviour with it.
............................................................................................................
9. Can you override private methods in java?
Answer:
No, you can not override private methods in java. Private methods are not visible to child class, hence you can not override it , you can only hide it.
..............................................................................................................
10. Can you override final methods?
Answer:
Because final methods are meant to be not overridden.You declare a method final because you don’t want it to be overridden in subclass.



/
/
/
/
/
/
/
/
/
What is a package?
Ans: The package is a grouping mechanism in which related class files are grouped and made available to other applications and other parts of the same application. So, the package is a collection of related classes and interfaces. The package declaration should be the first statement in a Java class.
------------------------------------------------------------------------------------------------------
What is a Java package and how is it used?
Ans: A Java package is a naming context for classes and interfaces. A package is used to create a separate namespace for groups of classes and interfaces. Packages are also used to organize related classes and interfaces into a single API unit and to control accessibility to these classes and interfaces.
----------------------------------------------------------------------------------------------------------
What is the first keyword used in a Java application development?
Ans: The ‘Package’ is the first keyword used in a Java Application development.
-----------------------------------------------------------------------------------------------------------
Which package is imported, by default?
Ans: By default, the ‘Java.lang’ the package is imported, even without a package declaration.
------------------------------------------------------------------------------------------------------------
Can a class declare as private be accessed outside its package?
Ans: No. once declared as private, it is not possible to access the class outside its package.
-------------------------------------------------------------------------------------------------------------
What is the naming convention to be followed for declaring a user-defined package in Java application development?
Ans: The Reverse Domain naming convention is to be followed for declaring a user-defined package in Java Application development. For this the syntax is:
-----------------------------------------------------------------------------------------------------------------
com.companyname.projectname.module.submodule;
Example: com.apache.struts.tiles.login;
-----------------------------------------------------------------------------------------------------------
What are the types of packages in Java?
Ans: There are two types of packages in Java
-------------------------------------------------------------------------------------------------------------
Standard or Built-in packages and
User-defined packages.
What is a standard package in Java?
Ans: The standard package is the package that contains all libraries or pre-defined class files. There are two types of standard packages:
-------------------------------------------------------------------------------------------------------------
Core packages (which are starts with Java)
Extension packages (Which are starts with Javax)
Example: For Core packages For Extension packages
1. Java.lang Javax.sql
2. Java.util Javax.servlet
3. Java.awt Javax.servlet.http
4. Java.applet Javax.servlet.jsp
5. Java.io Javax.ejb
6. Java.net Javax.swing
Does importing a package make sub-packages class files available to the application?
Ans:  No. Importing a package does not make sub-packages class files available to the application.
Example:

import Java.awt;
class TestPackage
{
   Button b;
   ActionEvent ae;
   /*it is an error bcoz.. ActionEvent is available in 
    * Java.awt.event.So we have to import Java.awt.event.*; also*/
   public static void main(String args[])
   {
      System.out.println("Hello Packages");
   }
}