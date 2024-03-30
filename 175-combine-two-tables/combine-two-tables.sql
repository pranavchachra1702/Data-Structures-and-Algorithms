# Write your MySQL query statement below
SELECT firstName, lastName, city, state
FROM Person LEFT JOIn Address
ON Person.PersonId = Address.PersonId