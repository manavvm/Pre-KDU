-- Create the "employee" database
CREATE DATABASE employee;
USE employee;

-- Create the "department" table
CREATE TABLE department 
(
    department_id INT PRIMARY KEY,
    department_name VARCHAR(255)
);

-- Create the "employee" table
CREATE TABLE employee 
(
    employee_id INT PRIMARY KEY,
    employee_name VARCHAR(255),
    salary DECIMAL(10,2),
    department_id INT,
    FOREIGN KEY (department_id) REFERENCES department(department_id)
);

-- Insert synthetic data
INSERT INTO department (department_id, department_name)
VALUES
    (1, 'HR Department'),
    (2, 'Finance Department'),
    (3, 'IT Department');

INSERT INTO employee (employee_id, employee_name, salary, department_id)
VALUES
    (101, 'Ajay', 67000.00, 1),
    (102, 'Sam', 75000.00, 1),
    (103, 'Ayush', 82000.00, 1),
    (104, 'Animesh', 74000.00, 1),
    (105, 'Bhavesh', 91000.00, 2),
    (106, 'Mehak', 85000.00, 2),
    (107, 'Gautam', 72000.00, 2),
    (108, 'Era', 98000.00, 2),
    (109, 'Muskan', 88000.00, 3),
    (110, 'Sana', 71000.00, 3),
    (111, 'Dake', 80000.00, 3),
    (112, 'Alice', 83000.00, 3);

-- Print employee_id, employee_name and department_name
SELECT e.employee_id, e.employee_name, d.department_name FROM employee e
INNER JOIN department d ON e.department_id = d.department_id;

-- Write a Query that prints all the employees and their salaries in descending order of their salary
SELECT employee_name, salary FROM employee
ORDER BY salary DESC;

-- Write a Query that prints the average salary of employees in each department with the department name
SELECT d.department_name, AVG(e.salary) AS average_salary FROM department d
LEFT JOIN employee e ON d.department_id = e.department_id
GROUP BY d.department_id, d.department_name;


