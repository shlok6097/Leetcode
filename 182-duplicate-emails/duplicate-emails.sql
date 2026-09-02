-- Write your PostgreSQL query statemen

select Email As "Email"
from person
group by Email
having count(*) >1;
