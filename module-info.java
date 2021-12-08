module JavaHW {

public class Employee{
	
int eid;
String ename;
double salary;
String email;
String department;
}
//1
public int getEid() {
return eid;
}
public void setEid(int eid) {
this.eid = eid;
}

//2
public String getEname() {
return ename;
}
public void setEname(String ename) {
this.ename = ename;
}

//3
public double getSalary() {
return salary;
}
public void setSalary(double salary) {
this.salary = salary;
}

//4
public String getEmail() {
return email;
}
public void setEmail(String email) {
this.email = email;
}

//5
public String getDepartment() {
return email;
}
public void setDepartment(String department) {
this.department = department;
}


// Main method- to run program
public static void main(String[] args)
{
	Employee E1 = new Employee();


System.out.println(E1.getEid());
System.out.println(E1.getEname());
System.out.println(E1.getSalary());
System.out.println(E1.getEmail());
System.out.println(E1.getDepartment());

}
////////////////////////
public class Book{
String title;
String author;
String Number_of_pages;
String publisher;
}

//1
public String getTitle() {
return title;
}
public void setTitle(String title) {
this.title = title;
}

//2
public String getAuthor() {
return title;
}
public void setAuthore(String author) {
this.author = author;
}

//3
public String getNumber_of_pages() {
return title;
}
public void setNumber_of_pages(String Number_of_pages) {
this.Number_of_pages = Number_of_pages;
}

//4
public String getPublisher() {
return title;
}
public void setPublisher(String publisher) {
this.publisher = publisher;
}

public static void main(String[] args)
{
	Book B1 = new Book();

System.out.println(B1.getTitle());
System.out.println(B1.getAuthor());
System.out.println(B1.getNumber_of_pages());
System.out.println(B1.getPublisher());

}
}