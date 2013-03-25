JSH
===
JSF 2 (inculding primefaces), Spring 3 and hibernate 4 integration mini project.

The code itself is found on Internet (<a href="http://www.javacodegeeks.com/2012/04/jsf-2-primefaces-3-spring-3-hibernate-4.html">From here</a>). 
and here is the sql code of the database: 
CREATE TABLE USER (  id int(11) NOT NULL,   name varchar(45) NOT NULL,   surname varchar(45) NOT NULL,   PRIMARY KEY (`id`));
and of course don't forget to update the application-context.xml file with your correvt DB credentials.

If u r using Eclipse for developing,
eclipse may show an error once u clone this porject. running a maven update to the porject would fix that.
And make sure that u have the m2e-wtp add-in installed.
Otherwise "mvn install" won't copy your classpath's dependencies to the web deployement lib directory.
If u want to build from the CMD, run "mvn ecilpse:eclipse -Dwtpversion=2".
Note that all the dependencies will be listed direclty under the root folder of the project, not under the "library" node under your classpath.
Still, it will build well.
