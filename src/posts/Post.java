package posts;

import java.util.Date;

import notifications.Hashtag;
import notifications.HashtagCollection;
import profile.Account;
import profile.Profile;

public class Post {
	private Date DateTime;
	private String Post;
	private int likes;
	private HashtagCollection hashtags;
	private Account author;

	public Post(String Post, Account account) {
		this.DateTime = new Date();
		this.Post = Post;
		likes = 0;
		author = account;
		hashtags = new HashtagCollection();
		findHashtags();
	}

	private void findHashtags() {
		int index = 0;
		while (index < Post.length()) {
			int hashtagStartIndex = Post.indexOf("#", index);
			if (hashtagStartIndex == -1) {
				// No more hashtags
				break;
			}
			int hashtagEndIndex = hashtagStartIndex + 1;
			while (hashtagEndIndex < Post.length() && Character.isLetterOrDigit(Post.charAt(hashtagEndIndex))) {
				hashtagEndIndex++;
			}
			String hashtag = Post.substring(hashtagStartIndex, hashtagEndIndex);
			// Add the hashtag to the collection
			hashtags.addHashtag(new Hashtag(hashtag));
			index = hashtagEndIndex;
		}
	}

	public void Like() {
		likes++;
	}

	public void unLike() {
		likes--;
	}

	public Date getDateTime() {
		return DateTime;
	}

	public void setDateTime(Date dateTime) {
		this.DateTime = dateTime;
	}

	public String getPost() {
		return Post;
	}

	public void setPost(String post) {
		this.Post = post;
	}

	public int getLikes() {
		return likes;
	}

	public HashtagCollection getHashtags() {
		return hashtags;
	}

	public Account getAuthor() {
		return this.author;
	}

	@Override
	public String toString() {
		return "(" + DateTime.toString() + ") " + Post;
	}

	public String toString(Profile profile) {
		return "(" + DateTime.toString() + ") [" + profile.getName() + "] " + Post;
	}

}