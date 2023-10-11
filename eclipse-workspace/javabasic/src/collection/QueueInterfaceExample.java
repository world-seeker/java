package collection;

import java.util.*;  
public class QueueInterfaceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
PriorityQueue<String> queue=new PriorityQueue<String>();  
queue.add("Amit");  
queue.add("Vijay");  
queue.add("Karan");  
queue.add("Jai");  
queue.add("Rahul"); 
queue.offer("Karan");
System.out.println("head:"+queue.element());  
System.out.println("head:"+queue.peek());  
System.out.println("iterating the queue elements:");  
for(String s:queue)
{
	System.out.println(s);
}
queue.remove();  
queue.poll();  
System.out.println("after removing two elements:");  
for(String s:queue)
{
	System.out.println(s);
}
}  
}