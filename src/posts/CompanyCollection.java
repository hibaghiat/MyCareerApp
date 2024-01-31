package posts;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class CompanyCollection {
    private List<Company> companiesList;

    public CompanyCollection() {
        this.companiesList = new LinkedList<>();
    }

    public void addCompany(Company company) {
        this.companiesList.add(company);
    }

    public Company getCompany(String name) {
        for (Company company : this.companiesList) {
            if (company.getName().equals(name)) {
                return company;
            }
        }
        return null;
    }

    public void removeCompany(String name) {
        Company companyToRemove = null;
        for (Company company : this.companiesList) {
            if (company.getName().equals(name)) {
                companyToRemove = company;
                break;
            }
        }
        if (companyToRemove != null) {
            this.companiesList.remove(companyToRemove);
        }
    }

    public List<Company> getCompaniesList() {
        return this.companiesList;
    }

    public void sortByName() {
        Collections.sort(this.companiesList, new Comparator<Company>() {
            @Override
            public int compare(Company c1, Company c2) {
                return c1.getName().compareTo(c2.getName());
            }
        });
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CompanyCollection:\n");
        for (Company company : this.companiesList) {
            sb.append(company.toString()).append("\n");
        }
        return sb.toString();
    }
}