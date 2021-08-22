//Anonymous object
class factorial{
	void fact(int n){
		int fact=1;
		for(int i=1;i<=n;i++){
			fact=fact*i;
		}
		System.out.print("Factorial is "+fact);
	}
	public static void main(String args[]){
		new factorial().fact(7);    //calling method using anonymous object
	}
}