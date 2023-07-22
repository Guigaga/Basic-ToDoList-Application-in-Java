package Todolist;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class ToDoList {
	private List<String> tasks;
	
	public ToDoList() {
		tasks = new ArrayList<>();
	}
	
	public void addTask(String task) { 
		tasks.add(task);
		System.out.println();
		System.out.println("The task \"" + task + "\" has been added");
	}
	public void removeTask(int index) {
		if(index >= 0 && index < 5) {
			String removedTask = tasks.remove(index);
			System.out.println();
			System.out.println("The Task \""+ removedTask +"\" has been removed");
		}else {
			System.out.println("Invalid index");
		}
	}
	public void seeTasks() {
		if(tasks.isEmpty()) {
			System.out.println("There are no tasks in the list.");
		}else{
			for(int i = 0; i < tasks.size(); i++) {
				System.out.println(i + " - " + tasks.get(i));
				
			}
		}
	}
	
	public static void main(String[] args) {

		ToDoList ToDoList = new ToDoList();
		Scanner input = new Scanner(System.in);
		boolean exit = false;
		while(!exit) {
			System.out.println("====== MENU ======");
			System.out.println("1 - Add new task");
			System.out.println("2 - Remove task");
			System.out.println("3 - See pending tasks");
			System.out.println("4 - Exit ToDoLists");
			
			int opion = input.nextInt();
			
			switch(opion) {
			case 1:
				System.out.println();
				System.out.println("What is the task to be added?");
				String task = input.next();
				ToDoList.addTask(task);
				
			break;
			case 2:
				System.out.println();
				System.out.println("Enter the index of the task to be removed:");
				int index = input.nextInt();
				ToDoList.removeTask(index);
				break;
			case 3:
				ToDoList.seeTasks();
				break;
			case 4:
				System.out.println();
				System.out.println("Do you really want to leave ToDoList?");
				System.out.println("1 - Yes");
				System.out.println("2 - No");
				int choice = input.nextInt();
				if(choice == 1 ){
					exit = true;
				}
				else if(choice == 2){
					exit = false;
				}else {
					System.out.println("Invalid choice");
				}
				
				break;
			default:
				System.out.println();
                System.out.println("Opção inválida");
			}	
			System.out.println();
		}
		System.out.println("ToDoList closed...");
		input.close();
	}
	
}
