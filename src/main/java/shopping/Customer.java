package shopping;

public class Customer {
    // Customer to be able to shop each customer has its shopping Cart
    // create all necessary fields
    // make validation for fields phone number, email,
    String customerName;
    String phoneNumber;
    String email;

    public Customer(String customerName, String phoneNumber, String email) {
        for (int i = 0; i < phoneNumber.length(); i++) {
            try {
                if (phoneNumber.charAt(i) < 43 || (phoneNumber.charAt(i) > 43 && phoneNumber.charAt(i) < 48) || phoneNumber.charAt(i) > 57) {
                    throw new InvalidDataException("Your phone number must contain only digits and/or a +");
                }
            } catch (InvalidDataException error1) {
                System.out.println(error1);
            }
        }
        try {
            if (phoneNumber.length() > 12) {
                throw new InvalidDataException("Your phone number must have no more than 12 digits!");
            }
        } catch (InvalidDataException error2) {
            System.out.println(error2);
        }

        try {
            if (!(email.contains("@")) && email.contains(".")) {
                throw new InvalidDataException("Your inputted email doesn't meet the requirements");
            }
        } catch (InvalidDataException error3) {
            System.out.println(error3);
        }
        this.customerName = customerName;
        this.phoneNumber = phoneNumber;
        this.email = email;

    }


}

