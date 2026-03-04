package problem5;

import java.util.Vector;

public class DragonsMeal {
	private Vector<Person> people = new Vector<>();

    public void kidnap(Person p) {
        people.add(p); 
    }

    public boolean willDragonEatOrNot() {
        return people.isEmpty();
    }

    public static void main(String[] args) {

        DragonsMeal dl = new DragonsMeal();

        dl.kidnap(new Person(Gender.BOY));
        dl.kidnap(new Person(Gender.BOY));
        dl.kidnap(new Person(Gender.GIRL));
        dl.kidnap(new Person(Gender.GIRL));

        System.out.println(dl.willDragonEatOrNot()); 
    }
}

