# Write your MySQL query statement below
SELECT w.id
FROM Weather w
JOIN Weather m
    ON DATEDIFF(w.recordDate, m.recordDate) = 1
WHERE w.temperature > m.temperature;
