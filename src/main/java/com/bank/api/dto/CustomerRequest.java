/*
 * =========================================================
 * Story ID   : STORY-001
 * Module     : Customer Management
 * Class      : CustomerRequest
 *
 * Purpose
 * -------
 * Represents the customer registration request received
 * from external channels such as:
 *  - Internet Banking
 *  - Mobile Banking
 *  - Branch Application
 *  - API Gateway
 *
 * Business Notes
 * --------------
 * Only customer-provided information is accepted here.
 * System-generated fields like Customer Number, Risk Score,
 * KYC Status, Created Date, etc. are never accepted from
 * external users.
 * =========================================================
 */

package com.bank.api.dto;

import java.time.LocalDate;

import lombok.Data;

@Data
public class CustomerRequest {

    /** Customer Full Name */
    private String fullName;
   
    /** Email Address */
    private String email;

    /** Mobile Number */
    private String phone;

    /** PAN Number */
    private String pan;

    /** Aadhaar Number */
    private String aadhaar;

    /** Date of Birth */
    private LocalDate dob;

}