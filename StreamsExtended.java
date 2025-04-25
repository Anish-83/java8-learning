package Week1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class StreamsExtended {

	public static void main(String[] args) {
		List<Task> list= new ArrayList<>();
		Task task1= new Task(1, "Wake Up Early", "Done",25);

		Task task2= new Task(2,"Meditate","Pending",10);

		Task task3= new Task(3,"Freshen Up","Done",15);

		Task task4= new Task(4,"Breakfast","Pending",20);

		Task task5= new Task(5,"Reading","Done",30);
		list.add(task5);
		list.add(task4);
		list.add(task3);
		list.add(task2);
		list.add(task1);
		// TODO Auto-generated method stub
		List<String> subList = list.stream().map(Task::getName).collect(Collectors.toList());
		System.out.println("1::"+subList);
	     

	     // Convert elements to strings and concatenate them, separated by commas
	     String joined = list.stream()
	                           .map(Task::getName)
	                           .collect(Collectors.joining(", "));
	     
	     System.out.println("2::"+joined);
	     
	     // Accumulate names into a TreeSet
	     Set<String> set = list.stream().map(Task::getName).collect(Collectors.toCollection(TreeSet::new));
	     System.out.println("3::"+set);
	     
	     // Compute total time for completing all tasks
	     int total = list.stream()
	                          .collect(Collectors.summingInt(Task::getTimeRequired));
	     System.out.println("4::"+total);
//		
//	     // Group task by status
	     Map<String, List<Task>> byStatus
	         = list.stream()
	                    .collect(Collectors.groupingBy(Task::getStatus));
	     System.out.println("5::"+byStatus);
	     //byStatus.forEach((k,v) -> System.out.println(v+" is "+k) );
	     
	     Map<String, Integer> hm = list.stream()
                    .collect(Collectors.toMap(Task::getName,Task::getTimeRequired));
	     
	     System.out.println("6::"+hm);
	     
//	     // Compute time for pending and done tasks 
	     Map<String, Integer> totalTimeByStatus
	         = list.stream()
	                    .collect(Collectors.groupingBy(Task::getStatus,
	                                                   Collectors.summingInt(Task::getTimeRequired)));
	     System.out.println("7::"+totalTimeByStatus);

	   //Partition tasks into “pending” vs. “non-pending”

	     Map<Boolean, List<Task>> partitionedTasks = list.stream()
	    		    .collect(Collectors.partitioningBy(t -> t.getStatus().equals("Pending")));
	    		
	     System.out.println("8::Pending: " + partitionedTasks.get(true).size());
	     
	    // Extract task names by status
	     
	     Map<String, List<String>> namesByStatus = list.stream()
	    		    .collect(Collectors.groupingBy(Task::getStatus,
	    		        Collectors.mapping(Task::getName, Collectors.toList())));
	    		
	     namesByStatus.forEach((status, names) -> 
	    		    System.out.println("9::"+status + ": " + names));
	     
	     
	     Map<Boolean, Integer> hm2= new HashMap<>();
	     
	     hm2=list.stream().collect(Collectors.partitioningBy(task -> task.getTimeRequired()>15,Collectors.summingInt(Task::getTimeRequired)));
	     		System.out.println("10::"+hm2);
	     
	}

}
