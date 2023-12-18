package org.session9oop.homework.fitnesstrackingsystem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class User {

    private final String RUNNING = "running";
    private final String YOGA = "yoga";
    private final String WEIGHT_LIFTING = "weightLifting";
    private String name;
    private int age;
    private List<Workout> workouts;
    private Map<String, Double> weeklyGoals;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
        workouts = new ArrayList<>();
        weeklyGoals = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void addWorkout(Workout workout) {
        workouts.add(workout);
    }

    public List<Workout> getWorkouts() {
        return workouts;
    }

    public void setWeeklyGoal(String workoutType, Double goal) {
        weeklyGoals.putIfAbsent(workoutType, goal);
    }

    public double getTotalDistance() {
        double totalDistance = 0;
        for (Workout workout : workouts) {
            totalDistance += workout.getDistance();
        }
        return totalDistance;
    }

    public double getTotalDuration() {
        double totalDuration = 0;
        for (Workout workout : workouts) {
            totalDuration += workout.getDuration();
        }
        return totalDuration;
    }

    public double getTotalLiftedWeigth() {
        double totalWeightLifted = 0;
        for (Workout workout : workouts) {
            totalWeightLifted += workout.getLiftedWeight();
        }
        return totalWeightLifted;
    }

    public void generateWeeklyReport() {
        System.out.println("Weekly report for " + name + ", age : " + age);
        System.out.println("Total workouts : " + workouts);
        System.out.println("\nTotal distance : " + getTotalDistance() + " km");
        System.out.println("Total duration : " + getTotalDuration() + " min");
        System.out.println("Total lifted weight :" + getTotalLiftedWeigth() + " kg");
    }

    public void checkGoals() {
        for (String workoutType : weeklyGoals.keySet()) {
            double goal = weeklyGoals.get(workoutType);
            String achievement = null;
            switch (workoutType) {
                case RUNNING -> {
                    achievement = (goal <= getTotalDistance() ? " Goal achieved!" : "Goal Failed!");
                    System.out.println("\nThe running distance goal was " + goal + " km. >> " + achievement);
                }
                case YOGA -> {
                    achievement = (goal <= getTotalDuration() ? " Goal achieved!" : "Goal Failed!");
                    System.out.println("The yoga time goal was " + goal + " min. >> " + achievement);
                }
                case WEIGHT_LIFTING -> {
                    achievement = (goal <= getTotalLiftedWeigth() ? " Goal achieved!" : "Goal Failed!");
                    System.out.println("The weight lifting goal was "+goal + " kg. >> " + achievement);
                }
                default -> System.out.println("Unknown workout.");
            }
        }
    }
}
