import java.util.*;
class L2ProfThef{
public static void main(String []abu){
Scanner s=new Scanner(System.in);
System.out.println("enter size");
int n=s.nextInt();
int a[]=new int[n];
System.out.println("enter elements");
for(int i=0;i<n;i++){
	a[i]=s.nextInt();
}
int sum1=0;
int sum2=0;
for(int i=0;i<n;i++){
	if(a[i]%2==0)?even():odd();
}
}
public void even(){
	for(int i=0;i<n;i+=2)
		sum1+=a[i];
}
public void odd(){
	
	for(int i=1;i<n;i+=2)
		sum2+=a[i];
}
if(sum1<sum2)?System.out.println(sum1):System.out.println(sum2);
}