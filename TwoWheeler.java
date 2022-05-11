package week1.day2;

public class TwoWheeler {
	
	int noOfWheel = 2;
	short noofMirrors = 2;
	long chasisNumber = 12345678;
	boolean isPunctured = false;
	String bikeName ="Nsf";
	double runningKM = 289.12345;
	
public static void main(String[] args) {
	TwoWheeler tw = new TwoWheeler();
	
	System.out.println(tw.noOfWheel);
	System.out.println("noofMirrors :"+tw.noofMirrors);
 	System.out.println("chasisNumber :"+tw.chasisNumber);
 	System.out.println("isPunctured :"+tw.isPunctured);
 	System.out.println("bikeName :"+tw.bikeName);
 	System.out.println("double :"+tw.runningKM);

}
}
