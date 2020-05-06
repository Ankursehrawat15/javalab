interface course
{
void division(int a);
void modules(int b);
}
class stud implements course
{
String name;
int div,mod;
void name(String n)
{ name=n; }
public void division(int a)
{ div=a; }
public void modules(int b)
{ mod=b; }
void disp()
{



