
--문제 :https://school.programmers.co.kr/learn/courses/30/lessons/298516
SELECT COUNT(*) AS FISH_COUNT
FROM FISH_INFO 
WHERE DATE_FORMAT(TIME,'%Y') = '2021'