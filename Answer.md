1. Tell us what kind of test should be conduct (plan and why) to make sure the page is ok.
-->-->-->
There are several test type that can be done in a web app. We need to start from the lowest level, unit-test. Then we move to the API integration test (if any), and finally UI test.
The biggest test as a quantity should be the lowest level, as they has the minimal effort and biggest impact. And it should be run in an early state of development process.
Next, is API integration test; if the pages use API to get data from backend and. This test is very important, as usually all the data, calculation, function, logic are done by backend. Client get those data from API call to backend. All function need to be tested so that everything that occurs in UI, we can roled out more than 50% of it from this test.
Last, we need to run UI test to make sure that no UI issue occurs, i.e.: incoret data display (which should have been test in FE unit-test). In this phase, we focus on business flow and scope, to make sure that user experience is as intended.
We need to prevent any bug and defect occurs even after testing environment deployment. The price of fixing bug and defect in early development is very cheap compare with bug slightly before production or even after production release
Other than test above, we also need to check for simple security check, i.e. Cross-site Scripting (XSS).
Testing on multiple browsers and version, including the mobile web version.



2. Tell us what kind of testcase you want to execute
-->-->-->
- Check all checkboxes are function correctly
- Check radio buttons are function correctly
- Check text area is able to be typed
- Check text field is able to be filled
- Check the scroll is functon corectly
- Check if Submit button will be enable if textfield is filled
- Check populate button is function correctly and able to auto fill the textfield


3. We all know automation can help, show us your test-automation code to test it with BDD Style and Please Impress us by not using Katalon. <BR>
   Please show us your work with integrate it with the CircleCI , and capture the result.
-->-->-->
```
https://circleci.com/gh/7etrahedral/NexusPreTest
```


4. Every new employee at NTUC will have a buddy help him/her to tune in with environment. Every employee have their supervisor and team. Let's say that we have a table of employee where all the information mention earlier is store. The table specification is looks like this:<BR>
| employee_id | employee_name | buddy_id | supervisor_id | team_name |<BR>
your task is to create a query to show:<BR>
| employee_id | employee_name | buddy_name | supervisor_name | team_name |
-->-->-->
```
SELECT A.employee_id, 
A.employee_name, 
B.employee_name AS buddy_name,
C.employee_name AS supervisor_name,
A.team_name
FROM employee A, employee B, employee C
WHERE A.buddy_id = B.employee_id
AND A.supervisor_id = C.employee_id
ORDER BY A.employee_id;
```