package demo1_payroll.assignment;

import java.util.Date;

public interface PaymentSchedule {
	public boolean isPayDate(Date date);
	public Date getPayPeriodStartDate(Date payPeriodEndDate);
}
