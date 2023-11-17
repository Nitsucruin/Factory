package factorypatterns;

public class Laptop implements Computer {
	
	    private Integer noOfPCBuild;

	    public Integer getNoOfLives() {
	        return noOfPCBuild;
	    }

	    public void setNoOfLives(Integer noOfPCBuild) {
	        this.noOfPCBuild = noOfPCBuild;
	    }
	    public String createComputer() {
	        return "Computer is being Build";
	    }

	    public String open() {
	        return "Welcome User";
	    }
	}
