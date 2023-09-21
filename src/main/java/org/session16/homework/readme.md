1. Write a program that uses lambda expressions to filter a list of integers and return only the even numbers. 

2. Write a program that uses lambda expressions to sort a list of strings in alphabetical order. 

3. Write a program that uses lambda expressions to calculate the sum of all the elements in a list of integers.

4. You are given a List<String> representing a list of words. Create a lambda expression to sort the list in alphabetical order. Next, modify your lambda expression to sort the list in reverse alphabetical order.

5. Create a functional interface that takes a list of integers and returns the maximum value from the list. Implement this interface using a lambda expression. Ensure your lambda correctly handles an empty list case.

6. Create a functional interface with a method that takes two strings as input and returns an integer. Implement this interface using a lambda expression to create a custom comparator that compares strings based on their length (not lexicographically).

7. Create a functional interface that takes a string and an integer n as parameters and returns a string. Implement it using a lambda expression that returns the first n characters of the string. If n is larger than the length of the string, it should return the full string.

8. Create a functional interface that takes a List<Integer> and a function that takes an integer as input and returns an integer. Implement this interface using a lambda expression to apply the function to each element in the list, returning a new list with the mapped values.

9. Create a functional interface that takes a list of integers and returns a list of integers. Use a lambda expression to implement this interface, such that it returns a list containing only the odd numbers from the original list.

10. Create a functional interface with a method that takes a List<String> representing first names and returns a List<String> of those names formatted in uppercase. Implement it using a lambda expression.

11. Create a functional interface that is generic and takes a list of generic items and a single generic item, returning a boolean indicating whether the item is in the list. Implement this interface using a lambda expression.

12. Create a functional interface with a method that takes two strings and returns a string. Implement this interface using a lambda expression to create a utility that joins two strings with a space in between.

13. Create a functional interface that takes a single double as a parameter and returns a double. Implement it using a lambda expression to create a utility that returns the square root of the input value.

14. Create a functional interface called PairMaker which takes two parameters of type T and U and returns a Pair object that holds both values. The Pair class should be a generic class that can hold two values of any types. Your task is to implement the PairMaker using a lambda expression to instantiate Pair objects with the given values.

15. Create a functional interface named ListFilter that works with generics. It should have a method that takes a list of elements of type T and a predicate functional interface, applying the predicate to filter elements of the list, returning a new list with elements that satisfy the predicate condition. Implement the ListFilter using a lambda expression and demonstrate its usage with different types of lists and predicates.



16. PDF Resume Builder
    Create a Java program that helps users build a simple resume and export it as a PDF file. The resume should have the following sections:

    Personal Information: Including fields such as Name, Address, Phone Number, and Email.
    Objective: A short paragraph where users can describe their career objectives.
    Education: Including fields such as University Name, Degree, and Graduation Date.
    Work Experience: Including fields such as Company Name, Job Title, Job Description, and Duration.
    Skills: A list where users can add their skills (e.g., Java Programming, Project Management).
    
    Allow users to populate the resume sections from a TXT file. The file should have a clear structure where each line represents a different field or item. 
    After collecting all the necessary details, your program should generate a well-formatted PDF resume with the inputted details.

    Bonus: allow user to add a picture to his resume.
    
    Guidelines:
    To create PDF files in Java, you can use libraries such as iText or Apache PDFBox.
    Focus on creating a clean and professional layout for the resume. Consider elements such as margins, fonts, and bullet points to structure the content effectively.
    Validate the input data to ensure that it meets the necessary format (e.g., valid email format, phone number format).



