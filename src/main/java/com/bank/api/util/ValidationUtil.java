package com.bank.api.util;

public class ValidationUtil {

    private ValidationUtil() {
    }

    // Full Name
    public static final String NAME_REGEX =
            "^[A-Za-z ]{3,100}$";

    // Email
    public static final String EMAIL_REGEX =
            "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";

    // Mobile Number
    public static final String PHONE_REGEX =
            "^[6-9][0-9]{9}$";

    // PAN
    public static final String PAN_REGEX =
            "^[A-Z]{5}[0-9]{4}[A-Z]{1}$";

    // Aadhaar
    public static final String AADHAAR_REGEX =
            "^[0-9]{12}$";

}