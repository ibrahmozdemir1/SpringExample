package com.loose.coupling;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LooseCouplingIoCExample {
    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationIoCLooseCouplingExample.xml");

        //UserDataProvider databaseProivder = new UserDatabaseProivder();
        //UserManager userManager = new UserManager(databaseProivder);

        UserManager userManager = (UserManager) context.getBean("userManagerWithUserDataProvider");
        System.out.println(userManager.getUserInfo()  );


      //  UserDataProvider databaseProivderWebService = new WebServiceProivder();
        //UserManager userManagerWebService = new UserManager(databaseProivderWebService);
        UserManager userManagerWebService = (UserManager) context.getBean("userManagerWithwebServiceDataProvider");

        System.out.println(userManagerWebService.getUserInfo()  );

    }
}
