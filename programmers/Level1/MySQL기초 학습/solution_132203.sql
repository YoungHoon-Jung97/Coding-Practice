
--¹®Á¦ :https://school.programmers.co.kr/learn/courses/30/lessons/132203
SELECT DR_NAME,DR_ID,MCDP_CD,date_format(hire_ymd, '%Y-%m-%d') as HIRE_YMD
FROM DOCTOR 
WHERE MCDP_CD IN ('CS', 'GS')
ORDER BY HIRE_YMD DESC, DR_NAME ASC;