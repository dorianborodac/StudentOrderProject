/**
 * SaveStudentOrder
 */
public class SaveStudentOrder {

    public static void main(String[] args) {
        StudentOrder student1 = new StudentOrder();
        student1.hFname = "sanea";
        student1.hLname = "CUCU";
        student1.wFname = "PIZ";
        student1.wLname = "CUCU";

        long as = saveStudentOrder(student1);
        System.out.println(as);
        
    }

    static long saveStudentOrder(StudentOrder studentOrder){
        long a  = 2;
        System.out.println("husband " + studentOrder.hFname + " " + studentOrder.hLname);
        return a;
    }
}