import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
class NewHashMap
{
public static void main(String args[])
{
HashMap<String, Integer> map = new HashMap<>(); 
map.put("Ankur", 20); 
map.put("Aayush", 10); 
map.put("Brock", 25);
map.put("Kriti", 40);
System.out.println();
String key = "Ankur";
if (map.containsKey(key)) 
{
Integer a = map.get(key); 
System.out.println("value for key "+ key  +" is: "+a); 
}
int value = 20; 
System.out.println();
if (map.containsValue(value)) 
{Iterator it = map.entrySet().iterator();
while(it.hasNext()){ 
String str = it.next().toString();
if(str.split("=")[1].contains(String.valueOf(value)))
{
System.out.println("key for value "+ value  +" is: "+str.split("=")[0]); 
}
}
} 


