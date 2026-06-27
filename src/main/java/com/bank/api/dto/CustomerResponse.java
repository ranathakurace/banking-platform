/*
 * =========================================================
 * Story ID   : STORY-001
 * Module     : Customer Management
 * Class      : CustomerResponse
 *
 * Purpose
 * -------
 * Represents the response returned after customer
 * registration.
 *
 * Business Notes
 * --------------
 * Sensitive information like PAN, Aadhaar and Phone Number
 * are intentionally excluded from the response for security
 * and privacy reasons.
 * =========================================================
 */

package com.bank.api.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerResponse {

    /** Bank Generated Customer Number */
    private String customerNumber;

    /** Customer Name */
    private String fullName;

    /** Current Customer Status */
    private String customerStatus;

    /** Current KYC Status */
    private String kycStatus;

    /** Response Message */
    private String message;

}