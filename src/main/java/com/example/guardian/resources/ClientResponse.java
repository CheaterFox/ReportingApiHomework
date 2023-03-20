package com.example.guardian.resources;

import lombok.Data;
import java.io.Serializable;

@Data
public class ClientResponse implements Serializable {

    private static final long serialVersionUID = -5273432257972465964L;

    private int id;
    private String created_at;
    private String updated_at;
    private String deleted_at;
    private String number;
    private String expiryMonth;
    private String expiryYear;
    private String startMonth;
    private String startYear;
    private String issueNumber;
    private String email;
    private String birthday;
    private String gender;
    private String billingTitle;
    private String billingFirstName;
    private String billingLastName;
    private String billingCompany;
    private String billingAddress1;
    private String billingAddress2;
    private String billingCity;
    private String billingPostcode;
    private String billingState;
    private String billingCountry;
    private String billingPhone;
    private String billingFax;
    private String shippingTitle;
    private String shippingFirstName;
    private String shippingLastName;
    private String shippingCompany;
    private String shippingAddress1;
    private String shippingAddress2;
    private String shippingCity;
    private String shippingPostcode;
    private String shippingState;
    private String shippingCountry;
    private String shippingPhone;
    private String shippingFax;
    private String token;

    public ClientResponse(int id, String created_at, String updated_at, String deleted_at, String number, String expiryMonth, String expiryYear, String startMonth, String startYear, String issueNumber, String email, String birthday, String gender, String billingTitle, String billingFirstName, String billingLastName, String billingCompany, String billingAddress1, String billingAddress2, String billingCity, String billingPostcode, String billingState, String billingCountry, String billingPhone, String billingFax, String shippingTitle, String shippingFirstName, String shippingLastName, String shippingCompany, String shippingAddress1, String shippingAddress2, String shippingCity, String shippingPostcode, String shippingState, String shippingCountry, String shippingPhone, String shippingFax, String token) {
        this.id = id;
        this.created_at = created_at;
        this.updated_at = updated_at;
        this.deleted_at = deleted_at;
        this.number = number;
        this.expiryMonth = expiryMonth;
        this.expiryYear = expiryYear;
        this.startMonth = startMonth;
        this.startYear = startYear;
        this.issueNumber = issueNumber;
        this.email = email;
        this.birthday = birthday;
        this.gender = gender;
        this.billingTitle = billingTitle;
        this.billingFirstName = billingFirstName;
        this.billingLastName = billingLastName;
        this.billingCompany = billingCompany;
        this.billingAddress1 = billingAddress1;
        this.billingAddress2 = billingAddress2;
        this.billingCity = billingCity;
        this.billingPostcode = billingPostcode;
        this.billingState = billingState;
        this.billingCountry = billingCountry;
        this.billingPhone = billingPhone;
        this.billingFax = billingFax;
        this.shippingTitle = shippingTitle;
        this.shippingFirstName = shippingFirstName;
        this.shippingLastName = shippingLastName;
        this.shippingCompany = shippingCompany;
        this.shippingAddress1 = shippingAddress1;
        this.shippingAddress2 = shippingAddress2;
        this.shippingCity = shippingCity;
        this.shippingPostcode = shippingPostcode;
        this.shippingState = shippingState;
        this.shippingCountry = shippingCountry;
        this.shippingPhone = shippingPhone;
        this.shippingFax = shippingFax;
        this.token = token;
    }

    @Override
    public String toString() {
        return "ClientResponse{" +
                "id=" + id +
                ", created_at='" + created_at + '\'' +
                ", updated_at='" + updated_at + '\'' +
                ", deleted_at='" + deleted_at + '\'' +
                ", number='" + number + '\'' +
                ", expiryMonth='" + expiryMonth + '\'' +
                ", expiryYear='" + expiryYear + '\'' +
                ", startMonth='" + startMonth + '\'' +
                ", startYear='" + startYear + '\'' +
                ", issueNumber='" + issueNumber + '\'' +
                ", email='" + email + '\'' +
                ", birthday='" + birthday + '\'' +
                ", gender='" + gender + '\'' +
                ", billingTitle='" + billingTitle + '\'' +
                ", billingFirstName='" + billingFirstName + '\'' +
                ", billingLastName='" + billingLastName + '\'' +
                ", billingCompany='" + billingCompany + '\'' +
                ", billingAddress1='" + billingAddress1 + '\'' +
                ", billingAddress2='" + billingAddress2 + '\'' +
                ", billingCity='" + billingCity + '\'' +
                ", billingPostcode='" + billingPostcode + '\'' +
                ", billingState='" + billingState + '\'' +
                ", billingCountry='" + billingCountry + '\'' +
                ", billingPhone='" + billingPhone + '\'' +
                ", billingFax='" + billingFax + '\'' +
                ", shippingTitle='" + shippingTitle + '\'' +
                ", shippingFirstName='" + shippingFirstName + '\'' +
                ", shippingLastName='" + shippingLastName + '\'' +
                ", shippingCompany='" + shippingCompany + '\'' +
                ", shippingAddress1='" + shippingAddress1 + '\'' +
                ", shippingAddress2='" + shippingAddress2 + '\'' +
                ", shippingCity='" + shippingCity + '\'' +
                ", shippingPostcode='" + shippingPostcode + '\'' +
                ", shippingState='" + shippingState + '\'' +
                ", shippingCountry='" + shippingCountry + '\'' +
                ", shippingPhone='" + shippingPhone + '\'' +
                ", shippingFax='" + shippingFax + '\'' +
                ", token='" + token + '\'' +
                '}';
    }
}
