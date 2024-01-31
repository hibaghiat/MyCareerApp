package posts;

import java.util.Date;

import profile.Account;

public class Job_Op_Post extends Post {
	private String Job_title;
	private Double Salary;
	private Date Start_date;

	public Job_Op_Post(String Post, Account account, String Job_title, Double Salary, Date Start_date) {
		super(Post, account);
		this.Job_title = Job_title;
		this.Salary = Salary;
		this.Start_date = Start_date;
	}

	// Getters
	public String getJobTitle() {
		return Job_title;
	}

	public Double getSalary() {
		return Salary;
	}

	public Date getStartDate() {
		return Start_date;
	}

	// Setters
	public void setJobTitle(String jobTitle) {
		this.Job_title = jobTitle;
	}

	public void setSalary(Double salary) {
		this.Salary = salary;
	}

	public void setStartDate(Date startDate) {
		this.Start_date = startDate;
	}

	public String toString(Company company) {
		return company.getName() + ": " + Job_title + "\n" + super.toString() + "\n\nSalary: " + Salary
				+ "\nStart date: " + Start_date;
	}
}