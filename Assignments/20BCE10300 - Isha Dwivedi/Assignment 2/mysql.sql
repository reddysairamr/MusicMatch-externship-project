-- Week 2 Assignment: an example that uses different table and 
-- column names for the UPDATE command, DELETE command, table creation, and performing a JOIN operation

USE practicej;

-- Create a table for employees
CREATE TABLE employees (
  emp_id INT PRIMARY KEY AUTO_INCREMENT,
  emp_name VARCHAR(100),
  emp_email VARCHAR(100)
);

-- Create a table for projects
CREATE TABLE projects (
  project_id INT PRIMARY KEY AUTO_INCREMENT,
  emp_id INT,
  project_name VARCHAR(100),
  project_status VARCHAR(50)
);

-- Insert some sample data into the employees table
INSERT INTO employees (emp_name, emp_email) VALUES
  ('Employee 1', 'employee1@example.com'),
  ('Employee 2', 'employee2@example.com'),
  ('Employee 3', 'employee3@example.com');

-- Insert some sample data into the projects table
INSERT INTO projects (emp_id, project_name, project_status) VALUES
  (2, 'Project A', 'In Progress'),
  (3, 'Project B', 'Completed'),
  (2, 'Project C', 'In Progress');

-- Update an employee's email
UPDATE employees
SET emp_email = 'employeen@gmail.com'
WHERE emp_id = 2;

-- Delete a project
DELETE FROM projects
WHERE project_id = 2;

-- Perform a JOIN operation to retrieve employee and project information
SELECT employees.emp_name, projects.project_name, projects.project_status
FROM employees
JOIN projects ON employees.emp_id = projects.emp_id;
