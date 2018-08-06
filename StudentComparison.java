import java.util.*;;

public class StudentComparison {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<Student> students=new ArrayList<Student>();
		while(!sc.hasNext()){
			String s=sc.nextLine();
			String[] str=s.split(" ");
			int len=str.length-1;
			int[] marks=new int[len];
			for(int i=1;i<=len;i++)
			{
				marks[i]=Integer.parseInt(str[i]);
			}
			Student st=new Student(str[0], marks);
			students.add(st);
		}
	}
		public static String find_max( ArrayList<Student> S ) 
	 	{ 
	  		int[] a = new int[S.size()]; 
	  		for(int i=0;i<S.size();i++) 
	  		{ 
	  			for(int j=i+1;j<S.size();j++) 
	  			{ 
	  				a[i]=a[i]+S.get(i).compareTo(S.get(j)); 
	  			} 
	  		} 
	  		String max_1 = ""; 
	  		int k= 0; 
	 		for(int i=1;i<S.size();i++) 
	  		{ 
	  			if(k>a[i]) 
	  			{ 
	  				k=i; 
	  			} 
	  		} 
	 		max_1 = max_1+S.get(k).name; 
	  		return max_1; 
	  	} 
}
