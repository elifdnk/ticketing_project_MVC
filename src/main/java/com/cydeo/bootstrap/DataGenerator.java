package com.cydeo.bootstrap;

import com.cydeo.dto.RoleDTO;
import com.cydeo.dto.UserDTO;
import com.cydeo.enums.Gender;
import com.cydeo.service.RoleService;
import com.cydeo.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataGenerator implements CommandLineRunner {

    private final RoleService roleService;
    private final UserService userService;

    public DataGenerator(RoleService roleService, UserService userService) {
        this.roleService = roleService;
        this.userService = userService;
    }


    @Override
    public void run(String... args) throws Exception {
        RoleDTO adminRole = new RoleDTO(1L,"Admin");
        RoleDTO managerRole = new RoleDTO(2L,"Manager");
        RoleDTO employeeRole = new RoleDTO(3L,"Employee");


        roleService.save(adminRole);
        roleService.save(managerRole);
        roleService.save(employeeRole);

        UserDTO user1 = new UserDTO("John", "Kesy","7459684532","Abc1","john@cydeo.com",managerRole,true,Gender.MALE);
        UserDTO user2 = new UserDTO("Mike", "Smith","8759684532","Abc2","mike@cydeo.com",adminRole,true,Gender.MALE);
        UserDTO user3 = new UserDTO("Craig", "Jark","9959684532","Abc3","craig@cydeo.com",managerRole,true,Gender.MALE);
        UserDTO user4 = new UserDTO("Shaun", "Hayms","1119684532","Abc4","shaun@cydeo.com",managerRole,true,Gender.MALE);
        UserDTO user5 = new UserDTO("Elizabeth", "Loren","1475884596","Abc5","elizabeth@cydeo.com",employeeRole,true,Gender.FEMALE);
        UserDTO user6 = new UserDTO("Maria", "Ada","9659684145","Abc6","maria@cydeo.com",employeeRole,true,Gender.FEMALE);
        UserDTO user7 = new UserDTO("Bill", "Matt","7896542389","Abc7","bill@cydeo.com",employeeRole,true,Gender.MALE);
        UserDTO user8 = new UserDTO("Delisa", "Norre","8569684532","Abc8","delisa@cydeo.com",managerRole,true,Gender.MALE);

        userService.save(user1);
        userService.save(user2);
        userService.save(user3);
        userService.save(user4);
        userService.save(user5);
        userService.save(user6);
        userService.save(user7);
        userService.save(user8);



    }
}
