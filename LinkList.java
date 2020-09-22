/*import java.util.LinkedList;
class Linklist{
	public static void main(String[] args) {
		LinkedList<String> animal = new LinkedList<>();

		animal.add(0,"dog");
		animal.add(1, "cat");

		LinkedList<String> reptile = new LinkedList<>();
		reptile.add("frog");

		//to add all elements in the list
		reptile.addAll(animal);

		//new linked list
		System.out.print("new linked list: " +reptile);
	}
}*/
import java.util.LinkedList;

class  LinkList{
    public static void main(String[] args) {
        LinkedList<String> animals= new LinkedList<>();

        // Add elements in the linked list
        animals.add("Cow");
        animals.add("Horse");
        animals.add("Pig");
        animals.add("Cat");
        System.out.println("LinkedList: " + animals);

        // First Occurrence of Dog
        int index1 = animals.indexOf("Dog");
        System.out.println("First Occurrence of Dog: " + index1);

        // Last Occurrence of Dog
        int index2 = animals.lastIndexOf("Dog");
        System.out.println("Last Occurrence of Dog: " + index2);
    }
}
