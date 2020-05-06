public class Fib{
public static void main(String args[])
{
int n=10, f=0, g=1;
System.out.print("First "+ n +" terms: ");
for (int i=1;i<=n;++i)
{System.out.print(g + "	");
int sum = f + g;
f = g;
g = sum;
}
}
}

