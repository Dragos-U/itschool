package org.session12.homework.humanresources;

import java.util.List;

public class Team {

    private Employee teamLead;
    private List<Employee> teamMembers;

    public Employee getTeamLead() {
        return teamLead;
    }

    public void setTeamLead(Employee teamLead) {
        this.teamLead = teamLead;
    }

    public List<Employee> getTeamMembers() {
        return teamMembers;
    }

    public void setTeamMembers(List<Employee> teamMembers) {
        this.teamMembers = teamMembers;
    }

    @Override
    public String toString() {
        return "Team : " +
                "leader = " + teamLead +
                ", members = [" + teamMembers + " ]";
    }
}
