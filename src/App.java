public class App {
    public static void main(String[] args) {

        Student student = new Student();

        student.setName("Ricardo");
        student.setEmail("ricardomartins@gmail.com");

        student.getAddress().setStreet("Djalma Dutra");
        student.getAddress().setNumber(361);
        student.getAddress().setDistrict("Telégrafo");
        student.getAddress().setCity("Belém");

        System.out.println(student.getAddress().getDistrict());
        System.out.println(student.getEmail());
    }
}
