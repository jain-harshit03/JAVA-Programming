public class Person123 {
    private int id;
    private String name;
    private String address;

    Person123(int id ,String name, String address){
        this.id=id;
        this.name = name;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public void display(){
        System.out.println("ID of the Person is : "+getId());
        System.out.println("Name of the Person is : "+getName());
        System.out.println("The address of the Person "+getAddress());
    }
}
