import java.util.*;
class LeafyBucket
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        int bucket=0;
        int op_rate,i,n,bsize;
        System.out.println("enter the no. of packets");
        n=sc.nextInt();
        System.out.println("enter the output rate of the bucket");
        op_rate=sc.nextInt();
        System.out.println("enter bucket size");
        bsize=sc.nextInt();
        System.out.println("enter arriving packets(size)");
        int pkt[]=new int[n];
        for(i=0;i<n;i++)
        {
            pkt[i]=sc.nextInt();
        }
        System.out.println("\nsec    \t    psize  \t  bucket  \taccept/reject  \tpkt_send\t");
        System.out.println("---------------------------------------------------------------------");
        for(i=0;i<n;i++)
        {
            System.out.print(i+1+"\t\t"+pkt[i]+"\t\t");
            if(bucket+pkt[i]<=bsize)
            {
                bucket+=pkt[i];
                System.out.print(bucket+"\t\tAccept\t\t" + min(bucket,op_rate)+"\n"+"");
                bucket=sub(bucket,op_rate);
            }
            else
            {
              int reject=(bucket+pkt[i]-bsize);
              bucket+=bsize;
              System.out.print(bucket+"\treject\t"+reject+"\t\t"+min(bucket,op_rate)+"\n");
              bucket=sub(bucket,op_rate); 
            }
        }
        while(bucket!=0)
        {
            System.out.println((i++)+"\t0\t"+bucket+"\taccept\t"+min(bucket,op_rate)+"\t");
            bucket=sub(bucket,op_rate);
        }
    }
    
    static int min(int a,int b)
    {

        return ((a<b)?a:b);
    }
    static int sub(int a,int b)
    {
        return (a-b)>0?(a-b):0;
    }
}
