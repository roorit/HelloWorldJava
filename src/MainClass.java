//import java.util.ArrayList;
//import java.util.List;
import java.util.*;

import Entities.Student;
/**
 * @author User
 *
 */
public class MainClass {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Hello World!");
		
		List<String> ls = new ArrayList<String>();
		ls.add("sdfsdf");
		
		List<Integer> l =new ArrayList<Integer>();
		l.add(1);
		for (Integer integer : l) {
			System.out.println(integer);
		}
		
		Student s = new Student();
		//s.setName("avi");
		Student s2 = new Student();
		if(s.equals(s2))
		{
			System.out.println("Equals");
		}
		s.calculateMark();
		
	}

}
