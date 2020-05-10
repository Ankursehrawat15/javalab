interface test
{
int square();
}
class arithmetic implements test
{
int b;
arithmetic(int x)
{
b = x;
}
public int square()
{
return (b*b);
}
}

