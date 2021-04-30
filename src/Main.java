import com.company.Logs.DatabaseLogger;
import com.company.Managers.InstructorManager;
import com.company.People.Instructor;
import com.company.People.Student;

public class Main {

    public static void main(String[] args) {


        InstructorManager instructorManager= new InstructorManager();


        // a student array creating for the instructer class
        Student[] students =new Student[50];

        for(int i=0;i<50;i++)
        {
            students[i]=new Student();
        }





        Instructor instructor = new Instructor();
        instructor.setId(101);
        instructor.setName("ÇAĞLAR");
        instructor.setSurname("PEKER");
        instructor.setBranch("Health");
        instructor.setEducationState("Universty");
        instructor.setNationalIdentityNumber("00000000001");
        instructor.setStudents(students);



        // * adding instructor by singular method with Logging

        instructorManager.add(instructor,new DatabaseLogger());

        // * adding instructor by singular method with out Logging

        instructorManager.add(instructor,null);


        System.out.println("\n \n" );  // spacing..


        // * deleting instructor by singular method with Logging

        instructorManager.delete(instructor,new DatabaseLogger());

        // * deleting instructor by singular method with out Logging

        instructorManager.delete(instructor,null);




        Instructor [] instructors=new Instructor[50];


        for(int i=0;i<50;i++)
        {
            instructors[i]=instructor;
        }




        // * adding instructor by multiple method with Logging

        instructorManager.addMultiple(instructors,new DatabaseLogger());

        // * adding instructor by multiple method with out Logging

        instructorManager.addMultiple(instructors,null);


        System.out.println("\n \n" );  // spacing..


        // * deleting instructor by multiple method with Logging

        instructorManager.deleteMultiple(instructors,new DatabaseLogger());

        // * deleting instructor by multiple method with out Logging

        instructorManager.deleteMultiple(instructors,null);

    }
}
