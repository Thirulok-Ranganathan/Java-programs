//Example of Method Overloading by changing the no. of arguments

class calculation{
	void sum(int a,int b){System.out.println(a+b);}
	void sum(int a,int b,int c){System.out.print(a+b+c);}
	public static void main(String args[]){
		calculation add=new calculation();
		add.sum(20,40);
		add.sum(10,20,30);
	}
}