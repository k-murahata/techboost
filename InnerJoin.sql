SELECT
    u.first_name,
    u.last_name,
    c.name
FROM
    users u
    INNER JOIN companies c ON u.company_id = c.id
ORDER BY
    u.id;