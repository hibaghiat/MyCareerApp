package posts;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

import profile.Account;

public class PostsCollection {
    private List<Post> postsList;

    public PostsCollection() {
        this.postsList = new LinkedList<>();
    }

    public void addPost(Post post) {
        this.postsList.add(post);
    }

    public void removePost(Post postToRemove, Account user) throws DeleteForbiddenException {
        if (postToRemove != null) {
            if (user != postToRemove.getAuthor())
                throw new DeleteForbiddenException(postToRemove, user);
            this.postsList.remove(postToRemove);
        }
    }

    public List<Post> searchPosts(String searchString) {
        List<Post> searchResults = new LinkedList<>();
        for (Post post : this.postsList) {
            if (post.getPost().startsWith(searchString)) {
                searchResults.add(post);
            }
        }
        return searchResults;
    }

    public List<Post> getPostsList() {
        return this.postsList;
    }

    public void sortByLikes() {
        Collections.sort(this.postsList, new Comparator<Post>() {
            @Override
            public int compare(Post p1, Post p2) {
                return Integer.compare(p2.getLikes(), p1.getLikes());
            }
        });
    }

    public void sortByDate() {
        Collections.sort(this.postsList, new Comparator<Post>() {
            @Override
            public int compare(Post p1, Post p2) {
                return p2.getDateTime().compareTo(p1.getDateTime());
            }
        });
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PostCollection:\n");
        for (Post post : this.postsList) {
            sb.append(post.toString()).append("\n");
        }
        return sb.toString();
    }
}