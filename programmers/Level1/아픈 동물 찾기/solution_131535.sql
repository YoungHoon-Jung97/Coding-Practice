
--¹®Á¦ :https://school.programmers.co.kr/learn/courses/30/lessons/131535
SELECT COUNT(*) AS USERS
FROM USER_INFO 
WHERE AGE IS NOT NULL AND JOINED >='2021-01-01'
    AND JOINED <='2021-12-31' AND 
    AGE BETWEEN 20 AND 29;