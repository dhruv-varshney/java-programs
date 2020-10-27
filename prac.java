import java.util.*;
import java.util.Scanner;
class dhruv
{
public static void main(String[] args)
{
int rev=0,k,n,r;
Scanner sc=new Scanner(System.in);
System.out.println("\nenter your no...\n");
n = sc.nextInt();
k = n;
if(n==0)
{
return ;
}
else
{
while(n!=0)
{
r = n%10;
rev = rev*10 + r;
n = n/10;
}
}
if(k==rev)
{
System.out.println("\n "+ k +"is a palindrom and its reverse is"+rev+"\n");
}
else
{
System.out.println("\n "+ k +"is not a palindrom and its reverse is"+rev+"\n");
}
}
}

