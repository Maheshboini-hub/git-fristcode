class bubblesort{
		

	//comparing each next positon element with present if it finds big
	//performing swapig placing last

	//method to print resulting array
	public static void printEle(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}

	
	public static void main(String[]args){
	int arr[]={7,9,1,5,2,8};
	//iterating the loop by (length-1) because the 
	//bigger value will goes to last positon that iteration we have to ignore
	for(int i=0;i<arr.length-1;i++)
	{
		for(int j=0;j<arr.length-i-1;j++)
		{
			if(arr[j]>arr[j+1])
			{
			  /// swap the numbers
			  arr[j+1]=arr[j+1]+arr[j]-(arr[j]=arr[j+1]);
			}
		} 
	}
		//Method calling
		printEle(arr);
	}
}

class selectionSort{

	//selecting frist element as small and comparing with all elements in array
	//if next element is finds as smaller then selected replacing two elements

	//method to print the resulting array

	public static void printResult(int ar[])
	{
		for(int i=0;i<ar.length;i++)
		{
			System.out.print(ar[i]+" ");
		}
	}

	public static void main(String[]args)
	{
		int a[]={9,4,1,6,2,7};
		for(int i=0;i<a.length;i++)
		{
			//taking Assuming frist position Element is smallest
			int smallest=i; 
			for(int j=i+1;j<a.length;j++)
			{
				//starting with next element compareing if next element is smaller or not
				// if finds smaller we are replacing with smallest
				if(a[smallest]>a[j])
				{
					smallest=j;
				}
			}
			//replacing smallest in the frist position
			//respective i(index) 
			int temp=a[smallest];
			a[smallest]=a[i];
			a[i]=temp;
		}
		//method calling 
		printResult(a);
		
	}
}
class insertionSort
{

	//selecting one element in array and comparing with adjacent elements
	//if it big moving to the before element of bigger(there changing that element to next element)
	//if it is higger than selected element that placing the key in frist positon;by performing operation wrt logic


	//method for print resultant array
	public static void printResult(int ar[])
	{
		for(int i=0;i<ar.length;i++)
		{
			System.out.print(ar[i]+" ");
		}
	}

	public static void main(String[]args)
	{
		int a[]={9,3,1,4,2,6};
		for(int i=1;i<a.length;i++)
		{
			int key=a[i];
			int j=i-1;
			while(j>=0&&a[j]>key)
			{
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=key;
		}
		printResult(a);
	}
}