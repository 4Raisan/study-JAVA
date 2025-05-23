/* Structure:
1. class
2. veriables
3. voids/methods
4.     ...code...  */

//    Comments 
// Single-line comment  
/*  Multi-line comment  */ 

/* Rules of JAVA:
1. Only one public class per .java file, and the file name must match that public class name.

Naming 
● Class Naming - PascalCase 
● Veriable/Void- Naming - camelCase 

Terminate statements, (tells where the instruction is complete) 
● Semicolon ( ; ) 

Code block - Multi-Lines 
. . . . . . . . . { 
. . . . . . . . . . 
}

Global variables 
● public static int count = 0;

 public and private
 private - Only this class itself can see & use this 
         - just for class 
 public - Other classes also see & use this 
        - NEED object 

Main Method:
The entry point of a Java program.
Signature: public static void main(String[] args)

# Constructor use to identify instance veriables with this. 
# don't use void with the constructor :::
public Monster(int age, String name) {
        this.age = age;
        this.name = name;
    }


What are Getters and Setters?
Getter: A method that gets (returns) the value of a private variable.
Setter: A method that sets (updates) the value of a private variable.

*/



// use this.[instance variables]  - (same as python self.)
this.age = age;
this.name = name;
