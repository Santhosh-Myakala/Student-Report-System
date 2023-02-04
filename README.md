# Student-Report-System

This java application displays the following reports of students:
      - Average Percentage of whole class in recent semester
      - Average marks of students in a subject
      - Adds data of students semester wise
     
 This application has 2 data objects:
 1) Student:
    - Description: manages single student data
    Properties: 
        Fields: studentId, studentName, marks ( for every subject of each semester )
        Methods:
            - calculatePercentage: returns avgerage of all subjects for given semester
            - subjectSum: returns sum of marks of given subject across all semesters of a student
            
 2) StudentDAO:
     - Description: service that manages data of all students
    Properties:
        Fields: List of students, List of semesters
        Methods:
            - addStudent: add incoming student to list of students
            - addMarks: add marks of given subject of given semester
            - getClassAverage: return average percentage of whole class in recent semester
            - getSubjectAverage: returns average marks of all students in a subject
    
