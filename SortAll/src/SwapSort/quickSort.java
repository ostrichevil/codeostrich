package SwapSort;

import java.util.List;

public class quickSort {

	static void quick_sort(int[] arr,int low,int high)
	{
		if(low<high)
		{
			int middle=get_Middle(arr, low,high);
			quick_sort(arr, 0, middle-1);
			quick_sort(arr, middle+1, high);
		}	
		
		
	}
	
	static int get_Middle(int[] arr,int low,int high)
	{
		int tmp=arr[low];
		while(low<high)
		{
			while(low<high&&arr[high]>=tmp)
			{
				high--;
			}
			arr[low]=arr[high];
			while(low<high&&arr[low]<=tmp)
			{
				low++;
			}
			arr[high]=arr[low];
			
			
		}
		arr[low]=tmp;
		return low;
	}
	
	public static void main(String[] args) {
		int[] arr={40,30,26,44,44,58,18,32};
		quick_sort(arr,0,arr.length-1);
		System.out.print("快速排序后的结果为：");
		for(int a : arr)
		{
			System.out.print(a+"  ");
		}
	}
	
}
