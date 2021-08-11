# Compilation errors ✒️

_In this unit we learned about the most common compilation errors in java._

## Introduction 🚀

_Programming errors in Java, as well as in other languages, occur mostly in logical and syntax levels._ 

_Syntax errors are caused when compiling Java (javac) cannot recognize the statement. This causes the compiler to return an error message, usually with a reference line of code. Syntax errors are also known as compile-time errors._

_Logical errors are known as BUGS. These are the errors that will take us time to find beacuse they are related to decision coverage and flow control which doesn't comply with the established requirements , and that, using all the available tools: logs files, System.out messages, debuggers, etc.._

_The most common errors are listed below:._

## Typical errors

* **_1.- The name of the public class does not match the name of the file._**
   _Each .java file can contain only one public class. The name of that public class must exactly match the name of the file before the .java extension, even case-sensitive._

* **_2.- A class is not in the correct directory_**
    _This syntax error occurs if the javac command cannot find a .java file in the expected directory. If a class is in the default package (it does not have the package declaration in the first line), then this class belongs to the current working directory or the directory where the javac sourcepath flag points. If a class is to a package, then it belongs to a subdirectory below the current working directory or to a subdirectory below the directory where the javac flan sourcepath points.._

* **_3.- Uppercase and lowercase error._**
    _Java is a case sensitive language, that is, we must respect the upper and lower case. (myVar is not equal to myivar). If we refer to an identifier that is not well written then we will get a syntax error.._

* **_4.- Forgetting that indexes in Java start at cero._**
    _Java array indexes and lists start at 0, myArray [0], or myList.get (0). We hace to make sure the for loop doesn't cause errors for this reason. If we do more loops than are possible, then we will get the error: ArrayIndexOutBounds exception. If we do fewer loops than required, then we will have a logic error.._

* **_5.- NullPointerException._**
    _The NullPointerException, the curse of Java programmers._ 
    _NullPointerExceptions are logic errors caused when a program tries to access methods or attributes on a reference that is null. If our object has not been initialized or has been set to null with the = operator, then the method call or access to one of its attributes is invalid.._