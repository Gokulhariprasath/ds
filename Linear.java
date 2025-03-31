class Linear
{
    public static int linear(int arr[],int x)
    {
        for (int i=0; i<arr.length;i++)
        {
            if(x==arr[i])
       return i;
        }
        return - 1;
    }
    
    public static void main (String args[])
    {
        int arr[] = {
            1,22,344,
        };
        int s = linear(arr,22);
        System.out.println("searched by linear search"+s);
    }
}