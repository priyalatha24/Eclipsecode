package Problem;

import java.util.*;

public class InsertionSort {
	public static void main(String[] args) {
	Scanner s= new Scanner(System.in);
	int n= s.nextInt();
	int a[]=new int[n];
	for(int i11=0;i11<n;n++) {
		a[i11]=s.nextInt();
	}
	for(int i1=0;i1<n;n++) {
		int key=a[i1];
		int j=i1-1;
		while(j>=0&&a[j]>key) {
			a[j+1]=a[j];
			j--;
		}
		a[j+1]=key;
	}
	for(int i:a)
		System.out.print(i+ " ");
}
	}


