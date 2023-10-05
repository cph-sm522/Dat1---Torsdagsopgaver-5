package TaskOne;
public class Customer {
    private String firstName;
    private String lastName;
    private String username;
    int id;

    public Customer(String firstName, String lastName, String username, int id){
            this.firstName=firstName;
            this.lastName=lastName;
            this.username=username;
            this.id=id;
    }

    public String toString(){
        return firstName+" "+lastName+":\t\t"+username+":\t"+id;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public String getUsername(){
        return username;
    }

    public int getId(){
        return id;
    }
}
