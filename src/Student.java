public class Student {
    private String name;
    private String email;
    private Address address = new Address();
    private Course course = new Course();

    public String getName() {
        return this.name;
    } // getter

    public void setName(String name) {
        this.name = name;
    } // setter

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {

        if (this.email != null) {
            System.out.println("Não permite mudar email.");
            return;
        }

        this.email = email;
    }

    public Address getAddress() {
        return this.address;
    }

    public String getCourseName() {
        return this.course.getName();
    }

}
