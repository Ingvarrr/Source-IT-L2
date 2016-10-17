/**
 * Created by vig on 10/7/16.
 */
public class Main {
    public static void main(String[] args) {
        Plane su27 = new Plane();
        su27.setName("SU-27");
        su27.setPurpose("Military");
        su27.setSpeed("1400");
        Plane an178 = new Plane();
        an178.setName("AN-178");
        an178.setPurpose("Civilian");
        an178.setSpeed("825");
        System.out.println("AN-178 Top speed" +" " + "=" + " " + an178.getSpeed());
    }
}
