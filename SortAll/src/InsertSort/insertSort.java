package InsertSort;


/*
 * ֱ�Ӳ�������
 * �ӵڶ�������ʼ����ǰ�����������
 * */
public class insertSort {
	
	
	public static void insert_Sort(int[] arr)
	{
		//������ڶ�������ʼ����
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i-1]>arr[i])
			{
				int tmp = arr[i];
				int j = i;
				//������tmp��������
				while(j > 0 && arr[j-1]>tmp)
				{
					arr[j]=arr[j-1];
					j--;
				}
				arr[j]=tmp;
			}
		}
		System.out.print("����������Ϊ:");
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
