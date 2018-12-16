package com.lab.springboot.steps;

public class Loan {
    long id;
    String person;
    String loantype;

    public Loan(long id, String person, String loantype) {
        this.id = id;
        this.person = person;
        this.loantype = loantype;
    }

    public long getId() {
        return id;
    }

    public String getPerson() {
        return person;
    }

    public String getLoantype() {
        return loantype;
    }

    @Override
    public String toString() {
        return "Loan{" +
                "id=" + id +
                ", person='" + person + '\'' +
                ", loantype='" + loantype + '\'' +
                '}';
    }
}
