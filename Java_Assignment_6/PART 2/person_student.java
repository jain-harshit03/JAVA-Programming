class person {
    String name;
    String address;


    person(String name,String address){
        this.name = name;
        this.address = address;
    }
    void display(){
        System.out.println("Inside Parent Class");
        System.out.println("Name of the person is : "+name);
        System.out.println("Address of the person is :"+address);
    }
}
class student extends person{
    long prn;
    double marks;

    student(String name, String address , long prn,double marks){
        super(name,address);
        this.prn = prn;
        this.marks = marks;
    }
    void display(){
        super.display();
        System.out.println("Inside Child Class");
        System.out.println("Person Name : "+super.name);
        System.out.println("Person address : "+super.address);
        System.out.println("Student prn : "+prn);
        System.out.println("Student marks :"+marks);

    }
}
public class person_student{
    public static void main(String[] args){
        student obj = new student("Harshit","Pune",2107126034,87.5);
        obj.display();
    }

}
