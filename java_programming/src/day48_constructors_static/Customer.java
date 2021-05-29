package day48_constructors_static;

public class Customer {
    private String name;
    private int id;


    public Customer(){
        System.out.println("dasdsad");
        name="new customer";
        id=1;
    }
    public Customer(String n1, int id1){
        this.name=n1;
        this.id=id1;
    }




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
