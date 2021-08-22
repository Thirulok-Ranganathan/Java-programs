//To find area of rectangle
class rectangle{
	int length;
	int width;
	void insert(int l,int w){
		length=l;
		width=w;
	}
	void calculateArea(){System.out.println(length*width);}
	public static void main(String args[]){
		rectangle r1=new rectangle();
		rectangle r2=new rectangle();
		r1.insert(4,2);
		r2.insert(6,2);
		r1.calculateArea();
		r2.calculateArea();
	}
}