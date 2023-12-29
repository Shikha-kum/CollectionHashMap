package com.practiseQuestion;

import java.util.HashMap;

public class StudentHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Arrays to store student IDs and marks
        String[] sid = {"s1", "s2", "s3", "s4"}; 
        int[] smarks = {80, 95, 75, 88};

        // HashMap to store student information
        HashMap<String, Integer> studentMap = new HashMap<>();

        // Populate the HashMap with student information
        for (int i = 0; i < sid.length; i++) {
            String studentId = sid[i];
            int studentMark = smarks[i];

            studentMap.put(studentId, studentMark);
        }

        // Print student information
        System.out.println("Student Information:");
        for (String id : studentMap.keySet()) {
            int mark = studentMap.get(id);
            System.out.println("Sid: " + id + ", Smarks: " + mark);
        }

        // Print the size of the data in the HashMap
        System.out.println("Size of the Data: " + studentMap.size());
    }

	}


