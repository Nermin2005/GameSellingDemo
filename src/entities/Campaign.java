package entities;

public class Campaign {
    private String name;
    private String about;
    private int fee;

    public Campaign(String name, String about, int fee) {
        this.name = name;
        this.about = about;
        this.fee = fee;
    }
    public Campaign() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public int getFee() {
        return fee;
    }

    public void setFee(int fee) {
        this.fee = fee;
    }
}
