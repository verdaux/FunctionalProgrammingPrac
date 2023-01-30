package com.Custom_Classes;

import java.util.List;
import java.util.function.Predicate;

public class CourseCustomClassTest
{
    public static void main(String[] args)
    {
        List<Course> courses = List.of(new Course("Spring", "Framework", 98, 20000),
                new Course("Spring Boot", "Framework", 95, 18000), new Course("API", "Microservices", 97, 22000),
                new Course("Microservices", "Microservices", 96, 25000),
                new Course("FullStack", "FullStack", 91, 14000), new Course("AWS", "Cloud", 92, 21000),
                new Course("Azure", "Cloud", 99, 21000), new Course("Docker", "Cloud", 92, 20000),
                new Course("Kubernetes", "Cloud", 91, 20000));

        Predicate<Course> reviewScoreAbove95 = course -> course.getReviewScore() > 95;
        Predicate<Course> reviewScoreAbove90 = course -> course.getReviewScore() > 90;
        Predicate<Course> reviewScoreBelow90 = course -> course.getReviewScore() < 90;

        boolean areAllReviewsAbove90 = courses
                .stream()
                .allMatch(reviewScoreAbove90);

        boolean areNoneReviewsAbove95 = courses
                .stream()
                        .noneMatch(reviewScoreAbove95);

        boolean areNoneScoreBelow90 = courses
                .stream()
                        .noneMatch(reviewScoreBelow90);

        System.out.println("Are all reviews above 90? "+(areAllReviewsAbove90?"Yes":"No"));
        System.out.println("Are none reviews above 95? "+(areNoneReviewsAbove95?"Yes":"No"));
        System.out.println("Are none reviews below 90? "+(areNoneScoreBelow90?"Yes":"No"));
    }

}
