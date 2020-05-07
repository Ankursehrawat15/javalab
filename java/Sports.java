class sports{

public static void main(String[] args)
{
String name;
int age;
sports(String n, int a)
{name=n; age=a;}
void show()
{
System.out.println("\n");
System.out.println("Player name : "+name);
System.out.println("Age : "+age);
}
}
  class cricketer extends sports
{
String type;
cricketer(String n, String t,int a)
{
super(n,a);
type=t;
}
public void show()
{
super.show();
System.out.println("Player plays : "+type);
}
}
class football_player extends sports
{
String type;
football_player(String n, String t,int a)
{
super(n,a);
type=t;
}
public void show()
{
super.show();
System.out.println("Player plays : "+type);
}
}
class hockey_player extends sports
{
String type;
hockey_player(String n, String t,int a)
{
super(n,a);
type=t;
}
public void show()
{
super.show();
System.out.println("Player plays : "+type);
}
}
// main
class Player
{
public static void main(String args[])
{
cricketer c1 = new cricketer("Virat","Cricket",30);
football_player c2 = new football_player("Mbappe","Football",20);
hockey_player c3 = new hockey_player("Salah","Hockey",25);
c1.show();
c2.show();
c3.show();
}
}
}
