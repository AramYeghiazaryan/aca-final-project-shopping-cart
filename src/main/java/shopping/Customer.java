package shopping;

public class Customer {
    // Customer to be able to shop each customer has its shopping Cart
    // create all necessary fields
    // make validation for fields phone number, email,
    public Customer(String phoneNumber, String email) {
        this.number = phoneNumber;
        this.mail = email;
    }
//        if (phoneNumber.length() == 8) {
//            boolean isDigit = true;
//            for (int i = 0; i < phoneNumber.length(); i++) {
//                if (!Character.isDigit(phoneNumber.charAt(i))) {
//                    isDigit = false;
//                    break;
//                }
//            }
//            if (isDigit) {
//                ;
//            }
//
//        }
//
//        for (int i = 0; i < email.length(); i++) {
//            if (email.charAt(i) != '@') {
//
//                break;
//            }

    public String getMail() {
        return this.mail;
    }

    public String getNumber() {
        return this.number;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    String number;
    String mail;

}


