package edu.orangecoastcollege.cs272.ic14.model;

public class Member {
	private int mID;
	private String mFirstName;
	private String mLastName;
	private String mBirthday;
	private String mPhone;
	private String mAddress;
	private String mCity;
	private String mState;
	private String mZipcode;
	
	public Member(int mID, String mFirstName, String mLastName, String mBirthday, String mPhone, String mAddress,
			String mCity, String mState, String mZipcode) {
		super();
		this.mID = mID;
		this.mFirstName = mFirstName;
		this.mLastName = mLastName;
		this.mBirthday = mBirthday;
		this.mPhone = mPhone;
		this.mAddress = mAddress;
		this.mCity = mCity;
		this.mState = mState;
		this.mZipcode = mZipcode;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((mAddress == null) ? 0 : mAddress.hashCode());
		result = prime * result + ((mBirthday == null) ? 0 : mBirthday.hashCode());
		result = prime * result + ((mCity == null) ? 0 : mCity.hashCode());
		result = prime * result + ((mFirstName == null) ? 0 : mFirstName.hashCode());
		result = prime * result + mID;
		result = prime * result + ((mLastName == null) ? 0 : mLastName.hashCode());
		result = prime * result + ((mPhone == null) ? 0 : mPhone.hashCode());
		result = prime * result + ((mState == null) ? 0 : mState.hashCode());
		result = prime * result + ((mZipcode == null) ? 0 : mZipcode.hashCode());
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
		Member other = (Member) obj;
		if (mAddress == null) {
			if (other.mAddress != null)
				return false;
		} else if (!mAddress.equals(other.mAddress))
			return false;
		if (mBirthday == null) {
			if (other.mBirthday != null)
				return false;
		} else if (!mBirthday.equals(other.mBirthday))
			return false;
		if (mCity == null) {
			if (other.mCity != null)
				return false;
		} else if (!mCity.equals(other.mCity))
			return false;
		if (mFirstName == null) {
			if (other.mFirstName != null)
				return false;
		} else if (!mFirstName.equals(other.mFirstName))
			return false;
		if (mID != other.mID)
			return false;
		if (mLastName == null) {
			if (other.mLastName != null)
				return false;
		} else if (!mLastName.equals(other.mLastName))
			return false;
		if (mPhone == null) {
			if (other.mPhone != null)
				return false;
		} else if (!mPhone.equals(other.mPhone))
			return false;
		if (mState == null) {
			if (other.mState != null)
				return false;
		} else if (!mState.equals(other.mState))
			return false;
		if (mZipcode == null) {
			if (other.mZipcode != null)
				return false;
		} else if (!mZipcode.equals(other.mZipcode))
			return false;
		return true;
	}
	public int getID() {
		return mID;
	}
	public void setID(int mID) {
		this.mID = mID;
	}
	public String getFirstName() {
		return mFirstName;
	}
	public void setFirstName(String mFirstName) {
		this.mFirstName = mFirstName;
	}
	public String getLastName() {
		return mLastName;
	}
	public void setLastName(String mLastName) {
		this.mLastName = mLastName;
	}
	public String getBirthday() {
		return mBirthday;
	}
	public void setBirthday(String mBirthday) {
		this.mBirthday = mBirthday;
	}
	public String getPhone() {
		return mPhone;
	}
	public void setPhone(String mPhone) {
		this.mPhone = mPhone;
	}
	public String getAddress() {
		return mAddress;
	}
	public void setAddress(String mAddress) {
		this.mAddress = mAddress;
	}
	public String getCity() {
		return mCity;
	}
	public void setCity(String mCity) {
		this.mCity = mCity;
	}
	public String getState() {
		return mState;
	}
	public void setState(String mState) {
		this.mState = mState;
	}
	public String getZipcode() {
		return mZipcode;
	}
	public void setZipcode(String mZipcode) {
		this.mZipcode = mZipcode;
	}
	@Override
	public String toString() {
		return "Member [FirstName=" + mFirstName + ", LastName=" + mLastName + ", Birthday="
				+ mBirthday + ", Phone=" + mPhone + ", Address=" + mAddress + ", City=" + mCity + ", State="
				+ mState + ", Zipcode=" + mZipcode + "]";
	}
	
	

	
	
}
