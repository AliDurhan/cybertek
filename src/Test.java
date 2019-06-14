class Student {

    String name;

    int age;

 

    public void Student( ) {

        Student("James", 25);

    }

    public void Student(String  name,  int  age ) {

        this.name = name;

        this.age = age;

    }

}

 

public class Test {

    public static void main(String[ ]  args) {     

          Student s = new Student();

        System.out.println(s.name  +  ":"  +  s.age );      

    }

    }