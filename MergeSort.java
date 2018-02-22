//归并排序的Java实现，用递归完成
public class Mergesort
{
	int[] aux;
	public static void sort(int[] arr)
	{
		int length = arr.length()
		aux = new int[length];
		sort(int[] arr,0,length -1)
	}
	public static void sort(int[] arr,int lo,int hi)
	{
		int mid = lo + (hi - lo)/2;
		sort(arr,lo,mid);
		sort(arr,mid + 1,hi);
		merge(arr,lo,mid,hi);
	}
	public static merge(int[] arr,int lo,int mid,int hi)
	{
		int i = lo;
		int j = mid + 1;
		for(int k = lo;k <= hi;k++)
		{
			aux[k] = arr[k];
		}
		for(int k = lo;k <= hi;k++)
		{
			if(i > mid)	arr[k] = aux[j++];
			else if(j > hi)	arr[k] = aux[i++];
			else if(aux[i] < aux[j]) arr[k] = aux[i++];
			else arr[k] = aux[j++];
		}
	}
}
