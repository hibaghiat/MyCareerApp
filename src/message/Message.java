package message;
import java.util.Date;

public class Message {
	public Date Date_time;
	public String Message;

public Message(Date Date_time, String Message) 
{
	this.Date_time = Date_time;
	this.Message = Message;
}
@Override
public String toString() {
    return   "\nDate time:" + Date_time + "\nMessage{" + Message + "}";
}
}