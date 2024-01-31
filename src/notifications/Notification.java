package notifications;

import java.util.Date;

public class Notification {
	Date Date_time;
	String Text;

	public Notification(Date Date_time, String Text) {
		this.Date_time = Date_time;
		this.Text = Text;
	}

	@Override
	public String toString() {
		return "Notification{" + "Date time:" + Date_time + "\ntext:" + Text + "}";
	}
}