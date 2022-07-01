/*
The reference variable refers to the object allocated in the heap memory area. Here, s1 and s2 both are reference 
variables that refer to the objects allocated in memory.
 */


class Student{
    String name;
    int age;

    public void getInfo(){
        System.out.println("The name of this student is " + this.name);
        System.out.println("The age of this student is " + this.age);
    }

}






public class p01_OOPS{
    public static void main(String[] args) {
        
        Student s1 = new Student(); // s1 is an reference of class Student
        s1.age = 24;
        s1.name = "Sanket";
        s1.getInfo();

        Student s2 = new Student(); // s2 is another reference of a class Student
        s2.name = "Aditya";
        s2.age = 20;
        s2.getInfo(); // method

    }
}
