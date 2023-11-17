package factorypatterns;

public class DesktopComputer implements Computer {
	private String computerModel;
	private int RAM;
	private int storage;
    public String getModel() {
         return computerModel;
    }

    public void setModel(String computerModel) {
         this.computerModel = computerModel;
    }
    public int getRAM() {
        return RAM;
   }

   public void setRAM(int RAM) {
        this.RAM = RAM;
   }
   
   public int getstorage() {
       return storage;
  }

   public void setstorage(int storage) {
       this.storage = storage;
   }
    public String createComputer() {
        return "Computer is being Build";
    }

    public String open() {
        return "Welcome User";
    }
}
