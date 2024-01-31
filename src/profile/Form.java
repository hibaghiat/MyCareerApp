package profile;

public class Form {
	public String Education;
	public String Experience;
	public String Skills;
	
	public Form(String Education, String Experience, String Skills) {
		this.Education = Education;
		this.Experience = Experience;
		this.Skills = Skills;
	}
	@Override
    public String toString() {
        return "Form{" + "\nEducation:" + Education + "\nExperience:" + Experience  +"\nSkills:" + Skills + "}";
    }
}