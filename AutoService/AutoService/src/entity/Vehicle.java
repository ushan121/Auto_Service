package entity;

public class Vehicle implements SuperEntity{
    private String Vnum;
    private String Model;
    private String Milage;
    private String YEAR;

    @Override
    public String toString() {
        return "Vehicle{" +
                "Vnum='" + Vnum + '\'' +
                ", Model='" + Model + '\'' +
                ", Milage='" + Milage + '\'' +
                ", YEAR='" + YEAR + '\'' +
                '}';
    }



    public Vehicle(String vnum, String model, String milage, String YEAR) {
        Vnum = vnum;
        Model = model;
        Milage = milage;
        this.YEAR = YEAR;
    }

    public Vehicle(String useCode, String code, String qty) {
    }



    public String getVnum() {
        return Vnum;
    }

    public void setVnum(String vnum) {
        Vnum = vnum;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public String getMilage() {
        return Milage;
    }

    public void setMilage(String milage) {
        Milage = milage;
    }

    public String getYEAR() {
        return YEAR;
    }

    public void setYEAR(String YEAR) {
        this.YEAR = YEAR;
    }
}
