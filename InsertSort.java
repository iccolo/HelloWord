//插入排序
//冒泡排序是插入排序的初级方式，这里的冒泡排序是优化的算法，可以减少对已排定元素的比较
public class BubbleSort
{
	public static void Sort(int[] arr)
	{
		int i = arr.length() - 1;
		while(i > 0)
		{
			int lastSwap = 0;
			for(int j = 0;j < i;j++)
			{
				if(arr[j] > arr[j+1])
				{
					Swap(arr[j],arr[j+1]);
					lastSwap = j;
				}
			}
			i = lastSwap;
		}
	}
}
//为了减少数组访问次数，将交换元素改成将较大的元素向右移动
public class Insertsort
{
	public static void sort(int[] arr)
	{
		int length = arr.length();
		for(int i = 1;i < length;i++)
		{
			int insertion = arr[i];
			for(int j = i - 1;j >= 0;j--)
			{
				if(insertion > arr[j])
				{
					arr[j+1] = insertion;
					break;
				}
				else  arr[j+1] = arr[j];
			}
		}
	}
}
