/**
 * CityRegisterValidator
 */
public class CityRegisterValidator {

    String hostName;
    String login;
    String password;
    
    AnswerCityRegister checkCityRegister(StudentOrder student1){
        System.out.println("CityRegister is running " + hostName + ","+ login +"," + password);
        AnswerCityRegister answerCityRegister = new AnswerCityRegister();
        answerCityRegister.success = false;
        return answerCityRegister;
    }
}