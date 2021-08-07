package bankaccountapp;
import java.sql.*; 

public interface IBaseRate {
	
	// Return the base rate
	default double getBaseRate() {
		return 2.5;
	}
	
}
