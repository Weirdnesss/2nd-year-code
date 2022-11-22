import java.util.*;

public class LinkList {
    static Scanner inp = new Scanner(System.in);
    static LinkedList <String> list = new LinkedList<String>();
    public static void main(String[] args) {
        System.out.println("~~How many items in your list?: ~~");
        String size = inp.nextLine();

        for (int i = 0; i < Integer.parseInt(size); i++) {
            System.out.println("Enter item " + (i + 1) + ": ");
            String item = inp.nextLine();
            list.add(item);
        }
        showList(Integer.parseInt(size));
    }
    
    private static void showList(int size) {
        System.out.println("~~Your list is: ~~");

        for (int i = 0; i < size; i++) {
            System.out.println(i + ": " + list.get(i));
        }
        choose(size);
    }

    private static void choose(int size)
    {
        System.out.println("~~Choose what to do: ~~");
        System.out.println("1. Add item to list");
        System.out.println("2. Remove item from list");
        System.out.println("3. Show list");
        System.out.println("4. Exit");
        int choice = Integer.parseInt(inp.nextLine());
        switch (choice)
        {
            case 1:
                insert(size);
                break;

            case 2:
                delete(size);
                break;

            case 3:
                showList(size);
                break;

            case 4:
                System.out.println("Goodbye!");
                break;
            default:
                System.out.println("Invalid Input. Try again");
                choose(size);
                break;
        }
    }

    private static void insert(int size)
    {
        System.out.println("~~Enter where to place item: ~~");
        String ind = inp.nextLine();
        System.out.println("~~Enter item to add: ~~");
        String item = inp.nextLine();
        list.add(Integer.parseInt(ind),item);
        size++;
        showList(size);
    }
    private static void delete(int size)
    {
        System.out.println("~~Enter item to delete: ~~");
        String item = inp.nextLine();
        list.remove(Integer.parseInt(item));
        size--;
        showList(size);
    }
    }

