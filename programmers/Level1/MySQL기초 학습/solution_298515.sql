
--¹®Á¦ :https://school.programmers.co.kr/learn/courses/30/lessons/298515
SELECT MAX(IF (LENGTH IS NOT NULL, CONCAT(LENGTH,'cm'),'10cm')) AS MAX_LENGTH
FROM FISH_INFO