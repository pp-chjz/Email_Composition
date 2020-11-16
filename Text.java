package Email;

public class Text {
    private String sender,receive,text;

    public Text(String sender, String receive, String text) {
        this.sender = sender;
        this.receive = receive;
        this.text = text;
    }

    public String toString()
    {
        String text = "***********" + "\n" +
                    "From: " + sender + "\n" +
                    "To: " + receive + "\n" +
                    this.text + "\n" +
                    "**********";

        return text;
    }
}
