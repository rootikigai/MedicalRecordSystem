import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AutomatedTellerMachineTest {
	private AutomatedTellerMachine atm = new AutomatedTellerMachine();
	private Account johnsAccount;
	private Account jamesAccount;
	private Account bolajiAccount;
	
	@BeforeEach
	public void setUp() {
		//pre-condition(s)

		johnsAccount = new Account("John", "0123456789", 50.00);
		
		jamesAccount = new Account("James", "9876543210", 50000.00);
		
		bolajiAccount = new Account("Bolaji", "9786543210", 500.00);
		
		Account[] accounts = {johnsAccount, jamesAccount, bolajiAccount};
		
		atm.setAccounts(accounts);	
	}

	@Test
	public void testCanWithdrawFunds() {
	
		//action
		atm.withdraw(jamesAccount.getAccountNumber(), 20000);
		
		//check(s)
		assertEquals(30000, jamesAccount.getBalance());
	}
}