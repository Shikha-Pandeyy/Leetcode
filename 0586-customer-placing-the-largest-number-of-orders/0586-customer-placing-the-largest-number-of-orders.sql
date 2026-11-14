# Write your MySQL query statement below
SELECT customer_number
FROM Orders
GROUP BY customer_number
ORDER by count(order_number) DESC
LIMIT 1;