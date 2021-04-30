import java.util.*;
class EnumExample
{
public enum Subject
{
english,web,graphics,maths,python
};
public static void main(String[] args)
{
for(Subject s: Subject.values())
System.out.println(s);
Scanner s = new Scanner(System.in);
System.out.println("Enter The Subject:");
String SubStr = s.next();
Subject sub = Subject.valueOf(SubStr.toLowerCase());
switch(sub)
{
case english:
System.out.println("SUBCODE:18CS61");
System.out.println("Credits:01");
break;
case web:
System.out.println("SUBCODE:18CS62");
System.out.println("Credits:03");
break;
case graphics:
System.out.println("SUBCODE:18CS63");
System.out.println("Credits:02");
break;
case maths:
System.out.println("SUBCODE:18CS64");
System.out.println("Credits:04");
break;
case python:
System.out.println("SUBCODE:18CS65");
System.out.println("Credits:04");
break;
}
}
}
