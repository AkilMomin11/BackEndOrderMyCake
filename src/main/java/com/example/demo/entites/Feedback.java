package com.example.demo.entites;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="feedback")
public class Feedback {
	
		@Id
		@GeneratedValue( strategy = GenerationType.IDENTITY)
		int feedbackid;
		
		int rating;
		String comment;
		
		@ManyToOne
		@JoinColumn(name="customerid")
		Customer fcustomerid;
		
		@ManyToOne
		@JoinColumn(name="vendorid")
		Vendor fvendorid;
		
		@ManyToOne
		@JoinColumn(name="productid")
		Product fproductid;
		
		

		public Feedback() {
			super();
			// TODO Auto-generated constructor stub
		}



		public Feedback( int rating, String comment, Customer fcustomerid, Vendor fvendorid,
				Product fproductid) {
			super();
			this.rating = rating;
			this.comment = comment;
			this.fcustomerid = fcustomerid;
			this.fvendorid = fvendorid;
			this.fproductid = fproductid;
		}



		public int getFeedbackid() {
			return feedbackid;
		}



		public void setFeedbackid(int feedbackid) {
			this.feedbackid = feedbackid;
		}



		public int getRating() {
			return rating;
		}



		public void setRating(int rating) {
			this.rating = rating;
		}



		public String getComment() {
			return comment;
		}



		public void setComment(String comment) {
			this.comment = comment;
		}



		public Customer getFcustomerid() {
			return fcustomerid;
		}



		public void setFcustomerid(Customer fcustomerid) {
			this.fcustomerid = fcustomerid;
		}



		public Vendor getFvendorid() {
			return fvendorid;
		}



		public void setFvendorid(Vendor fvendorid) {
			this.fvendorid = fvendorid;
		}



		public Product getFproductid() {
			return fproductid;
		}



		public void setFproductid(Product fproductid) {
			this.fproductid = fproductid;
		}
		
		

		
		


		


		


		
		
		
		
}
