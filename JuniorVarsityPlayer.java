/**
 * 
 */
package BrandlExamDemo;

/**
 * @author nadiabrandl
 *
 */
public class JuniorVarsityPlayer implements Player {

    // fields
    private String name;
    private String age;
    private String jerseyNumber;
    private String position;

    /**
     * @param name
     * @param age
     * @param jerseyNumber
     * @param position
     */
    public JuniorVarsityPlayer(String n, String a, String j, String p) {
	super();
	this.name = n;
	this.age = a;
	this.jerseyNumber = j;
	this.position = p;
    }

    /**
     * @return the name
     */
    public String getName() {
	return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
	this.name = name;
    }

    /**
     * @return the age
     */
    public String getAge() {
	return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(String age) {
	this.age = age;
    }

    /**
     * @return the jerseyNumber
     */
    public String getJerseyNumber() {
	return jerseyNumber;
    }

    /**
     * @param jerseyNumber the jerseyNumber to set
     */
    public void setJerseyNumber(String jerseyNumber) {
	this.jerseyNumber = jerseyNumber;
    }

    /**
     * @return the position
     */
    public String getPosition() {
	return position;
    }

    /**
     * @param position the position to set
     */
    public void setPosition(String position) {
	this.position = position;
    }

    @Override
    public String display() {
	return "\n\tName: " + getName() + "League: Junior Varsity " + "\n\tAge: " + getAge()
		+ "\n\tDesired Jersey Number: " + getJerseyNumber() + "\n\tDesred Position" + getPosition();
    }

}
