package posts;

import profile.Account;

public class DeleteForbiddenException extends Exception {
    public DeleteForbiddenException(Post post, Account account) {
        super("DeleteForbiddenException: Account " + account.getLogin()
                + " does not have the right to delete the post of user" + post.getAuthor().getLogin());
    }
}