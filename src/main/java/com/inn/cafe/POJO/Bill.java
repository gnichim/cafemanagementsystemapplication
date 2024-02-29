package com.inn.cafe.POJO;

import lombok.Data;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.io.Serializable;

@Data // provides constructor, getter and setter
@Entity
@DynamicUpdate
@DynamicInsert
@Table(name = "bill")
public class Bill implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id // To tell hibernate that this is the ID
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "uuid")
    private String uuid;

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;

    @Column(name = "contactnumber") // If we type "contactNumber" here it will be stored as "contact_number" in the Database
    private String contactNumber;

    @Column(name = "paymentmethod") // If we type "paymentMethod" here it will be stored as "payment_method" in the Database
    private String paymentMethod;

    @Column(name = "total")
    private Integer total;

    // We want to store all the products which I have purchased into the database, for that we are storing that into a form of json array
    @Column(name = "productdetails",columnDefinition = "json")
    private String productDetails;

    // this column is for the user who have created this, or who have generated this bill
    @Column(name = "createdby")
    private String createdBy;
}
