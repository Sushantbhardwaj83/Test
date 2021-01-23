import java.io.*;  
class DemoStudent{  
 public static void main(String args[])throws Exception{  
  Student1 s1 =new Student1(211,"ravi");  
  
  FileOutputStream fout=new FileOutputStream("f.txt");  
  ObjectOutputStream out=new ObjectOutputStream(fout);  
  
  out.writeObject(s1);  
  out.flush();  
  System.out.println("success");  
 }  
}  