package Bean;
import java.util.*;
public class question{
	public String[] questions=new String[10];
	public String[] answer=new String[10];
	public String[] A=new String[10];
	public String[] B=new String[10];
	public String[] C=new String[10];
	public String[] D=new String[10];
	public void setQ(String[] q,String[] a,String[] AA,String[] BB,String[] CC,String[] DD){
		questions=Arrays.copyOf(q,q.length);
		answer=Arrays.copyOf(a,a.length);
		A=Arrays.copyOf(AA,AA.length);
		B=Arrays.copyOf(BB,BB.length);
		C=Arrays.copyOf(CC,CC.length);
		D=Arrays.copyOf(DD,DD.length);
	}
	public String[] getq()
	{
		return questions;
	}
	public String[] geta()
	{
		return answer;
	}
	public String[] getA()
	{
		return A;
	}
	public String[] getB()
	{
		return B;
	}
	public String[] getC()
	{
		return C;
	}
	public String[] getD()
	{
		return D;
	}
}