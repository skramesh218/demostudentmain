class student
{
    String Sname;
    int regno;
    int sem;
    String dname;
    void getdata(String a,int b,int c,String d)
    {
       Sname=a;
       regno=b;
       sem=c;
       dname=d;
    }
    void display()
    {
        System.out.println(Sname+"\t\t"+regno+"\t\t"+sem+"\t\t"+dname);
    }
}
class demostudentmain

{
    public static void main(String arg[])
    {
        System.out.println("sname\t\tregno\t\tsem\t\tdname");
        System.out.println("--------------------------------------------------------------");
       
        student ob=new student();
        ob.getdata("Mani",123,4,"cs");
        ob.display();
        

        student ob1=new student();
        ob1.getdata("mani",123,4,"cs");
        ob1.display();
    }
}