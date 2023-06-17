package Assignment11.prob1;
import java.util.*;
public class Admin {
	public static HashMap<Key, Student> processStudents(List<Student> students) {

		HashMap<Key,Student> hp = new HashMap<>();
		for(Student s: students){
			hp.put(new Key(s.getFirstName(),s.getLastName()),s);
		}

		return hp;


	}
	public static double computeAverageGPA(HashMap<Key,Student> maps){

       double totalGpa = 0.0;
	   double averageGpa = 0.0;

		Set<Key> keys = maps.keySet();
		for(Key k: keys){
			totalGpa += maps.get(k).getGpa();
			averageGpa = totalGpa / maps.size();
		}
		return averageGpa;
}
}
