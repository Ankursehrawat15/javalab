import java.util.*;  
public class ThirdLargestInArrayExample2{  
public static int getThirdLargest(Integer[] a, int total){  
List<Integer> list=Arrays.asList(a);  
Collections.sort(list);  
int element=list.get(total-3);  
return element;  
}  
public static void main(String args[]){ 
Integer a[]={1,2,5,7,6,8};  
Integer b[]={44,33,99,11,33,66,22};  
System.out.println("Third Largest: "+getThirdLargest(a,6));  
System.out.println("Third Largest: "+getThirdLargest(b,7));  
}}  
