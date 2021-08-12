public class remedo_answer2
{
	public static void main(String ags[])
	{
		int x,tem,i,j;
		
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("Enter number of elements:");
		x=sc.nextInt();
		
		int arr[]=new int[x];
		System.out.println("Enter the elements:");

		for( i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(i=0;i<arr.length;i++)
		{
			for(j=i+1;j<x;j++)
			{
				if(arr[i]>arr[j])
				{
					tem=arr[i];
					arr[i]=arr[j];
					arr[j]=tem;
				}
			}
		}
		System.out.println("Sorting Array in Ascending Order");
		for (i= 0; i<x; i++)   
		{  
			System.out.println(arr[i]);  
		}  
		
	}
}
