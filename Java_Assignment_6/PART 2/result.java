public class result extends Student_person{
    public result(int id, String name, String address, String batch, String branch, double m1, double m2, double m3, double m4, double m5) {
        super(id, name, address, batch, branch, m1, m2, m3, m4, m5);
    }

    public void calculatePercentage()
    {
        double sum=getSubject1()+getSubject2()+getSubject3()+getSubject4()+getSubject5();
        double percentage =(sum*100)/500;
        System.out.println("Sum of the marks are : "+sum);
        System.out.println("Percentage of the marks are : "+percentage);
    }

    public void display()
    {
        super.display();
    }

    public static void main(String[] args){
        result obj = new result(1,"Harshit Jain","Pune","2021-25","AIML",90,90,90,90,90);
        obj.display();
        obj.calculatePercentage();
    }
}
