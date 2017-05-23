package edu.orangecoastcollege.cs272.ic14.model;

public class CashFlow {
	private int mID;
	private String mYear;
	private String mMonth;
	private double mRent;
	private double mWage;
	private double mSupply;
	private double mTax;
	private double mTotal;
	private double mSale;
	private double mProfit;
	public CashFlow(int mID, String mYear, String mMonth, double mRent, double mWage, double mSupply, double mTax,
			double mTotal, double mSale, double mProfit) {
		super();
		this.mID = mID;
		this.mYear = mYear;
		this.mMonth = mMonth;
		this.mRent = mRent;
		this.mWage = mWage;
		this.mSupply = mSupply;
		this.mTax = mTax;
		this.mTotal = mTotal;
		this.mSale = mSale;
		this.mProfit = mProfit;
	}
	
	
	public int getmID() {
		return mID;
	}


	public void setmID(int mID) {
		this.mID = mID;
	}


	public String getmYear() {
		return mYear;
	}


	public void setmYear(String mYear) {
		this.mYear = mYear;
	}


	public String getmMonth() {
		return mMonth;
	}


	public void setmMonth(String mMonth) {
		this.mMonth = mMonth;
	}


	public double getmRent() {
		return mRent;
	}


	public void setmRent(double mRent) {
		this.mRent = mRent;
	}


	public double getmWage() {
		return mWage;
	}


	public void setmWage(double mWage) {
		this.mWage = mWage;
	}


	public double getmSupply() {
		return mSupply;
	}


	public void setmSupply(double mSupply) {
		this.mSupply = mSupply;
	}


	public double getmTax() {
		return mTax;
	}


	public void setmTax(double mTax) {
		this.mTax = mTax;
	}


	public double getmTotal() {
		return mTotal;
	}


	public void setmTotal(double mTotal) {
		this.mTotal = mTotal;
	}


	public double getmSale() {
		return mSale;
	}


	public void setmSale(double mSale) {
		this.mSale = mSale;
	}


	public double getmProfit() {
		return mProfit;
	}


	public void setmProfit(double mProfit) {
		this.mProfit = mProfit;
	}

	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + mID;
		result = prime * result + ((mMonth == null) ? 0 : mMonth.hashCode());
		long temp;
		temp = Double.doubleToLongBits(mProfit);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(mRent);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(mSale);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(mSupply);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(mTax);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(mTotal);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(mWage);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((mYear == null) ? 0 : mYear.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CashFlow other = (CashFlow) obj;
		if (mID != other.mID)
			return false;
		if (mMonth == null) {
			if (other.mMonth != null)
				return false;
		} else if (!mMonth.equals(other.mMonth))
			return false;
		if (Double.doubleToLongBits(mProfit) != Double.doubleToLongBits(other.mProfit))
			return false;
		if (Double.doubleToLongBits(mRent) != Double.doubleToLongBits(other.mRent))
			return false;
		if (Double.doubleToLongBits(mSale) != Double.doubleToLongBits(other.mSale))
			return false;
		if (Double.doubleToLongBits(mSupply) != Double.doubleToLongBits(other.mSupply))
			return false;
		if (Double.doubleToLongBits(mTax) != Double.doubleToLongBits(other.mTax))
			return false;
		if (Double.doubleToLongBits(mTotal) != Double.doubleToLongBits(other.mTotal))
			return false;
		if (Double.doubleToLongBits(mWage) != Double.doubleToLongBits(other.mWage))
			return false;
		if (mYear == null) {
			if (other.mYear != null)
				return false;
		} else if (!mYear.equals(other.mYear))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "CashFlow [Year=" + mYear + ", Month=" + mMonth + ", Rent=" + mRent + "$, Wages Payable=" + mWage
				+ "$, Supplies=" + mSupply + "$, Tax=" + mTax + "$, Total Expenses=" + mTotal + "$, Sale=" + mSale + "$, Profit="
				+ mProfit + "$]";
	}
	
	
	

}
