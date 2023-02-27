import java.util.*;
class CmpList{
public static void main(String [] abu){
Scanner s=new Scanner(System.in);
System.out.println("");
int n=s.nextInt();
ArrayList<String>arr1=new ArrayList<String>();
for(int i=0;i<n;i++)
arr1.add(i,s.next());
System.out.println(arr1);/*
int n1=s.nextInt();
ArrayList<String>arr2=new ArrayList<String>();
for(int i=0;i<n1;i++)
arr2.add(i,s.next());
	
	ArrayList<String>arr3=new ArrayList<String>();
	for(String e:arr1)
		arr3.add(arr2.contains(e)?"Yes":"No");
	System.out.println(arr3);
	ArrayList<String>cop1= (ArrayList<String>)arr1.clone();
	System.out.println("cloned AL :"+cop1);*/
	arr1.remove(1);
System.out.println(arr1);	
	
}
}