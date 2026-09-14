# Write your MySQL query statement below
select t1.x,t1.y,t1.z,(case when ((x<0 or y<0 or z<0) or (x+y<=z or y+z<=x or x+z<=y))  then 'No' else "Yes" end)as triangle from triangle t1  