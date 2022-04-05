class Student{
       int student_id;
	   String stu_name;
	   int mark1,mark2,mark3;
			
        Student()
		{
         student_id=123;
         stu_name="kamal";
         mark1=23;
		 mark2=98;
		 mark3=89;
		 }
		Student(int id,String name,int m1,int m2,int m3)
		
		{
			student_id=id;
			stu_name=name;
			mark1=m1;
			mark2=m2;
			mark3=m3;
        }
		Student(int m1,int m2,int m3)
		{
	     student_id=87;
		 stu_name="babu";
		 mark1=m1;
		 mark2=m2;
		 mark3=m3;
		 
        		 
		}
        void disply(){
	    int total=mark1+mark2+mark3;
        int averge=total/3;	
        System.out.println("AVERAGE:"+ averge);		
        System.out.println("ID:"+ student_id);
	    System.out.println("NAME:"+ stu_name);
	    System.out.println("MARK1:"+ mark1);
	    System.out.println("MARK2:"+ mark2);
	    System.out.println("MARK3:"+ mark3);
        }		
		
}
public class StudentDetails{
   public static void main(String args[]){
    Student obj1= new Student();
	obj1.disply();
	Student obj2= new Student(2,"jobin",65,23,45);
    obj2.disply();
	Student obj3= new Student(23,54,76);
    obj3.disply();
	
}
}

		 
         		 

			
	   