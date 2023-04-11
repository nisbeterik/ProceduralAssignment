# ProceduralAssignment
This is the first programming assignment i did as a first year Software Engineering student. It's a simple application for doing operations on student grades with an extra hashtag-finder algorithm.


**ASSIGNMENT PROMPT**

Software Engineering and Management
DIT043 - Object-oriented programming

Assignment 1 - Autumn 2022

The assignment consists of an implementation of a basic calculation and string manipulation system. Please follow the instructions below and complete each task to complete the assignment. Details on submission and grading are provided in Canvas. The goal is to practice the various concepts of procedural programming:  basic data types, control flow, arrays, arithmetic operations, and input/output. If you have any questions, contact your teachers and TAs.

Note: You are expected to use arrays in Java. Using Lists is not allowed in this assignment.

Task 1: Reading and storing numbers

Consider that you are creating a system for entering the scores of students in a course. Initially, we can register up to 7 students. Your first task is to prompt the user (which in this case is the course instructor) to enter 7 integer scores. For every prompt, you should print “Enter the score for the <n>st/nd/rd/th student”, n being the index number of the score to be added (n = 1…7).

When printing the prompt message, you have to use the proper “ordinal indicators”. Ordinal indicators are the suffixes to the numbers, for example (1-)st, (2-) nd,  (3-)rd, and (4-)th. The ordinal indicator for all numbers between 4 and 10 is “th”.

The scores should be stored in the order in which the user types then, and ask for the next score. Once all the 7 scores have been added, print “Thank you for your input. Your entered scores are: ” and, in a new line, a comma-separated list of scores that the user just entered (see below).

Note 1: You can assume that the user will type digits, so you don’t need to verify if the value is an integer.

Note 2: The minimum score value is 0, and the maximum score can be 100. Score values less than 0 and greater than 100 should not be allowed. In those cases, print the error message “Error - Input out of bound. Score can only be between 0  and 100.”. After printing, prompt the user to enter the score again in such an event (note that you should not return to the first score being typed).

For illustrating the tasks below, assume that the user types the following values:

Enter the score for the 1st student 63
Enter the score for the 2nd student 100
Enter the score for the 3rd student -50
Error - Input out of bound. Score can only be between 0  and 100.
Enter the score for the 3rd student 18
Enter the score for the 4th student 25
Enter the score for the 5th student 100
Enter the score for the 6th student 25
Enter the score for the 7th student 95
Thank you for your input. Your entered scores are: 
63, 100, 18, 25, 100, 25, 95



Task 2: Calculating mean

Your next task is to calculate the arithmetic mean, or simply mean, of the student scores. The mean or average is the sum of all numbers, divided by the input size (in this case, the number of students registered). It is often used as a rough estimate over the entire dataset.

Please note that the mean can have decimals. In that case, you should print the mean with a precision of 2 decimal points, by rounding it off. For example, if the mean is 73.4237, it will be rounded off to 73.42. If it is 60.3281, it will be rounded off to 60.33. After calculating the mean, you should  print it out in the following format: “The mean of the numbers is <m>”, m being the mean of the numbers.

Tip: There are multiple ways to round a decimal number in Java. We recommend using the System.out.printf command. Be careful to use Locale.ENGLISH to make sure the decimal symbol is a dot, instead of a comma (use the command: Locale.setDefault(Locale.ENGLISH)).

Example from Task 1:

The mean of the numbers is 60.86



Task 3: Finding the two highest scores and two lowest scores

Your task is to find and print the two highest and the two smallest scores registered. You are not allowed to change the order in which the grades were registered. Print the results in the following format:

“The two lowest scores provided are <lowest>, and <second_lowest>”
“The two highest scores provided are <highest>, and <second_highest>”

Replace the content between “< >”  with the respective value found. 

Example from Task 1:
The two lowest scores provided are 18, and 25
The two highest scores provided are 100, and 100



Task 4: Finding the highest score and its position

Your task is to find and print the highest score and the position in which it was registered. In case there is a tie (i.e., more than one highest score), you should print the position of the first occurrence. Similarly to Task 1, you must print the right suffix for the position found. Print in the following format:

“The highest score is <value> and belongs to the <position> st/nd/rd/th student”

Example from Task 1:
The highest score is 100 and belongs to the 2nd student



Task 5: Collecting all hashtags from a given sentence

Social media now works on hashtags. Social media platforms use hashtags to define the popularity of any topic or person (e.g., celebrities, social issues, and sports predictions etc). Hashtags are an easy way to tag your content with the key word you want to identify and highlight it with. Note: For this assignment, we see hashtag as a string that starts with the character “#” and is between white spaces (or until the end of line).

Your task is to prompt the user to write a sentence and then print all hashtags written by them. Print the hashtags in the order that they show up in the sentence, even if they are repeated. Print the hashtags in the following format: 

“Hashtags found: <h1 h2 ... hn>”, h1..hn being the hashtags. Do not include empty space in the last hashtag printed, or if there is only one hashtag in the post.

If no hashtags were found, you should print: “No hashtags were typed.”

Example 1:
Type your post: “Enjoying the #sunshine travel #letsgettanned #sunshine. Go out while it’s still #bright”

Hashtags found: #sunshine #letsgettanned #sunshine. #bright

Example 2:
Type your post: “We must #respect each other.”

Hashtags found: #respect

Example 3:
Type your post: “I am bored today.”

No hashtags were typed

Example 4:
Type your post: “I am having a sh#&*! Day. =(”

No hashtags were typed

Example 5:
Type your post: “Started using #social#media today. Feels #good.”

Hashtags found: #social#media #good.






Task 6: All coming together in a menu

All features described in the text above should be accessed via a Main Menu, using the template below. Note that once you begin the program, the user should still be prompted to type the students’ scores (described in Task 1). After that, you present the menu below.

Typing the number of the option should take the user to the corresponding Task described above. After completing the corresponding task, the user should return to the Main Menu.

Menu Template:
Welcome to the menu. Choose one of the options below:
Register new scores for students.
Calculate the mean of the entered scores.
Find the two highest and two lowest scores.
Find the highest score and its position.
Collect hashtags from a post.
To exit.

Type your option:


When typing option 6, present the following message to the user: “Thank you for using our grading system. Have a nice day!”.

Only options between 1 and 6 are acceptable. If the user enters a value out of the range above, print an error message saying “Error - Invalid value. Please type between 1 and 6”. Once the user provides a valid option, proceed to the tasks as specified above.

Note: If the user selects option 1, the new sequence of scores will overwrite the previous one.

Task 7: Refactoring your Scanner into its own class file (Grade 4)

One way to use the Scanner more efficiently and elegantly is to create your own class file for the Scanner. You can create your own functions that reuse the corresponding Scanner functionalities. For this task, you must isolate the Scanner in its own class file name IOScanner. A tip is to create the IOScanner class in a way that you can call the input methods from your main program.


Task 8: Refactoring all tasks into subroutines (Grade 5)

Subroutines, as you recall, and self-contained processing units, which (may or may not) take input, perform some processing on it, and (may or may not) return an output. In your assignment, all 4 tasks comprise stand-alone functionality, and as such, they can be refactored into subroutines. To achieve this, you should create functions for each task. Do not use names such as “task1()”, or “task2()”; remember to use descriptive names for your functions such as: readGrade(), calculateMean(), collectHashtags(), etc.
