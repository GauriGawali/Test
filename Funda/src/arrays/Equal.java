package arrays;

public class Equal {
	void equalCheck(int a1[],int a2[]) {
		int cnt=0;
		if(a1.length==a2.length) 
		{
			for(int i=0;i<a1.length;i++) {
				if(a1[i]==a2[i])
				{
					cnt++;
				}
				else
					System.out.println("Elements are different not equal");
			break;	
			}
			if(cnt==a1.length) {
				System.out.println("Arrays are equal");
			}
			}
	}

	public static void main(String[] args) {
		int a1[]= {1,2,3,4,5};
		int a2[]= {1,2,3,4,5};
		Equal e1=new Equal();
		e1.equalCheck(a1, a2);
	
	}

}
