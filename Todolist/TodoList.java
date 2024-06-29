import java.util.*;
import java.io.*;

class TodoList {
    private ArrayList<String> tasks = new ArrayList<>();

    public void addItem(String task) {
    	tasks.add(task);
    	System.out.println("");
    }

    public void removeItem(int index) {
    	if(index >= 0 && index < tasks.size()) {
            tasks.remove(index);
            System.out.println("");
        }
    	else {
            System.out.println("無効なインデックスです");
	}
    }

    public void displayItems() {
      System.out.println("");
      System.out.println("-----------");
	System.out.println("TodoList");
	for(int i = 0; i < tasks.size(); i++) {
	    System.out.println("task " + (i+1) + ". " + tasks.get(i));
	}
	System.out.println("-----------");
	System.out.println("");
    }

    public static void main(String[] args) {
        TodoList todolist = new TodoList();
	Scanner sc = new Scanner(System.in);

	while(true) {
	    System.out.println("操作を選んでください");
	    System.out.print("1. タスク追加  ");
	    System.out.print("2. タスク削除  ");
	    System.out.print("3. タスク表示  ");
	    System.out.print("4. 終了  ");

	    int choice = sc.nextInt();
	    sc.nextLine();

	    switch(choice) {
	        case 1:
		    System.out.print("新しいタスクを入力: ");
		    String task = sc.nextLine();
		    todolist.addItem(task);
		    break;
		case 2:
		    System.out.print("削除するタスクの番号を入力: ");
		    int index = sc.nextInt();
		    sc.nextLine();
		    todolist.removeItem(index - 1);
		    break;
		case 3:
		    todolist.displayItems();
		    break;
		case 4:
		    System.out.println("アプリを終了します");
		    System.out.println("");
		    sc.close();
		    System.exit(0);
		    break;
	        default:
		    System.out.println("無効な選択です。もう一度試してください");
            }
	}
    }
}
