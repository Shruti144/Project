package com.example.place_2;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class ShrutiPlacement {
	@Id
		private int placementId;
		private String placementName;
		private int date;
		private String qualification;
		private int year;
		
		public ShrutiPlacement() {
			super();
		}

		public ShrutiPlacement(int placementId, String placementName, int date, String qualification, int year) {
			super();
			this.placementId = placementId;
			this.placementName = placementName;
			this.date = date;
			this.qualification = qualification;
			this.year = year;
		}

		/**
		 * @return the placementId
		 */
		public long getPlacementId() {
			return placementId;
		}

		/**
		 * @param placementId the placementId to set
		 */
		public void setPlacementId(int placementId) {
			this.placementId = placementId;
		}

		/**
		 * @return the placementName
		 */
		public String getPlacementName() {
			return placementName;
		}

		/**
		 * @param placementName the placementName to set
		 */
		public void setPlacementName(String placementName) {
			this.placementName = placementName;
		}

		/**
		 * @return the date
		 */
		public int getDate() {
			return date;
		}

		/**
		 * @param date the date to set
		 */
		public void setDate(int date) {
			this.date = date;
		}

		/**
		 * @return the qualification
		 */
		public String getQualification() {
			return qualification;
		}

		/**
		 * @param qualification the qualification to set
		 */
		public void setQualification(String qualification) {
			this.qualification = qualification;
		}

		/**
		 * @return the year
		 */
		public int getYear() {
			return year;
		}

		/**
		 * @param year the year to set
		 */
		public void setYear(int year) {
			this.year = year;
		}

		@Override
		public String toString() {
			return "ShrutiPlacement [placementId=" + placementId + ", placementName=" + placementName + ", date=" + date
					+ ", qualification=" + qualification + ", year=" + year + "]";
		}
}

