package notifications;

import java.util.LinkedList;
import java.util.List;

import posts.*;

public class HashtagCollection {
    // Attributes
    private List<Hashtag> hashtags;

    // Constructor
    public HashtagCollection() {
        this.hashtags = new LinkedList<>();
    }

    // Method to add a hashtag to the collection
    public void addHashtag(Hashtag hashtag) {
        hashtags.add(hashtag);
    }

    // Method to remove a hashtag from the collection
    public void removeHashtag(Hashtag hashtag) {
        hashtags.remove(hashtag);
    }

    // Method to search for a hashtag in the collection
    public boolean searchHashtag(String hashtag) {
        for (Hashtag ht : hashtags) {
            if (ht.getHashtag().equalsIgnoreCase(hashtag)) {
                return true;
            }
        }
        return false;
    }

    // Method to display all hashtags in the collection
    public void displayHashtags() {
        for (Hashtag ht : hashtags) {
            System.out.println(ht);
        }
    }

    public List<Post> searchPostsByHashtag(String hashtag, PostsCollection postCollection) {
        List<Post> searchResults = new LinkedList<>();
        for (Post post : postCollection.getPostsList()) {
            if (post.getHashtags().searchHashtag(hashtag)) {
                searchResults.add(post);
            }
        }
        return searchResults;
    }

    // Method to return the number of hashtags in the collection
    public int getNumHashtags() {
        return hashtags.size();
    }
}