package Email;

import java.util.ArrayList;
import java.util.List;

public class EmailAccount {
    private String username;
    private List<Text> inbox;

    public EmailAccount()
    {
        logOut();
    }

    public EmailAccount(String username)
    {
        this.username = username;
        inbox = new ArrayList<>();
    }

    public void logIn(EmailAccount emailAccount)
    {
        this.username = emailAccount.getUsername();
        inbox = emailAccount.getInbox();
    }

    public void logOut()
    {
        this.username = null;
        inbox = new ArrayList<>();
    }

    public boolean checkUsername(String username)
    {
        if(this.username.equals(username))
            return true;
        else
            return false;
    }

    public void readEmail()
    {
        for(Text t : inbox)
        {
            System.out.println(t.toString());
        }
    }

    public void receiveEmail(EmailAccount sender,String text)
    {
        inbox.add(new Text(sender.getUsername(),this.username,text));
    }

    public void sendEmail(EmailAccount receiver,String text)
    {
        receiver.receiveEmail(this,text);
    }

    public String getUsername() {
        return username;
    }

    public List<Text> getInbox() {
        return inbox;
    }
}
