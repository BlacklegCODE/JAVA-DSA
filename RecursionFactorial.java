class Main
{
    public static int Fact(int a)
    {
        if(a == 1 || a == 0)
        {
            return 1;
        }
        int facto = Fact(a-1);
        int ans = a * facto;
        return ans;
    }
    public static void main(String[] args)
    {
        int a = 5;
        int anss = Fact(a);
        System.out.println(anss);
    }
}
