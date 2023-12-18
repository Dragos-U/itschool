package org.session9oop.homework.fitnesstrackingsystem;

public class FitnessTrackingSystem {

    public static void main(String[] args) {
        User user1 = new User("John", 30);

        Workout running1 = new Workout("running",60, 10, 0);
        Workout running2 = new Workout("running",120, 20, 0);
        Workout yoga = new Workout("yoga", 30, 0,0);
        Workout weightLifting = new Workout("weightLifting", 60,0,50);

        user1.setWeeklyGoal("running", 10.0);
        user1.setWeeklyGoal("yoga", 50.0);
        user1.setWeeklyGoal("weightLifting",60.0);

        user1.addWorkout(running1);
        user1.addWorkout(running2);
        user1.addWorkout(yoga);
        user1.addWorkout(weightLifting);

        user1.generateWeeklyReport();
        user1.checkGoals();
    }
}
