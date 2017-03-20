package InsertSort;


/*
 * 直接插入排序
 * 从第二个数开始插入前面的有序数中
 * */
public class insertSort {
	
	
	public static void insert_Sort(int[] arr)
	{
		//从数组第二个数开始排序
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i-1]>arr[i])
			{
				int tmp = arr[i];
				int j = i;
				//将大于tmp的数后移
				while(j > 0 && arr[j-1]>tmp)
				{
					arr[j]=arr[j-1];
					j--;
				}
				arr[j]=tmp;
			}
		}
		System.out.print("排序后的数组为:");
		for(int a:arr)
		{	
			System.out.print(a+"  ");
		}
	}
	
	public static void main(String[] args) {
		int arr[]={10,21,5,6,17,18};
		insert_Sort(arr);
	}
}
