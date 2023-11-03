
public class FrequencyElement {

	public static void main(String[] args) {
		int arr[]= {1, 2 ,8, 3,2,2,2,5,1};
		int frq[] = new int [arr.length];
		int visited = -1;
		
		for(int i = 0;i<arr.length;i++) {
			int count=1;
			for(int j =i+1;j<arr.length;j++) { // array 
				if(arr[i]==arr[j]) {
					count++;
					frq[j]=visited;	
				}
				if(frq[i]!= visited)
				{
					frq[i]=count;
					
				}
			}
		}
		System.out.println("Elements   |  frequency");
		for(int i=0;i<frq.length;i++) {  // frequency 
			
			if(frq[i]!=visited) {
				
				System.out.println(arr[i]+"          |        "+frq[i]);
			}
		}
	}

}
