public class Person
{
private String name;
private string adddress;
puclic Person(String name,String address)
{
this.name=name;
this.address=address;
}
public void setAddress(String newaddress)
{
this.address=newaddress;
}
public String getName()
{
return name;
}
public String getAddress()
{
return Address;
}
public String toString()
{
return "name of the person is"+name+" "+residing at address+" "+address";
}
}

class Student
{
private String program;
private int year;
private double fee;
public Student(String name,String address,String program,int year,double fee)
{
super(name,address);
this.program=program;
this.year=year;
this.fee=fee;
}
 public void setProgram(String newprogram)
{
this.program=newprogram;
}
public void setyear(int newyear)
{
this.year=newyear;
}
public void setfee(double newfee)
{
this.fee=newfee;
}

public String toString()
{
return "student studying "+program+"in"+""+year+""+"fee is"+fee;
}
}


class Staff extends Person
{
private String school;
private double pay;
public Staff(String name,String address,String school,double pay)
{
super(name,address);
this.school=school;
this.pay=pay;
}


 public void setSchool(String newschool)
{
this.school=newschool;
}

public void setPay(double newpay)
{
this.pay=newpay;
}

public String toString()
{
return "staff working at"+school+" "+payment is+pay;
}
}

public class PersonDriver
{
public static void main(String args[])
{
 Person p1=new Person("abc","asdcsfdgb");
System.out.println("detaions about person"+p1);
  
System.out.println("person name"+p1.getName()+" "+residing at+" "+p1.address());

p1.setName("abc2");
p1.setAddress("dsvdfbfg");

System.out.println("after set methods"+" "+"person name"+p1.getName()+" "+residing at+" "+p1.address());

Student s1=new Student("abc","sdcffves","android",2016,20000.0);

System.out.println("detaions about student"+s1);

System.out.println("student name"+s1.getName()+" "+residing at+" "+s1.getAddress()+" "+program is"+s1.getProgram()+"year of enrollment"" "+s1.getYear()+" "+"fee amount"+s1.getFee());

s1.setProgram("big data analytics");
s1.setYear(2017);
s1.setFee(20000.0);

system.out.println("after set method+" "+"student name"sp1.getName()+" "+residing at+" "+s1.getAddress()+" "+program is"+s1.getProgram()+"year of enrollment"" "+s1.getYear()+" "+"fee amount"+s1.getFee());


Staff s2=new Staff("abc","sdcffves","mvgr",50000.00);

System.out.println("detaions about staff"+s2);

System.out.println("staff name"+s2.getName()+" "+residing at+" "+s2.getAddress()+" "+school is"+s2.getSchool()+" "+"pay amount"+s2.getPay());

s2.setSchool("IIT");

s2.setPay(100000.0);

System.out.println("new details"+s2);

system.out.println("after set method+" "+"staff name"+s2.getName()+" "+residing at+" "+s1.getAddress()+" "+school is"+s1.getSchool()+" "+"pay amount"+s2.getPay());

}
}
