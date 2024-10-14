package com.loose.coupling;

public class UserDatabaseProivder implements UserDataProvider {

    @Override
    public String getUserDtails() {
        return "User Details From Database";
    }
}
