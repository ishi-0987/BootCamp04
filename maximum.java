public String find_max(ArrayList<Student>() S )
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
		for(int i=0;i<S.size();i++)
			
		{
			if(a[i]==k)
		max_1 = max_1+S.get(i).name;
		}
		return max_1;
	}
