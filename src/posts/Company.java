package posts;

import profile.Account;

public class Company {
	private String Name;
	private String Description;
	private String Activity; // Activity field => Company's sector or induster (e.g., "Technology")
	private Account account;

	public Company(String Name, String Description, String Activity, Account account) {
		this.Name = Name;
		this.Description = Description;
		this.Activity = Activity;
		this.account = account;
	}

	public String getName() {
		return this.Name;
	}

	public void setName(String name) {
		this.Name = name;
	}

	public String getDescription() {
		return this.Description;
	}

	public void setDescription(String description) {
		this.Description = description;
	}

	public String getActivity() {
		return this.Activity;
	}

	public void setActivity(String activity) {
		this.Activity = activity;
	}

	public Account getAccount() {
		return this.account;
	}

	@Override
	public String toString() {
		return "---Company " + Name + "\nDescription:" + Description + "\nActivity:" + Activity;
	}

}
