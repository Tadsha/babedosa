package metier;

import java.util.Date;

public class Dancer extends Person {

	private String typeDance;
	private int timeOfwarmUp;
	private String salutations;
	private String msgToLeave;
	public boolean ready;
	
	public Dancer(String n, String fn, String a, int ag, String sp, String s){
		super (n, fn, a, ag, sp, s);
		timeOfwarmUp = 10;
		salutations = "Hello";
		msgToLeave = "Thank you !";
		ready = false;
	}
	
	public Dancer(String n, String fn, String a, int ag, String sp, String s, String t, int wu, String sa, String msg){
		super (n, fn, a, ag, sp, s);
		typeDance = t;
		timeOfwarmUp = wu;
		salutations = sa;
		msgToLeave = msg;
		ready = false;
	}
	
	public String getTypeDance() {
		return typeDance;
	}
	public void setTypeDance(String typeDance) {
		this.typeDance = typeDance;
	}
	public int getTimeOfwarmUp() {
		return timeOfwarmUp;
	}
	public void setTimeOfwarmUp(int timeOfwarmUp) {
		this.timeOfwarmUp = timeOfwarmUp;
	}
	public String getSalutations() {
		return salutations;
	}
	public void setSalutations(String salutations) {
		this.salutations = salutations;
	}
	public String getMsgToLeave() {
		return msgToLeave;
	}
	public void setMsgToLeave(String msgToLeave) {
		this.msgToLeave = msgToLeave;
	}
	
	public void Proceedings(){
		Salutation();
		WarmUp();
		MsgtoLeave();		
	}
	
    public void Salutation(){
    	System.out.println(salutations);
    }
    
	public void WarmUp()
    {
	    Date date = new Date();
	    long timeMilli = date.getTime(), time2;
	    do
	    {
	    	date = new Date();
	    	time2 = date.getTime(); 
	    	System.out.print("Echauffement ");
	    }
	    while( (time2 -timeOfwarmUp) < timeMilli) ;
	    ready = true;
    }
	
	public void MsgtoLeave(){
		System.out.println(msgToLeave);
	}	
}
