import java.util.*;
class CollsList{
public static void main(String [] abu){

Student std=new Student();
std.show();

}
}
class Details{
	int s;
	String name;
	int age;
	int marks;
	int roll;
	String address;
	public Details(int s,int roll,String name,int age,int marks,String address){
		this.s=s;
		this.roll=roll;
		this.name=name;
		this.age=age;
		this.marks=marks;
		this.address=address;
	}
	public String toString(){
		
    return s+" "+name+" "+age+" "+marks+" "+address;
		
	}
	
}
class Student{
	//Student arr[]=new Student[10];
	ArrayList<Details>arr=new ArrayList<>();
	static Scanner s=new Scanner(System.in);
	int si=1;
	int ag=20;
	int k=0;
	public void show(){
		System.out.println("1.add || 2.addPartic || 3.display");
		int n=s.nextInt();
		switch(n){
			
			case 1:
			        add();
					break;
			case 2:
			        addPartic();
					break;
			case 3:
			      display();
				  break;
		}
		
		
	}
	public void add(){
		System.out.println("enter how much stud");
		int in=s.nextInt();
		for(int i=0;i<in;i++){
			int serial= k+1;
			System.out.println(" enter roll number");
			int roll=s.nextInt();
			System.out.println(" enter name ");
			String name=s.next();
			int age=ag;
			System.out.println(" enter marks");
			int marks=s.nextInt();
			System.out.println(" enter address ");
			String address=s.next();
			arr.add(k,new Details(serial,roll,name,age,marks,address));
			k++;
		}
		show();
	}
	public void addPartic(){
		
		
	}
	public void display(){
		System.out.println("Serial\t"+"Roll\t"+"Name\t"+"Age\t"+"Marks\t"+"Address\t");
		for(int i=0;i<k;k++){
        System.out.println(arr.get(i));
			
		}
	}
	
	
	
	
	
	
}