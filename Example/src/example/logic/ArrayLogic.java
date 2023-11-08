package example.logic;

public class ArrayLogic {
	
	
	public int minArray(int[] a) {
		int min = 0;
		for (int i = 0; i< a.length; i++) {
			if(i == 0) {
				min= a[i];
			}
			if (a[i] < min) {
				min = a[i];
			}
		}
		return min;
	}
	
	public int maxArray(int[] a) {
		int max = 0;
		for (int i = 0; i< a.length; i++) {
			if(i == 0) {
				max= a[i];
			}
			if (a[i] > max) {
				max = a[i];
			}
		}
		return max;
	}
	
	public int findArray(int[] a, int n) {
		int index = -1;
		for(int i=0;i<a.length;i++) {
			if(a[i]==n) {
				index=i;
				
			}else {
				System.out.println("element not found");
				break;
			}
		}

		return index;
	}
	public void arrayPrimenumber(int []arr) {
		
		int n= arr.length;
		int count =0;
		
		for(int i=0;i<n;i++) {
			for(int j=1;j<=arr[i];j++)
			{
				if(arr[i]%j == 0)
					count++;
			}
			if(count == 2)
			System.out.print(arr[i]+" ");
			count =0;
		}
		}

}
