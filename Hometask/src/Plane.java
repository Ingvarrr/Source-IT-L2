/**
 * Created by vig on 10/6/16.
 */
public class HT_Plane {
    public static void main(String[] args) {
        HT_Plane su27 = new HT_Plane();
        su27.setName("SU-27");
        su27.setPurpose("Military");
        su27.setSpeed("1400");
        HT_Plane an178 = new HT_Plane();
        an178.setName("AN-178");
        an178.setPurpose("Civilian");
        an178.setSpeed("825");
        System.out.println(an178.getSpeed());

    }
    private String name;
    private String purpose;
    private String speed;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }
}