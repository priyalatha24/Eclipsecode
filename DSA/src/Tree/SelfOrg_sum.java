package Tree;

import java.util.Scanner;

public class SelfOrg_sum {
	private int[]list;
	private int[] count;
	private int size;
	
	  public void Self_Organising_List(int listSize)
	    {
	        list = new int[listSize];
	        count = new int[listSize];
	        size = 0;
	    }
	  public boolean isEmpty() {
		  return size == 0;
	  }
	  public boolean isFull() {
		  return size == list.length; 
	  }
	  public int getSize() {
		  return size;
	  }
	  public void insert(int val) {
		  if(isFull()) {
			  System.out.println("Error: List is Full");
			  return;
		  }
		  list[size]=val;
		  count[size]=0;
		  size++;
	  }
	  
	  public void remove(int pos)
	    {
	        pos--;
	        if (pos<0 || pos>=size) {
	            System.out.println("Invalid position ");
	            return;
	        }
	        for (int i=pos;i<size-1;i++) {
	            list[i]=list[i+1];
	            count[i]=count[i+1];
	        }
	        size--;
	    }
	  public boolean search(int x) //7 3 12 5  9  -> x=12
	    {
	        boolean searchResult = false;
	        int pos=-1;
	        for (int i=0;i<size;i++) {
	            if (list[i] == x) { //list[2]==x
	                searchResult=true;
	                pos=i;//pos = 2
	                break;
	            }
	        }
	        if (searchResult) { //if(true)
	            count[pos]++;//count[2]++
	            int c = count[pos]; //c=count[2]
	            for (int i=0;i<pos;i++) {
	                if (count[pos]>count[i]) { //count[2]>count[0]
	                    for (int j=pos;j>i;j--) { //j=2
	                        list[j]=list[j-1];//list[2]=list[1]
	                        count[j]=count[j-1];
	                    }
	                    list[i] = x;
	                    count[i] = c;
	                    break;
	                }
	            }
	        }
	        return searchResult;
	    }
	  public void printList()
	    {
	        System.out.print("\nList = ");
	        for (int i=0;i<size;i++)
	            System.out.print(list[i] + " ");
	        System.out.print("\nCount = ");
	        for (int i=0;i<size;i++)
	            System.out.print(count[i] + " ");
	    }
	  public class Self_Organising_List{
	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		System.out.println("Self Organinsing list\n");
		System.out.println("Enter size of list");
		int size =s.nextInt();
		SelfOrg_sum so = new SelfOrg_sum();
		char ch;
		do {
			System.out.println("Self organizing list operation:\n");
			System.out.println("1.insert");
			System.out.println("2.delete at position ");
			System.out.println("3.search");
			System.out.println("4.check empty");
			System.out.println("5.check full");
			System.out.println("6.get size");
			int choice = s.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter integer element to insert");
				so.insert(s.nextInt());
				break;
				
			case 2:
				System.out.println("Enter position to delete");
				so.remove(s.nextInt());
				break;
			case 3 :
				System.out.println("Enter integer element to search");
				System.out.println("Search Result: "+so.search(s.nextInt()));
				break;
				
			case 4:
				System.out.println("Empty status = "+so.isEmpty());
				break;
				
			case 5:
				System.out.println("full status = "+so.isEmpty());
				break;
			case 6:
				System.out.println("size status = "+so.isEmpty());
				break;
				default:
					System.out.println("wrong entry\n");
					
			}
			so.printList();
			System.out.println("\nDo you want to continue(Type y or  n)\n");
			ch=s.next().charAt(0);
			}while(ch == 'Y' || ch == 'Y');
			
		}

	}

}
