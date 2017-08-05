
import model.Person;
import service.PersonServiceImpl;

public class Main {
    public static void main(String[] args) {
        PersonServiceImpl personService = new PersonServiceImpl();

        System.out.println("---test Persons");
        System.out.println("---print---");
        System.out.println(personService.getAll());
        System.out.println("---delete---");
        personService.delete(1);
        System.out.println("---print---");
        System.out.println(personService.getAll());
        System.out.println("---add new---");
        personService.save(new Person(null, "Person5", false));
        System.out.println("---print---");
        System.out.println(personService.getAll());
    }



}
