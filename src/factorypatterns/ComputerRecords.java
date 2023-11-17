package factorypatterns;

public class ComputerRecords {
	    private String computerId;
	    private String computerName;
	    private Computer comp;
	    private int storage;
	    private int RAM;

	    public String getcomputerId() {
	        return computerId;
	    }

	    public void setcomputerId(String computerId) {
	        this.computerId = computerId;
	    }

	    public String getcomputerName() {
	        return computerName;
	    }

	    public void setcomputerName(String computerName) {
	        this.computerName = computerName;
	    }

	    public int getStorage() {
	        return storage;
	    }

	    public void setStorage(int storage) {
	        this.storage = storage;
	    }

	    public int getRAM() {
	        return RAM;
	    }

	    public void setRAM(int ram) {
	        this.RAM = ram;
	    }
	    
	    
	    public Computer getcomp() {
	        return comp;
	    }

	    public void setcomp(Computer comp) {
	        this.comp = comp;
	    }
	    
	    
	}
