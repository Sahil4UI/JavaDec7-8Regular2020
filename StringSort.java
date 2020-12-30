
public class StringSort {
	public static void main(String[] args) {
		
		String x="bbeeccddaaaaaaa";
		int arr[] = new int[26];
		
		for (char i: x.toCharArray())
		{
			arr[i-'a']++;
		}
		
		for (int i=0;i<26;i++)
		{
			for(int j=0;j<arr[i];j++)
			{
				System.out.print( (char)(i+'a'));
			}
		}
	}
}
