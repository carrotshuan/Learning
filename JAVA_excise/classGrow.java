public class classGrow{
	public int num;

	public classGrow grow(){
		num++;
		return this;
	}

	public static void main(String[] args){
		classGrow g = new classGrow();

		System.out.print(g.grow().grow().grow().num);
	}
}
