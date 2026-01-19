package module19.CollectionFramework.Queue;

import java.util.PriorityQueue;
import java.util.Queue;

/*
 * Write a Java program that uses a PriorityQueue to schedule and execute tasks based on their priority (lower number = higher priority). You should:
Create a Task class with name and priority.
Store tasks in a PriorityQueue<Task> so that tasks with higher priority (i.e., lower priority value) are processed first.
Add at least 5 tasks with different priorities.
Print the tasks in the order they are executed.
In a priority queue, elements are ordered based on priority (not insertion order). 
By default Java’s PriorityQueue behaves like a min-heap, meaning the smallest element is at the head.
 */
public class scheduleTaskPQ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Task> scheduler = new PriorityQueue<Task>();
        scheduler.offer(new Task("Database Backup", 3));
        scheduler.offer(new Task("Email Notifications", 5));
        scheduler.offer(new Task("System Update", 1));
        scheduler.offer(new Task("Log Cleanup", 4));
        scheduler.offer(new Task("Security Scan", 2));
        
        System.out.println("Task Execution Order");
        while (!scheduler.isEmpty()) {
            Task task = scheduler.poll();
            System.out.println(task.name + " (Priority: " + task.priority + ")");
        }

	}

}
class Task implements Comparable<Task>{
	String name;
	int priority;
	
	Task(String name, int priority){
		this.name = name;
		this.priority = priority;
		
	}
	public int compareTo(Task other ) {
		return Integer.compare(this.priority,other.priority);
	}
}
