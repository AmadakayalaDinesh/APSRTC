package com.bb.MVC.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
@Entity
@Table(name ="APSRTC-BOOK")
@Data
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
public class ApsrtcEntity extends Exception {
	
@SequenceGenerator(name ="gen",initialValue = 12456,sequenceName ="bustktno",allocationSize = 1)
@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "gen")
@Id
 private Integer ticketNo;

   @Column(length = 30)
	@NonNull
  private String UserName;
	@NonNull
  private Long phno;
	@NonNull
	 @Column(length = 30)
  private String mailid;
	 @Column(length = 30)
  private String travelDate;
	 @Column(length = 30)
  private String userFrom;
	 @Column(length = 30)
  private String userTo;

}
