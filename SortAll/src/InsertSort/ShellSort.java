package InsertSort;


/*
 * 希尔排序
 * 增量  n/2
 * */
public class ShellSort {
	
	
	public static void shell_Insert(int[] arr,int d,int arrlen)
	{
		for (int i = d;i < arrlen; i++)
		{
			int j=i-d;
			int tmp=arr[i];
			while(j >= 0 && arr[j]>tmp)
			{
				arr[j+d]=arr[j];
				j--;
			}
			if(j != i-d&&d!=1)
			{
				arr[i-d]=tmp;
			}
			else if(d==1){
				arr[j+1]=tmp;
			}
		}
		
		
	}
	
	static void shell_sort(int[]  arr,int arrlen)
	{
		int d=arrlen/2;
		while(d >= 1)
		{
			shell_Insert(arr, d, arrlen);
			d=d/2;
		}
		System.err.println(1/2);
		System.out.print("排序后结果为:");
		for(int a : arr)
		{
			System.out.print(a+"  ");
		}
	}
	public static void main(String[] args) {
		int arr[]={10,21,5,6,17,18};
		shell_sort(arr, arr.length);
	}
}
