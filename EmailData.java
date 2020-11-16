package Email;

import java.util.ArrayList;
import java.util.List;

public class EmailData {
    private List<EmailAccount> emailAccountList;

    public EmailData()
    {
        emailAccountList = new ArrayList<>();
    }

    public void addAccount(EmailAccount emailAccount)
    {
        emailAccountList.add(emailAccount);
    }

    public boolean checkUsername(String username)
    {
        for(EmailAccount emailAccount : emailAccountList)
        {
            if(emailAccount.checkUsername(username))
            {
                return true;
            }
        }
        return false;
    }

    public EmailAccount getEmailAccount(String username)
    {
        for(EmailAccount emailAccount : emailAccountList)
        {
            if(emailAccount.checkUsername(username))
            {
                return emailAccount;
            }
        }
        return null;
    }

}
