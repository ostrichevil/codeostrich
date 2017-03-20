package SwapSort;

public class BubbleSort {

	static void bubble_sort(int[] arr)
	{
		int tmp;
		
		
		//冒泡次数
		for(int i=0;i<arr.length-1;i++)
		{
			
			//每次冒泡把最大的数置于右边
			for(int j=0;j<arr.length-1-i;j++)
			{
				if(arr[j]>arr[j+1])
				{
					tmp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=tmp;
				}
			}
		}
		
		System.out.print("冒泡排序后的结果为:");
		for(int a : arr)
		{
			System.out.print(a+"  ");	
			
		}
	}
	
	public static void main(String[] args) {
		int[] arr={10,15,17,20,40,3,55};
		bubble_sort(arr);
	}
}
