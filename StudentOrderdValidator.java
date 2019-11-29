public class StudentOrderdValidator {

    //MAIN METHOD
    public static void main(String[] args) {
        checkAll();
    }
    //CHECK ALL() METHOD
    static void checkAll(){
        while(true){
        StudentOrder student1 = readStudentOrder();
            if(student1 == null){
                break;
            }

         AnswerCityRegister cityAnswer = checkCityRegister(student1);
         if(!cityAnswer.success){
             break;
         }
         AnswerWedding weddingAnswer =  checkWedding(student1);
         AnswerChildren childrenAnswer =  checkChildren(student1);
         AnswerStudent studentAnswer =  checkStudent(student1);

        sendMail(student1);
        }
        System.out.println("funish2");
    }

    //READ STUDENT ORDER METHOD
    static StudentOrder readStudentOrder(){
        StudentOrder student1 = new StudentOrder();
        return student1;
    }
    
    //CHECK CITY REGISTER() METHOD
   
    static AnswerCityRegister checkCityRegister(StudentOrder student1){
        CityRegisterValidator crv1 = new CityRegisterValidator();
        crv1.hostName = "Host1";
        crv1.login = "Login1";
        crv1.password = "Password1";
        CityRegisterValidator crv2 = new CityRegisterValidator();
        crv2.hostName = "Host2";
        crv2.login = "Login2";
        crv2.password = "Password2";
        AnswerCityRegister ans1 = crv1.checkCityRegister(student1);
        AnswerCityRegister ans2 = crv2.checkCityRegister(student1);
        return ans1;
    }
    //CHECK WEDDING() METHOD
    static AnswerWedding checkWedding(StudentOrder student1){
        AnswerWedding answerWedding = new AnswerWedding();
        return answerWedding;
    }
    //CHECK CHILDREN() METHOD
    static AnswerChildren checkChildren(StudentOrder student1){
        AnswerChildren answerChildren = new AnswerChildren();
        return answerChildren;
    }
    //CHECK STUDENT() METHOD
    static AnswerStudent checkStudent(StudentOrder student1){
        AnswerStudent answerStudent = new AnswerStudent();
        return answerStudent;
    }
    //SEND MAIL METHOD
    static void sendMail(StudentOrder student1){

    }

}