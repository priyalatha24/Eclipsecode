package javaFundamentals;

public class FindVaueofIndex {
	public void minMax(int arr[]) {
		for(int i=0;i<arr.length;i++)
			for(int j=0;j<arr.length-1;j++){
			
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					
				}
				
			}
			for(int i=0;i<arr.length;i++) {
				System.out.println("min value:");
				System.out.println(arr[0]);
				break;
				}
			for(int i=0;i<arr.length;i++) {
				System.out.println("max value:");
				System.out.println(arr[arr.length-1]);
				break;
				}
			
	}
public void findValue(int arr[],int n) {
	for(int i=0;i<arr.length;i++) {
		if(arr[i]==n)
			System.out.println(i);
	}
}
}