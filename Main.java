package Email;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        EmailData emailData = new EmailData();

        EmailAccount usa = new EmailAccount("usa");
        EmailAccount ruj = new EmailAccount("ruj");
        EmailAccount saac = new EmailAccount("saac");

        EmailAccount currentAccount = new EmailAccount();
        EmailAccount receiveAccount = new EmailAccount();

        emailData.addAccount(usa);
        emailData.addAccount(ruj);
        emailData.addAccount(saac);

        Scanner in = new Scanner(System.in);
//        String input = in.nextLine();

        System.out.println("============ SWCon Email System ============");
        System.out.print("-----> Command [I)Log In  S)Send  R)Read  O)Log Out  Q)Quit]: ");
        String input = in.nextLine();
        while (!input.equalsIgnoreCase("Q"))
        {
            if(input.equalsIgnoreCase("I")){
                System.out.print("Username: ");
                input = in.nextLine();

                if(emailData.checkUsername(input))
                {
                    currentAccount.logIn(emailData.getEmailAccount(input));
                }
                else
                {
                    System.out.println("not have this Account");
                }
            }
            else if(input.equalsIgnoreCase("S")){
                System.out.print("Enter recipient: ");
                input = in.nextLine();
                if(emailData.checkUsername(input))
                {
                    receiveAccount = emailData.getEmailAccount(input);
                    System.out.print("Enter text: ");
                    String text = input = in.nextLine();

                    currentAccount.sendEmail(receiveAccount,text);
                }
                else
                {
                    System.out.println("not have this Account");
                }

            }
            else if(input.equalsIgnoreCase("R")){
                currentAccount.readEmail();

            }
            else if(input.equalsIgnoreCase("O")){
                currentAccount.logOut();
            }
            System.out.print("-----> Command [I)Log In  S)Send  R)Read  O)Log Out  Q)Quit]: ");
            input = in.nextLine();
        }

        System.out.println("=============== Good Bye ! ==============");


    }
}
