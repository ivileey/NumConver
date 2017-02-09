class ArrayConvert1
{
	public static void trans(int num,int base,int offset)
	{
		if(num==0)
		{
			System.out.println("0");
			return;
		}
		char[] chs={'0','1','2','3','4','5','6','7'
			,'8','9','A','B','C','D','E','F'};
		char [] arr=new char[32];
		int i=arr.length;
		while(num!=0)
		{
			int temp=num & base;
			arr[--i]=chs[temp];
			num=num>>>offset;
		}
		for(int j=i;j<arr.length; j++)
			System.out.print(arr[j]);
		System.out.println();
	}
	public static void toBin(int num)
	{
		trans(num,1,1);
	}
	public static void toOctal(int num)
	{
		trans(num,7,3);
	}
	public static void toHex(int num)
	{
		trans(num,15,4);
	}
	public static void main(String[] args)
	{
		toBin(0);
		toOctal(0);
		toHex(0);
	}
}