#!/bin/sh
db_user=hemlock
db_password=carrot
sql_location="`dirname \"$0\"`"
file_name=hemlock

db_name=ignore
if [ -z "$1" ]
then
	db_name=${file_name}
else
	db_name=$1
fi

# create database hemlock;
# CREATE USER 'hemlock'@'localhost' IDENTIFIED BY 'carrot';
# GRANT ALL ON hemlock.* to hemlock@localhost;
# flush privileges;

echo drop database if exists ${db_name} | mysql -u ${db_user} -p${db_password}
echo Database drop. Done.
echo create database ${db_name} | mysql -u ${db_user} -p${db_password}
echo Database create. Done.
mysql -u ${db_user} -p${db_password} ${db_name} < ${sql_location}/${file_name}-structure.sql
echo Structure create. Done.

if test "$file_name" = "$db_name"
then
	mysql -u ${db_user} -p${db_password} ${db_name} < ${sql_location}/${file_name}-data.sql
	echo Data populate. Done.
fi
	

echo Done

