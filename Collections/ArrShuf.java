import java.util.*;

class ArrShuf{
public static void main(String [] abu){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
ArrayList<String>arr=new ArrayList<String>();
for(int i=0;i<n;i++)
	arr.add(i,s.next());
Collections.reverse(arr);
System.out.println(arr);
 List<String> sub_List = arr.subList(0, 3);
System.out.println(sub_List);

}
}