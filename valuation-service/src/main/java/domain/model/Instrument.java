package domain.model;

import java.math.BigDecimal;
import java.util.Date;

import lombok.Data;

/**
 * This class duplicates (to a certain extent) the model of the instrument service on purpose.
 * The objective being to loosen the coupling between the services.
 * 
 * @author Steve.Hostettler
 *
 */
@Data
public class Instrument {

	private String id;

	private String brokerLei;

	private String counterpartyLei;

	private String originalCurrency;

	private BigDecimal amountInOriginalCurrency;

	private Date dealDate;

	private Date valueDate;
	
	private BigDecimal strikeAmount;
	
	private String direction;
	
	private INSTRUMENT_TYPE instrumentType;
	
	public enum INSTRUMENT_TYPE {
		STOCK ("S", "Stock"),
		LOAN ("L", "Loan"),
		BOND ("B", "Loan"),
		DEPOSIT ("D", "Deposit"),
		WARRANT ("W", "Warrant");
		
		private String code;
		private String description;
		INSTRUMENT_TYPE(String code, String description) {
			this.code = code;
			this.description = description;
		}
		
		public String getCode() {
			return code;
		}
		public String getDescription() {
			return description;
		}
	}

}
