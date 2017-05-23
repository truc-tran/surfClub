package edu.orangecoastcollege.cs272.ic14.model;

public class SurfClass {
	private int mID;
	private String mClass;
	private String mInstructor;
	private String mDay;
	private String mStartTime;
	private String mDuration;
	private double mCost;
	
	public SurfClass(int mID, String mClass, String mInstructor, String mDay, String mStartTime, String mDuration,
			double mCost) {
		super();
		this.mID = mID;
		this.mClass = mClass;
		this.mInstructor = mInstructor;
		this.mDay = mDay;
		this.mStartTime = mStartTime;
		this.mDuration = mDuration;
		this.mCost = mCost;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((mClass == null) ? 0 : mClass.hashCode());
		long temp;
		temp = Double.doubleToLongBits(mCost);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((mDay == null) ? 0 : mDay.hashCode());
		result = prime * result + ((mDuration == null) ? 0 : mDuration.hashCode());
		result = prime * result + mID;
		result = prime * result + ((mInstructor == null) ? 0 : mInstructor.hashCode());
		result = prime * result + ((mStartTime == null) ? 0 : mStartTime.hashCode());
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
		SurfClass other = (SurfClass) obj;
		if (mClass == null) {
			if (other.mClass != null)
				return false;
		} else if (!mClass.equals(other.mClass))
			return false;
		if (Double.doubleToLongBits(mCost) != Double.doubleToLongBits(other.mCost))
			return false;
		if (mDay == null) {
			if (other.mDay != null)
				return false;
		} else if (!mDay.equals(other.mDay))
			return false;
		if (mDuration == null) {
			if (other.mDuration != null)
				return false;
		} else if (!mDuration.equals(other.mDuration))
			return false;
		if (mID != other.mID)
			return false;
		if (mInstructor == null) {
			if (other.mInstructor != null)
				return false;
		} else if (!mInstructor.equals(other.mInstructor))
			return false;
		if (mStartTime == null) {
			if (other.mStartTime != null)
				return false;
		} else if (!mStartTime.equals(other.mStartTime))
			return false;
		return true;
	}

	public int getmID() {
		return mID;
	}

	public void setmID(int mID) {
		this.mID = mID;
	}

	public String getmClass() {
		return mClass;
	}

	public void setmClass(String mClass) {
		this.mClass = mClass;
	}

	public String getmInstructor() {
		return mInstructor;
	}

	public void setmInstructor(String mInstructor) {
		this.mInstructor = mInstructor;
	}

	public String getmDay() {
		return mDay;
	}

	public void setmDay(String mDay) {
		this.mDay = mDay;
	}

	public String getmStartTime() {
		return mStartTime;
	}

	public void setmStartTime(String mStartTime) {
		this.mStartTime = mStartTime;
	}

	public String getmDuration() {
		return mDuration;
	}

	public void setmDuration(String mDuration) {
		this.mDuration = mDuration;
	}

	public double getmCost() {
		return mCost;
	}

	public void setmCost(double mCost) {
		this.mCost = mCost;
	}

	@Override
	public String toString() {
		return "Class [Class=" + mClass + ", Instructor=" + mInstructor + ", Day=" + mDay + ", StartTime="
				+ mStartTime + ", Duration=" + mDuration + ", Cost=" + mCost + " $]";
	}

	
	
	
	
	
	
	
	
}
