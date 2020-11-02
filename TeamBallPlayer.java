package BrandlExamDemo;

public class TeamBallPlayer implements Player {

    // fields
    private String name;
    private String age;
    private String jerseyNumber;
    private String position;

    // constructor
    public TeamBallPlayer(String n, String a, String j, String p) {
	super();
	this.name = "";
	this.age = "";
	this.jerseyNumber = "";
	this.position = "";

    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public String getAge() {
	return age;
    }

    public void setAge(String age) {
	this.age = age;
    }

    public String getJerseyNumber() {
	return jerseyNumber;
    }

    public void setJerseyNumber(String jerseyNumber) {
	this.jerseyNumber = jerseyNumber;
    }

    public String getPosition() {
	return position;
    }

    public void setPosition(String position) {
	this.position = position;
    }

    @Override
    public String display() {
	return "\n\tName: " + getName() + "\n\tAge: " + getAge() + "\n\tDesired Jersey Number: " + getJerseyNumber()
		+ "\n\tDesred Position" + getPosition();
    }

}
