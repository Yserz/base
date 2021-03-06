#!/bin/bash

ls -la

/usr/local/bin/mvn clean install -DskipTests=true -Dmaven.javadoc.skip=true -Dbase.database.driver.classname=driver -Dbase.database.url=adress -Dbase.database.username=username -Dbase.database.password=password -Popenshift -B -V

# Use war name 'ROOT.war' if you would like to deploy to the root path of your server
cp webapps/ROOT.war binary/dependencies/jbossews/webapps/ROOT.war
cp -r .openshift/* binary/repo/.openshift

cd binary
tar -czvf ../webapps/binary.tar.gz ./
cd ..
rhc deploy -a <app_name> webapps/binary.tar.gz --no-force-clean-build --no-hot-deploy