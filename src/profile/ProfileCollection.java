package profile;

import java.util.LinkedList;
import java.util.List;

public class ProfileCollection {
    private List<Profile> profilesList;

    public ProfileCollection() {
        this.profilesList = new LinkedList<>();
    }

    public void addProfile(Profile profile) {
        this.profilesList.add(profile);
    }

    public Profile getProfile(String name) {
        for (Profile profile : this.profilesList) {
            if (profile.getName().equals(name)) {
                return profile;
            }
        }
        return null;
    }

    public void removeProfile(String name) {
        Profile profileToRemove = null;
        for (Profile profile : this.profilesList) {
            if (profile.getName().equals(name)) {
                profileToRemove = profile;
                break;
            }
        }
        if (profileToRemove != null) {
            this.profilesList.remove(profileToRemove);
        }
    }

    public List<Profile> getprofilesList() {
        return this.profilesList;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ProfileCollection:\n");
        for (Profile profile : this.profilesList) {
            sb.append(profile.toString()).append("\n");
        }
        return sb.toString();
    }
}