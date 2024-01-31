package testing;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;


import profile.*;
import posts.*;
import notifications.*;

public class MyCareerApp {

	public static void main(String[] args) {

		// first create accounts for companies and regular users

		// Create Account objects
		Account appleAccount = new Account("apple", "abc123");
		Account microsoftAccount = new Account("microsoft", "def456");
		Account googleAccount = new Account("google", "ghi789");
		Account amazonAccount = new Account("amazon", "jkl012");
		Account teslaAccount = new Account("tesla", "mno345");
		Account johnDoeAccount = new Account("johndoe", "pqr678");
		Account janeDoeAccount = new Account("janedoe", "stu901");
		Account sampleAccount = new Account("sample", "vwx234");

		// Create Company objects
		Company apple = new Company("Apple", "Technology company specializing in consumer electronics and software",
				"Technology", appleAccount);
		Company microsoft = new Company("Microsoft",
				"Technology company specializing in computer software, consumer electronics, and personal computers",
				"Technology", microsoftAccount);
		Company google = new Company("Google",
				"Technology company specializing in internet-related services and products", "Technology",
				googleAccount);
		Company amazon = new Company("Amazon", "Online retail company", "Retail", amazonAccount);
		Company tesla = new Company("Tesla", "Automotive and energy company", "Automotive", teslaAccount);

		// Create Profile objects
		Profile johnDoe = new Profile("John Doe", 30, "123 Main St", "johndoe@email.com", "123-456-7890",
				johnDoeAccount);
		Profile janeDoe = new Profile("Jane Doe", 25, "456 Market St", "janedoe@email.com", "234-567-8901",
				janeDoeAccount);
		Profile sampleProfile = new Profile("Sample User", 35, "789 Market St", "sample@email.com", "345-678-9012",
				sampleAccount);

		// Create AccountCollection, ProfileCollection, and CompanyCollection objects
		AccountCollection accountCollection = new AccountCollection();
		ProfileCollection profileCollection = new ProfileCollection();
		CompanyCollection companyCollection = new CompanyCollection();

		// Add Account objects to the AccountCollection
		accountCollection.addAccount(appleAccount);
		accountCollection.addAccount(microsoftAccount);
		accountCollection.addAccount(googleAccount);
		accountCollection.addAccount(amazonAccount);
		accountCollection.addAccount(teslaAccount);
		accountCollection.addAccount(johnDoeAccount);
		accountCollection.addAccount(janeDoeAccount);
		accountCollection.addAccount(sampleAccount);

		// Add Profile objects to the ProfileCollection
		profileCollection.addProfile(johnDoe);
		profileCollection.addProfile(janeDoe);
		profileCollection.addProfile(sampleProfile);

		// Add Company objects to the CompanyCollection
		companyCollection.addCompany(apple);
		companyCollection.addCompany(microsoft);
		companyCollection.addCompany(google);
		companyCollection.addCompany(amazon);
		companyCollection.addCompany(tesla);

		// Make each company post a job opening
		Date startDate1 = new GregorianCalendar(2022, 1, 1).getTime();
		Job_Op_Post appleJobPost = new Job_Op_Post("We are hiring a software engineer to join our team! #Engineering",
				appleAccount, "Software Engineer", 100000.0, startDate1);

		Date startDate2 = new GregorianCalendar(2022, 3, 15).getTime();
		Job_Op_Post microsoftJobPost = new Job_Op_Post(
				"We are looking for a data scientist to join our team! #DataScience", microsoftAccount,
				"Data Scientist", 110000.0, startDate2);

		Date startDate3 = new GregorianCalendar(2022, 5, 1).getTime();
		Job_Op_Post googleJobPost = new Job_Op_Post("We have an opening for a UX designer on our team!", googleAccount,
				"UX Designer", 90000.0, startDate3);

		Date startDate4 = new GregorianCalendar(2022, 7, 15).getTime();
		Job_Op_Post amazonJobPost = new Job_Op_Post("We are seeking a product manager to join our team!", amazonAccount,
				"Product Manager", 120000.0, startDate4);

		Date startDate5 = new GregorianCalendar(2022, 9, 1).getTime();
		Job_Op_Post teslaJobPost = new Job_Op_Post(
				"We have an opening for a electrical engineer on our team! #Engineering", teslaAccount,
				"Electrical Engineer", 95000.0, startDate5);

		// Have each user write a post
		Post johnDoePost = new Post("Just landed a new job as a software engineer at a great company! #Engineering",
				johnDoeAccount);
		Post janeDoePost = new Post("Excited to start my new role as a data scientist at a top tech firm! #DataScience",
				janeDoeAccount);
		Post samplePost = new Post("I am looking for new opportunities in the UX design field! ", sampleAccount);

		int count = 0;
		// Have one of the user accounts like 2 job opening posts
		while (true) {
			try {
				count++;
				if (count == 1)
					johnDoeAccount.Authenticate("johndoe", "pqréAq8");
				else
					johnDoeAccount.Authenticate("johndoe", "pqr678");
				break;
			} catch (FailedLoginException e) {
				System.out.println(e.getMessage());
				System.out.println("\nPlease try again:\n");
			}
		}

		// Liking posts
		appleJobPost.Like();
		microsoftJobPost.Like();

		HashtagCollection hashtagCollection = new HashtagCollection();
		hashtagCollection.addHashtag(new Hashtag("#DataScience"));
		hashtagCollection.addHashtag(new Hashtag("#Engineering"));

		PostsCollection postsCollection = new PostsCollection();
		// Print out the job opening posts and user posts
		postsCollection.addPost(appleJobPost);
		postsCollection.addPost(microsoftJobPost);
		postsCollection.addPost(googleJobPost);
		postsCollection.addPost(amazonJobPost);
		postsCollection.addPost(teslaJobPost);
		postsCollection.addPost(johnDoePost);
		postsCollection.addPost(janeDoePost);
		postsCollection.addPost(samplePost);

		try {
			postsCollection.removePost(janeDoePost, sampleAccount);
		} catch (DeleteForbiddenException e) {
			System.out.println(e.getMessage());
		}

		// displaying all job openings
		System.out.println("\n\n-----Displaying All Job Openings-----\n\n");
		for (Post job_op : postsCollection.getPostsList()) {
			if (job_op instanceof Job_Op_Post) {
				System.out.print(job_op + "\n\n");
			}
		}

		System.out.println("-----Displaying All Posts with the \'#Engineering\' hashtag-----\n\n");
		List<Post> EngineeringPosts = hashtagCollection.searchPostsByHashtag("#Engineering", postsCollection);
		for (Post post : EngineeringPosts) {
			System.out.print(post + "\n\n");
		}

	}
}