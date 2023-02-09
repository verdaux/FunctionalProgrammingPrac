package com.Custom_Classes;

import java.util.Comparator;
import java.util.List;

public class MinMax
{
    public static void main(String[] args)
    {
        List<Course> courses = List.of(new Course("Spring", "Framework", 98, 20000),
                new Course("Spring Boot", "Framework", 95, 18000), new Course("API", "Microservices", 97, 22000),
                new Course("Microservices", "Microservices", 96, 25000),
                new Course("FullStack", "FullStack", 91, 14000), new Course("AWS", "Cloud", 92, 21000),
                new Course("Azure", "Cloud", 99, 21000), new Course("Docker", "Cloud", 92, 20000),
                new Course("Kubernetes", "Cloud", 91, 20000));

        Comparator<Course> compareByNoOfStudentsAndNoOfReviews
                = Comparator.comparing
                (
                        Course::getNoOfStudents
                )
                .thenComparing(
                        Course::getReviewScore
                )
                //.reversed()
                ;
        System.out.println(courses
                .stream()
                .max(compareByNoOfStudentsAndNoOfReviews));

        System.out.println(courses
                .stream()
                .min(compareByNoOfStudentsAndNoOfReviews));

    }
}
