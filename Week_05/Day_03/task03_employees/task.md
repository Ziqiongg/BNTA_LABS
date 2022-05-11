# Task - Employee Records

The major corporation BusinessCorp&#8482; wants to do some analysis of varioius metrics around its employees and have contracted the job out to you. They have provided you with two SQL files, you will need to write the queries which will extract the data they are looking for.

## Setup

- Create a database to run the files against
- Use the `psql -d database -f file` command to run the SQL files
- Before starting to write the queries take some time to look at the data and figure out the relationships between the tables - maybe even draw an ERD to help.

## Tasks

### CTEs

1) Calculate the average salary of all employees

```sql
SELECT AVG(salary)
FROM employees
```

2) Calculate the average salary of the employees in each team (hint: you'll need to `JOIN` and `GROUP BY` here)

```sql
SELECT AVG(salary) AS average_salary, departments.name AS department_name
FROM employees
JOIN departments ON departments.id = employees.department_id
GROUP BY departments.id
```

3) Using a CTE find the ratio of each employees salary to their team average, eg. an employee earning £55000 in a team where the average is £50000 has a ratio of 1.1

```sql

WITH average_department_salary (id, name, average_salary) AS (
SELECT departments.id, departments.name, AVG(salary) AS average_salary
FROM employees
JOIN departments ON departments.id = employees.department_id
GROUP BY departments.id
)



SELECT 
	employees.id, 
	employees.salary,
	employees.salary / average_department_salary.average_salary::FLOAT AS ratio, 
	average_department_salary.name
FROM employees
INNER JOIN average_department_salary
ON average_department_salary.id = employees.department_id



```

4) Find the employee with the highest ratio in Argentina

```sql
WITH average_department_salary (id, name, average_salary) AS (
SELECT departments.id, departments.name, AVG(salary) AS average_salary
FROM employees
JOIN departments ON departments.id = employees.department_id
GROUP BY departments.id

)


SELECT 
	employees.id, 
	employees.salary,
	employees.salary / average_department_salary.average_salary::FLOAT AS ratio, 
	employees.country
FROM employees
INNER JOIN average_department_salary
ON average_department_salary.id = employees.department_id
WHERE employees.country = 'Argentina'
ORDER BY ratio DESC LIMIT 1
```

5) **Extension:** Add a second CTE calculating the average salary for each country and add a column showing the difference between each employee's salary and their country average

```sql
WITH average_salary_country (id, country, average_salary) AS (
SELECT id,country,AVG(salary) OVER(PARTITION BY employees.country) AS average_salary
FROM employees
)


SELECT 
	employees.id, 
	employees.salary, 
	employees.country,
	average_salary_country.average_salary AS country_ave_salary,
	average_salary_country.average_salary - employees.salary AS gap
FROM employees
INNER JOIN average_salary_country
ON average_salary_country.id = employees.id
```

---

### Window Functions

1) Find the running total of salary costs as the business has grown and hired more people

```sql
SELECT SUM(salary)
FROM employees
```

2) Determine if any employees started on the same day (hint: some sort of ranking may be useful here)

```sql
SELECT 
id,
first_name,
last_name,
start_date,
RANK() OVER (ORDER BY start_date ROWS 9 PRECEDING)
FROM employees


```

3) Find how many employees there are from each country

```sql
SELECT 
country,
COUNT(*) 
FROM employees
GROUP BY country
```

4) Show how the average salary cost for each department has changed as the number of employees has increased

```sql
SELECT 
AVG(employees.salary),
departments.id,
departments.name
FROM employees
INNER JOIN departments
ON departments.id = employees.department_id
GROUP BY departments.id

```

5) **Extension:** Research the `EXTRACT` function and use it in conjunction with `PARTITION` and `COUNT` to show how many employees started working for BusinessCorp&#8482; each year. If you're feeling adventurous you could further partition by month...

```sql
<!--Copy solution here-->
```

---

### Combining the two

1) Find the maximum and minimum salaries

```sql
<!--Copy solution here-->
```

2) Find the difference between the maximum and minimum salaries and each employee's own salary

```sql
<!--Copy solution here-->
```

3) Order the employees by start date. Research how to calculate the **median** salary value and the **standard deviation** in salary values and show how these change as more employees join the company

```sql
<!--Copy solution here-->
```

4) Limit this query to only Research & Development team members and show a rolling value for only the 5 most recent employees.

```sql
<!--Copy solution here-->
```

