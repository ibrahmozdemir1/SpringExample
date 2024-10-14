package com.loose.coupling;

public class LooseCouplingExample {
    public static void main(String[] args) {
        UserDataProvider databaseProivder = new UserDatabaseProivder();
        UserManager userManager = new UserManager(databaseProivder);

        System.out.println(userManager.getUserInfo()  );


        UserDataProvider databaseProivderWebService = new WebServiceProivder();
        UserManager userManagerWebService = new UserManager(databaseProivderWebService);

        System.out.println(userManagerWebService.getUserInfo()  );

    }
}
