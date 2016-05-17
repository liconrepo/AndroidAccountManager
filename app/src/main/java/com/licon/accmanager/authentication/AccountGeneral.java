package com.licon.accmanager.authentication;

public class AccountGeneral {

    /**
     * Account type id
     */
    public static final String ACCOUNT_TYPE = "com.licon.accmanager";

    /**
     * Account name
     */
    public static final String ACCOUNT_NAME = "licon";

    /**
     * Auth token types
     */
    public static final String AUTHTOKEN_TYPE_READ_ONLY = "Read only";
    public static final String AUTHTOKEN_TYPE_READ_ONLY_LABEL = "Read only access to an licon account";

    public static final String AUTHTOKEN_TYPE_FULL_ACCESS = "Full access";
    public static final String AUTHTOKEN_TYPE_FULL_ACCESS_LABEL = "Full access to an licon account";

    public static final ServerAuthenticate sServerAuthenticate = new ParseComServerAuthenticate();
}