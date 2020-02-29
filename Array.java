public class Array{
	public static void main(String[] args) {
		int [][]arr= {{1,2,3},{3,4,6}};
		for(int i=0;i<arr.length;i++)
		{
				for(int j=0;j<arr.length;j++)
				{
		System.out.println("element at index"+i+j+":"+arr[i][j]);
	}
	}
}
}