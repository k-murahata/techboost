SELECT employee.first_name, employee.last_name, companies.name FROM users employee INNER JOIN companies ON employee.company_id = companies.id ORDER BY employee.id;
