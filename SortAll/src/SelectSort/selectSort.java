package SelectSort;


/*
 * 简单选择排序
 * */
public class selectSort {
	
	static void select_sort(int[] arr)
	{
		int position=0;
		for(int i=0;i<arr.length;i++)
		{
			int tmp=arr[i];
			position = i; 
			
			//找出最小数
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]<tmp)
				{
					tmp=arr[j];
					position=j;
				}
			}
			
			//交换最小数和起始数的位置
			arr[position]=arr[i];
			arr[i]=tmp;
		}
		
		System.out.print("选择排序后的结果为：");
		for(int a : arr)
		{
			System.out.print(a+"  ");
		}
	}
	
	public static void main(String[] args) {
		int[] arr={10,20,18,17,16,5,2};
		select_sort(arr);
	}
	

}
