package Day5;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ClassTask {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Task> list= new ArrayList<>();
		Task task1= new Task(1, "Wake Up Early", "Done");
		
		Task task2= new Task(2,"Meditate","Pending");
		
		Task task3= new Task(3,"Freshen Up","Done");
		
		Task task4= new Task(4,"Breakfast","Pending");
		
		Task task5= new Task(5,"Reading","Done");
		list.add(task5);
		list.add(task4);
		list.add(task3);
		list.add(task2);
		list.add(task1);
		
		//Print pending tasks: 
		list.stream().filter(x-> x.getStatus()=="Pending").forEach(x->System.out.println(x.getName()));
		
		//Get task names as a list:
		List<String> taskNames=list.stream().map(x->x.getName()).collect(Collectors.toList());
		
		System.out.println(taskNames);
//		
		
//		Add a stream to count pending tasks: 
		
		long count= list.stream().filter(x-> x.getStatus()=="Pending").count();

		System.out.println("Count of pending tasks::"+count);
		
		//Experiment: Sort tasks by ID 

		list.stream().sorted ((a,b)->Integer.compare (a.getId(),b.getId())).forEach(x->System.out.println(x.getName())); 
	}

}
