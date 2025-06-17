package org.example;

public class User {
    private String password;

    public void initPassword(PasswordGenerator passwordGenerator){
        // as-is 강한결합(내부)
//        RandomPasswordGenerator randomPasswordGenerator = new RandomPasswordGenerator();

        // to-be 약한결합
        String Password = passwordGenerator.generatePassword();
        /*
        비밀번호는 최소 8자 이상 12자 이하여야 한다.
         */
        if(Password.length() >= 8 && Password.length() <= 12){
            this.password = Password;
        }
    }

    public String getPassword() {
        return password;
    }
}
