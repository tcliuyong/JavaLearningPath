#!/bin/bash
. /etc/profile
curtime=`date "+%Y-%m-%d"`
echo 'curtime'
pretime=`date -d"1 day ago" +"%Y-%m-%d"`
picbackup="pic-"$curtime
filebackup="file-"$curtime
prepicbackup="pic-"$pretime
prefilebackup="file-"$pretime
cp -R /home/apache-tomcat-7.0.68/webapps/ROOT/umeditor/jsp/upload /home/backup/$picbackup
echo $curtime 'picture copy success'>>/home/backup/log
cp -R /home/apache-tomcat-7.0.68/webapps/ROOT/uploadFile /home/backup/$filebackup
echo $curtime 'file copy success'>>/home/backup/log
if [  -d "/home/backup//$prepicbackup" ]; then
  echo $curtime 'pic delete success'>>/home/backup/log
  rm -R /home/backup/$prepicbackup
fi
if [  -d "/home/backup/$prefilebackup" ]; then
  echo "haha"
  echo $curtime 'file delete success'>>/home/backup/log
  rm -R /home/backup/$prefilebackup
fi
