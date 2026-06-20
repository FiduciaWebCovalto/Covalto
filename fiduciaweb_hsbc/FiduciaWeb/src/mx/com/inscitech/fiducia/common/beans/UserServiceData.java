package mx.com.inscitech.fiducia.common.beans;

import java.util.ArrayList;
import java.util.List;

public class UserServiceData {

    private UsersInformation usersInformation;
    private List<Company> companies;
    private List<String> userFunctions;

    public UserServiceData(UsersInformation usersInformation, Company company) {
        this.usersInformation = usersInformation;
        this.companies = new ArrayList<>();
        this.userFunctions = new ArrayList<>();
        companies.add(company);
    }

    public UserServiceData(UsersInformation usersInformation, List<Company> companies) {
        this.usersInformation = usersInformation;
        this.userFunctions = new ArrayList<>();
        this.companies = companies;
    }

    public UserServiceData(UsersInformation usersInformation, List<Company> companies, List<String> userFunctions) {
        this.usersInformation = usersInformation;
        this.companies = companies;
        this.userFunctions = userFunctions;
    }

    public void setUsersInformation(UsersInformation usersInformation) {
        this.usersInformation = usersInformation;
    }

    public UsersInformation getUsersInformation() {
        return usersInformation;
    }

    public void setCompanies(List<Company> companies) {
        this.companies = companies;
    }

    public List<Company> getCompanies() {
        return companies;
    }

    public void addCompany(Company company) {
        companies.add(company);
    }

    public void setUserFunctions(List<String> userFunctions) {
        this.userFunctions = userFunctions;
    }

    public List<String> getUserFunctions() {
        return userFunctions;
    }

    public void addUserFunction(String function) {
        if(userFunctions == null) userFunctions = new ArrayList<>();
        userFunctions.add(function);
    }

}
