
--���� :https://school.programmers.co.kr/learn/courses/30/lessons/133025
SELECT FLAVOR
FROM FIRST_HALF  
WHERE FLAVOR IN (
    SELECT FLAVOR 
    FROM ICECREAM_INFO 
    WHERE INGREDIENT_TYPE = 'fruit_based'
)
  AND TOTAL_ORDER > 3000
ORDER BY TOTAL_ORDER DESC;