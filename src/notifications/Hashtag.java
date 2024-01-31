package notifications;

public class Hashtag {
	private String hashtag;

	public Hashtag(String hashtag) {
		this.hashtag = hashtag;
	}

	public String getHashtag() {
		return this.hashtag;
	}

	@Override
	public String toString() {
		return this.hashtag;
	}

}