/**
 * @author user
 *
 */

public class Raum
{
	//Attribute
	private short raumID;
		
	private	String raumNr;
	private	short sitze;
	private	boolean labor;
	private	boolean beamer;
	private	boolean whiteboard;
	private	boolean polylux;
	private	boolean computer;
	
	// getter
	public short get_raumID()
	{
		return this.raumID;
	}
	public String get_raumNr()
	{
		return this.raumNr;
	}
	public short get_sitze()
	{
		return this.sitze;
	}
	public boolean get_labor()
	{
		return this.labor;
	}
	public boolean get_beamer()
	{
		return this.beamer;
	}
	public boolean get_whiteboeard()
	{
		return this.whiteboard;
	}
	public boolean get_polylux()
	{
		return this.polylux;
	}
	public boolean get_computer()
	{
		return this.computer;
	}
	
	// setter
	public void set_raumID(short raumID)
	{
		this.raumID = raumID;
	}
	public void set_raumNr(String raumNr)
	{
		this.raumNr = raumNr;
	}
	public void set_sitze(short sitze)
	{
		this.sitze = sitze;
	}
	public void set_labor(boolean labor)
	{
		this.labor = labor;
	}
	public void set_beamer(boolean beamer)
	{
		this.beamer = beamer;
	}
	public void set_whiteboard(boolean whiteboard)
	{
		this.whiteboard = whiteboard;
	}
	public void set_polylux(boolean polylux)
	{
		this.polylux = polylux;
	}
	public void set_computer(boolean computer)
	{
		this.computer = computer;
	}
	
	// Klassenmethoden
	public Raum()
	{
		
	}
	
	// Methoden
	public void editRaum(String raumNr, short sitze, boolean labor, boolean beamer, boolean whiteboard, boolean polylux, boolean computer)
	{
		boolean checkRaum 	= false;
		
		if( !( checkRaumNr(raumNr) ) ) // wird ausgeführt, wenn noch kein Raum mit dieser Nummer existiert
		{
			set_raumNr(raumNr);
			set_sitze(sitze);
			set_labor(labor);
			set_beamer(beamer);
			set_whiteboard(whiteboard);
			set_polylux(polylux);
			set_computer(computer);
		}
	}
	
	public boolean checkRaumNr(String raumNr)
	{
		//DB.checkRaumNr(raumNr)
		return true;
	}
}
