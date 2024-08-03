RU text
Stream API и Optional
Цель сегодняшней домашней работы — научиться менять реализацию через циклы на Steam API.

Внимание! В этой домашней работе вам понадобятся данные из курсовой.
Среднее время выполнения: 60 минут.
Шаг 1. Добавить в поле Employee поля «Зарплата» и «Отдел» из курсовой работы.
Шаг 2. В текущий проект на Spring перенести методы работы с отделами из курсовой работы. 
Шаг 3. Заменить реализацию через циклы на Stream API. Написать новый контроллер и сервис, которые будут:
Возвращать сотрудника с максимальной зарплатой на основе номера отдела, который приходит в запрос из браузера.
/departments/max-salary?departmentId=5
​
 Возвращать сотрудника с минимальной зарплатой на основе номера отдела.
 /departments/min-salary?departmentId=5 
​
Возвращать всех сотрудников по отделу. 
/departments/all?departmentId=5
​
Возвращать всех сотрудников с разделением по отделам.
 /departments/all

 ENG text
 Stream API and Optional
The purpose of today's homework is to learn how to change the implementation through loops on the Steam API.

Attention! In this homework, you will need data from the coursework.
Average execution time: 60 minutes.
Step 1. Add the "Salary" and "Department" fields from the course work to the Employee field.
Step 2. To transfer the methods of working with departments from the course work to the current project on Spring. 
Step 3. Replace the implementation via loops with the Steam API. Write a new controller and service that will:
Return an employee with the maximum salary based on the department number that comes in the request from the browser.
/departments/max-salary?departmentId=5
​
 To return an employee with a minimum salary based on the department number.
 /departments/min-salary?departmentId=5 
​
Return all employees in the department. 
/departments/all?departmentId=5
​
Return all employees divided by departments.
 /departments/all
