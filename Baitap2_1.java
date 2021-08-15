import java.util.Scanner;
public class Baitap2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] Num = {1,4,2,3,5,6,9,8,10,7};
		int Max=Num[0];
		for(int i=0; i<10;i++)
		{
			
			if (Max<Num[i])
			{
				Max=Num[i];
			}
		}
		System.out.println("So lon nhat la: " + Max);
	}
}
